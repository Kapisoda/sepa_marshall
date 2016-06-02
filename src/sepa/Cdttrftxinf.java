package sepa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Cdttrftxinf {
	
	@XmlElement(name= "PmtId")
	private List <Pmtid> pmtid;
	
	
	@XmlElement(name="Amt")
	private List <Amt> amt;
	
	@XmlElementWrapper(name="Cdtr")
	@XmlElement(name="Nm")
	private List <String> name;
	
	
	@XmlElement(name="CdtrAcct")
	private List <CreditorAccount> creditorAccount;
	
	

	public Cdttrftxinf(){
		pmtid = new ArrayList<Pmtid>();
		amt = new ArrayList <Amt>();
		name = new ArrayList <String>();
		creditorAccount = new ArrayList<CreditorAccount>();
		
	}
	
	
	

	public List<CreditorAccount> getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(CreditorAccount creditorAccount) {
		this.creditorAccount.add(creditorAccount);
	}

	public List<Amt> getAmt() {
		return amt;
	}

	public void setAmt(Amt amt) {
		this.amt.add(amt);
	}

	public List<String> getName() {
		return name;
	}

	public void setName(String name) {
		this.name.add(name);
	}

	public List<Pmtid> getPmtid() {
		return pmtid;
	}

	public void setPmtid(Pmtid pmtid) {
		this.pmtid.add(pmtid);
	}
	
	@Override
	   public String toString() {
	      return "Cdttrftxinf="+pmtid+System.lineSeparator()+
	    		  "  Amount="+amt+System.lineSeparator()+
	    		  " name="+name +System.lineSeparator()+
	    		  "creditorAccount="+ creditorAccount;
	   }

}
