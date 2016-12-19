
public class DecStrong extends DecoratorTag {
	HTML wrappedObj;

	public DecStrong(HTML html) {
		wrappedObj = html;
	}

	public String fullHTML() {
	StringBuilder sb = new StringBuilder();
	sb.append("<strong>");
	sb.append(wrappedObj.fullHTML());
	sb.append("</strong>");
	
	return sb.toString();
	}
}
