package sepa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class PmtInf {
	@XmlElement(name = "PmtInfId")
	private String pmtinfid;
	
	@XmlElement(name = "PmtMtd")
	private String pmtmtd;
	
	@XmlElement(name ="ReqdExctnDt")
	private String reqdexctndt;
	
	@XmlElementWrapper(name= "Dbtr")
	@XmlElement(name = "Nm")
	private List <String> nm;
	
	@XmlElement(name = "DbtrAcct")
	private List <Dbtracct> dbtracct;
	
	@XmlElementWrapper(name= "DbtrAgt")
	@XmlElement(name= "FinInstnId")
	private List <String> fininstnid;
	
	@XmlElement(name="CdtTrfTxInf")
	private List <Cdttrftxinf> cdttrftxinf;

	
	
	
	public PmtInf() {
		nm = new ArrayList<String>();
		dbtracct = new ArrayList<Dbtracct>();
		fininstnid = new ArrayList<String>();
		cdttrftxinf = new ArrayList<Cdttrftxinf>();
		
		fininstnid.add("");
	}
	

	
	
	





	public String getReqdexctndt() {
		return reqdexctndt;
	}



	public void setReqdexctndt(String reqdexctndt) {
		this.reqdexctndt = reqdexctndt;
	}










	public List<Cdttrftxinf> getCdttrftxinf() {
		return cdttrftxinf;
	}

	public void setCdttrftxinf(Cdttrftxinf cdttrftxinf) {
		this.cdttrftxinf.add(cdttrftxinf);
	}

	
	
	public String getPmtinfid() {
		return pmtinfid;
	}

	public void setPmtinfid(String pmtinfid) {
		this.pmtinfid = pmtinfid;
	}

	
	
	public String getPmtmtd() {
		return pmtmtd;
	}

	public void setPmtmtd(String pmtmtd) {
		this.pmtmtd = pmtmtd;
	}

	
	
	public List<String> getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm.add(nm);
	}

	
	
	public List<Dbtracct> getDbtracct() {
		return dbtracct;
	}

	public void setDbtracct(Dbtracct dbtracct) {
		this.dbtracct.add(dbtracct);
	}
	
	
	
	
	public List<String> getFininstnid() {
		return fininstnid;
	}
	
	@Override
	   public String toString() {
	      return "PmtInf="+ System.lineSeparator()+" PmtInfId=" + pmtinfid +  
	    		  System.lineSeparator()+"pmtmtd=" +pmtmtd+  
	    		  System.lineSeparator()+"dbtracct=" +nm+
	    		  System.lineSeparator() +dbtracct+
	    		  System.lineSeparator()+fininstnid+
	    		  System.lineSeparator()+cdttrftxinf;
	   }

}
