package co.gc;

public class Country {

	
	private String name;
	private String pop;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String name, String pop) {
		super();
		this.name = name;
		this.pop = pop;
	}
	@Override
	public String toString() {
		return name + " (pop " + pop + ")";
	}
	
	
}
