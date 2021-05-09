package WithGoogleSignUp;

public class GoogleUser {
	private String name;
	private String lastName;
	private String eMail;
	public GoogleUser(String name, String lastNameString, String eMail) {
		super();
		this.name = name;
		this.lastName = lastNameString;
		this.eMail = eMail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	

}
