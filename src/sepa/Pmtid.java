package sepa;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Pmtid {
	
	@XmlElement(name = "InstrId")
	private List <String> instrid;

	@XmlElement(name = "EndToEndId")
	private List <String> endtoendid;
	
	public Pmtid(){
		instrid = new ArrayList<String>(); 
		endtoendid = new ArrayList<String>(); 
	}

	public List<String> getInstrid() {
		return instrid;
	}

	public void setInstrid(String instrid) {
		this.instrid.add(instrid);
	}

	public List<String> getEndtoendid() {
		return endtoendid;
	}

	public void setEndtoendid(String endtoendid) {
		this.endtoendid.add(endtoendid);
	}
	
	@Override
	 public String toString() {
	      return "Pmtid=    InstrId"+instrid+System.lineSeparator()+
	    		  "EndToEndId="+endtoendid;
	   }
}
