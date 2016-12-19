
public class DecU extends DecoratorTag {
	HTML wrappedObj;

	public DecU(HTML html) {
		wrappedObj = html;
	}

	public String fullHTML() {
	StringBuilder sb = new StringBuilder();
	sb.append("<u>");
	sb.append(wrappedObj.fullHTML());
	sb.append("</u>");
	
	return sb.toString();
	}
			
}

