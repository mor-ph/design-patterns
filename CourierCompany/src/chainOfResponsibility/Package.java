package chainOfResponsibility;

public class Package {
	
	private String name;
	private Scope scope;
	
	public Package(String name, Scope scope) {
		this.name = name;
		this.scope = scope;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Scope getScope() {
		return scope;
	}
	public void setScope(Scope scope) {
		this.scope = scope;
	}
}
