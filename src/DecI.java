
public class DecI extends DecoratorTag{
	HTML wrappedObj;

	public DecI(HTML html) {
		wrappedObj = html;
	}

	public String fullHTML() {
	StringBuilder sb = new StringBuilder();
	sb.append("<i>");
	sb.append(wrappedObj.fullHTML());
	sb.append("</i>");
	
	return sb.toString();
	}
}
