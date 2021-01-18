package model;

//Type your code here
public class User
{
	private String name;
	private String email;
	private String dateOfBirth;
	private String gender;
	
	public User(String name, String email, String dateOfBirth, String gender) {
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	
	//Setting and getting Name value
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Setting and getting Email value
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Setting and getting DOB value
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	//Setting and getting Gender value
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	//Prints user details
	public void printDetails() {
		System.out.println("User details");
		System.out.println("Name :" + name);
		System.out.println("Email :" + email);
		System.out.println("Date of Birth :" + dateOfBirth);
	}
	
	
	
	
}