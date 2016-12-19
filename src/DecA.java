public class DecA extends DecoratorTag{
	HTML wrappedObj;
	String href;
	
	public DecA(HTML wrappedObj) {
		this.wrappedObj = wrappedObj;
	}
	
	public DecA(HTML wrappedObj, String href) {
		this.wrappedObj = wrappedObj;
		this.href = href;
	}

	@Override
	public String fullHTML() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("<a");
		if(href != null){
			sb.append(" href=\"");
			sb.append(href);
			sb.append("\"");
		}
		sb.append(">");
		sb.append(wrappedObj.fullHTML());
		sb.append("</a>");
		
		return sb.toString();
				
	}
}