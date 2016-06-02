package sepa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class CreditorAccount {
	@XmlElementWrapper(name="Id")
	@XmlElement(name="IBAN")
	private List <String> iban;
	
	public CreditorAccount(){
		iban = new ArrayList <String>();
	}

	public List<String> getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban.add(iban);
	}
	
	@Override
	   public String toString() {
	      return "IBAN="+iban;
	   }
	
}
