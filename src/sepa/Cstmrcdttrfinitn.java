package sepa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)

public class Cstmrcdttrfinitn {
	

	@XmlElement(name = "GrpHdr")
	private List <Grphdr> grphdry;
	
	@XmlElement(name = "PmtInf")
	private List <PmtInf> pmtinf;

	public Cstmrcdttrfinitn(){
		grphdry = new ArrayList<Grphdr>();
		pmtinf = new ArrayList<PmtInf>();
	}
	
	
	public List<Grphdr> getGrphdry() {
		return grphdry;
	}

	public void setGrphdry(Grphdr grphdry) {
		this.grphdry.add(grphdry);
	}

	public List<PmtInf> getPmtinf() {
		return pmtinf;
	}

	public void setPmtinf(PmtInf pmtinf) {
		this.pmtinf.add(pmtinf);
	}
	
	@Override
	   public String toString() {
	      return "" + grphdry +  System.lineSeparator()+  System.lineSeparator() + pmtinf +"";
	   }

}
