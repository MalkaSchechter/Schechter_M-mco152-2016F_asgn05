
public class DecSmall extends DecoratorTag{
	HTML wrappedObj;

	public DecSmall(HTML html) {
		wrappedObj = html;
	}

	public String fullHTML() {
	StringBuilder sb = new StringBuilder();
	sb.append("<small>");
	sb.append(wrappedObj.fullHTML());
	sb.append("</small>");
	
	return sb.toString();
	}
}
