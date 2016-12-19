public class ConcreteInput extends HTML {
	String innerText, id, name, type, event, doOnEvent,  value;

	
	
	public ConcreteInput(String innerText, String type, String value, String event, String doOnEvent) {
		this.innerText = innerText;
		this.type = type;
		this.event = event;
		this.doOnEvent = doOnEvent;
		this.value = value;
	}
	
	public ConcreteInput(String innerText, String id, String name, String type, String value, String event, String doOnEvent) {
		this.innerText = innerText;
		this.id = id;
		this.name = name;
		this.type = type;
		this.event = event;
		this.doOnEvent = doOnEvent;
		this.value = value;
	}

	@Override
	public String fullHTML() {
		StringBuilder sb = new StringBuilder();

		sb.append("<input");
		if (id != null) {
			sb.append(" id=\"");
			sb.append(id);
			sb.append("\"");
		}
		if (name != null) {
			sb.append(" name=\"");
			sb.append(name);
			sb.append("\"");
		}

		if (type != null) {
			sb.append(" type=\"");
			sb.append(type);
			sb.append("\"");
		}
		if (value != null) {
			sb.append(" value=\"");
			sb.append(value);
			sb.append("\"");
		}
		if(event != null){
			sb.append(" ");
			sb.append(event);
			sb.append("=\"");
			sb.append(doOnEvent);
			sb.append("\"");
		}
		sb.append(">");
		if(innerText != null){
			sb.append(innerText);
		}
		sb.append("</input>");

		return sb.toString();
	}
}
