import javax.management.InvalidAttributeValueException;

public class ConcreteH extends HTML{
	String innerText, id, name;
	int num;
	

	public ConcreteH(String innerText, int num, String id, String name) throws InvalidAttributeValueException {
		if(!(num >= 1 && num <= 6)){
			throw new InvalidAttributeValueException();
		}
		this.innerText = innerText;
		this.num = num;
		this.id = id;
		this.name = name;
	}
	
	
	public ConcreteH(String innerText, int num) throws InvalidAttributeValueException {
		if(!(num >= 1 && num <= 6)){
			throw new InvalidAttributeValueException();
		}
		this.innerText = innerText;
		this.num = num;
	}

	@Override
	public String fullHTML() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<h");
		sb.append(num);
		if(id != null){
			sb.append(" id=\"");
			sb.append(id);
			sb.append("\"");
		}
		if(name != null){
			sb.append(" name=\"");
			sb.append(name);
			sb.append("\"");
		}
		sb.append(">");
		if(innerText != null){
			sb.append(innerText);
		}
		sb.append("</h");
		sb.append(num);
		sb.append(">");
		
		return sb.toString();
	}
}
