package sepa;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;


import org.w3c.dom.Document;

public class demo {
	public static void main(String[] args) throws Exception {
		
		try{
			
		
		JAXBContext context = JAXBContext.newInstance(Root.class);
	
		 Marshaller m = context.createMarshaller();
		 m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 
		 Date date = new Date();
		 
		 SimpleDateFormat msgId_ft = new SimpleDateFormat("yyyyMMdd");
		// System.out.println("UN" + msgId_ft.format(date));
		 
		 SimpleDateFormat creDtTm_ft1 = new SimpleDateFormat("yyyy-MM-dd");
		 SimpleDateFormat creDtTm_ft2 = new SimpleDateFormat("HH:mm:ss");
		// System.out.println(creDtTm_ft1.format(date)+"T"+creDtTm_ft2.format(date)+"Z");
		
		Root root = new Root();
		Cstmrcdttrfinitn cst = new Cstmrcdttrfinitn();
		Grphdr groupHeader = new Grphdr();
		PmtInf paymentInformation = new PmtInf();
		Dbtracct iban = new Dbtracct();
		Cdttrftxinf nalog = new Cdttrftxinf();
		Pmtid informacijeNaloga = new Pmtid();
		Amt kolicinaValuta = new Amt();
		Instdamt vrijednostiKolicinaValuta = new Instdamt();
		CreditorAccount ibanNaloga = new CreditorAccount();
		// pocetak Headera
		groupHeader.setMsgid("UN"+ msgId_ft.format(date)); // Identifikacijska poruka
		groupHeader.setNboftxs("3"); // broj naloga
		groupHeader.setCredttm(creDtTm_ft1.format(date)+"T"+creDtTm_ft2.format(date)+"Z"); // datum
		groupHeader.setNm("Marko"); //ime platitelja
		//kraj headera
		
		// Pocetak Payment Information-a
		paymentInformation.setNm("Filip");
		paymentInformation.setPmtinfid("Uplata kredita");
		paymentInformation.setPmtmtd("TRF");
		paymentInformation.setReqdexctndt(creDtTm_ft1.format(date));;
	
		iban.setIban("HR6523300031100205901");
		
		paymentInformation.setDbtracct(iban);
		
		//pocetak Naloga
		informacijeNaloga.setEndtoendid("kredit za lizaljku"); // endtoendId postavljanje
		nalog.setPmtid(informacijeNaloga);
		nalog.setName("Hrvoje");
		
		vrijednostiKolicinaValuta.setKolicina(12.12); //vrijednost unutar Amt-a
		vrijednostiKolicinaValuta.setVrijednost("HRK"); //valuta unutar Amt-a
		kolicinaValuta.setInstdamt(vrijednostiKolicinaValuta); //stavljanje u listu kolicinaValuta
		nalog.setAmt(kolicinaValuta); //postavljanje u nalog
		ibanNaloga.setIban("HR6523300031100205901"); //Iban 
		nalog.setCreditorAccount(ibanNaloga); // postavljanje ibanNaloga u nalog
		paymentInformation.setCdttrftxinf(nalog); // postavljanje naloga u payment Information-a
		
		cst.setGrphdry(groupHeader);
		cst.setPmtinf(paymentInformation);
		root.setCstmrcdttrfinitn(cst);
		 
		 File file = new File("C:/build.xml");
	
	        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI); 
	        Schema schema = sf.newSchema(new File("res/validation.xsd")); 

		 m.setSchema(schema);
		 m.setEventHandler(new ValidationHandler());
		 m.marshal(root, System.out);
		 m.marshal(root, file);
		 
		 
		}catch (RuntimeException e){
			infoBox("Došlo je do greške u XML datoteci", "XML ERROR");
		}
	
			}
	
	public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
		
	}
