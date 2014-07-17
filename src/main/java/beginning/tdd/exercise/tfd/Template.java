package beginning.tdd.exercise.tfd;

public class Template {
	private String name;
	private String value;

	public Template(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String evaluate() {
		return name + ", " + value;
	}
}
