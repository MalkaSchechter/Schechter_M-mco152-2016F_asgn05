import javax.management.InvalidAttributeValueException;

public class Main {

	public static void main(String[] args){
		HTML anHTML = new ConcreteDiv("Touro");
		
		anHTML = new DecStrong(anHTML);
		anHTML = new DecA(anHTML, "www.touro.edu");
		anHTML = new DecI(anHTML);
		
		System.out.println(anHTML.fullHTML());
		
		
		HTML anotherHTML = new ConcreteInput("Text", "button", "action", "onclick", "javascript:alert('action')");

		anotherHTML = new DecSmall(anotherHTML);
		anotherHTML = new DecEM(anotherHTML);

	System.out.println(anotherHTML.fullHTML());
	
	
	try {
		HTML aThirdHTML = new ConcreteH("Some Text", 1,  "idText", null);
		aThirdHTML = new DecU(aThirdHTML);
		aThirdHTML = new DecEM(aThirdHTML);
		aThirdHTML = new DecSmall(aThirdHTML);
		aThirdHTML = new DecA(aThirdHTML);
		
		System.out.println(aThirdHTML.fullHTML());
		
	} catch (InvalidAttributeValueException e) {
		System.out.println(e.getMessage());
	}
	
	}
	
	
}