package sepa;



import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class Amt {

	@XmlElement(name="InstdAmt")
	private List <Instdamt> instdamt;
	
	public Amt(){
		instdamt = new ArrayList <Instdamt>();
	}

	public List<Instdamt> getInstdamt() {
		return instdamt;
	}

	public void setInstdamt(Instdamt instdamt) {
		this.instdamt.add(instdamt);
	}

	@Override
	   public String toString() {
	      return "Kolicina i valuta= "+instdamt;
	   }

}
