
public class ConcreteP extends HTML {
	String innerText, id, name;

	public ConcreteP(String innerText) {
		this.innerText = innerText;
	}

	public ConcreteP(String innerText, String id, String name) {
		this.innerText = innerText;
		this.id = id;
		this.name = name;
	}

	@Override
	public String fullHTML() {
		StringBuilder sb = new StringBuilder();

		sb.append("<p");
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
		sb.append(">");
		if (innerText != null) {
			sb.append(innerText);
		}
		sb.append("</p>");

		return sb.toString();
	}
}
