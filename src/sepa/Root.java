package sepa;



import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "Document")

public class Root {
	
	@XmlElement(name ="CstmrCdtTrfInitn")
	private List <Cstmrcdttrfinitn> cstmrcdttrfinitn;
	
	public Root() {
		cstmrcdttrfinitn = new ArrayList<Cstmrcdttrfinitn>();
	}

	public List<Cstmrcdttrfinitn> getCstmrcdttrfinitn() {
		return cstmrcdttrfinitn;
	}

	public void setCstmrcdttrfinitn(Cstmrcdttrfinitn cstmrcdttrfinitn) {
		this.cstmrcdttrfinitn.add(cstmrcdttrfinitn);
	}

	@Override
	   public String toString() {
	      return "" + cstmrcdttrfinitn + "";
	   }
	
	/*@XmlElementWrapper(name="CstmrCdtTrfInitn")
	@XmlElement(name="GrpHdr") 
	List<Grphdr> grphdry;

	@XmlElement(name= "PmtInf")
	List <PmtInf> pmtinf;

	public List<PmtInf> getPmtinf() {
		return pmtinf;
	}

	public void setPmtinf(List<PmtInf> pmtinf) {
		this.pmtinf = pmtinf;
	}

	public List<Grphdr> getGrphdry() {
		return grphdry;
	}

	public void setGrphdry(List<Grphdr> grphdry) {
		this.grphdry = grphdry;
	}
	*/

}
