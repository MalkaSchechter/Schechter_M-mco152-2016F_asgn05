
public class DecEM extends DecoratorTag{
	HTML wrappedObj;

	public DecEM(HTML html) {
		wrappedObj = html;
	}

	public String fullHTML() {
	StringBuilder sb = new StringBuilder();
	sb.append("<em>");
	sb.append(wrappedObj.fullHTML());
	sb.append("</em>");
	
	return sb.toString();
	}
}
