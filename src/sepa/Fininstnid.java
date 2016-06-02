package sepa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Fininstnid {

	@XmlElement(name="BIC")
	private List <String> bic;
	
	public Fininstnid(){
		bic = new ArrayList<String>();
	}

	public List<String> getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic.add(bic);
	}
	
	@Override
	   public String toString() {
	      return "BIC="+bic;
	}
	
}
