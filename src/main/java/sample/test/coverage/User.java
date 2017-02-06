package sample.test.coverage;

public class User {

	private String name;
			
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isValid() {
		return (name != null && !name.equals("") && name.length() <= 10);
	}	
}
