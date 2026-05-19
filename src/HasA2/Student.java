package HasA2;

public class Student {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStanderd() {
		return standerd;
	}

	public void setStanderd(String standerd) {
		this.standerd = standerd;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	private String id;
	private String name;
	private String standerd;
	private String div;
	private Parent parent;

}
