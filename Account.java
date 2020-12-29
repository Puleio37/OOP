import java.util.List;

public abstract class Account{
	
	protected String firstName;
	protected String lastName;
	protected SocialMedia socialMedia;
	
	public Account(String firstName, String lastName) {//instance variables to extend Accounts classes
		this.firstName = firstName;
		this.lastName = lastName; 
	}
	
	public String getFirstName() {//getter function for first name
		return firstName;
	}
	public void setFirstName(String firstName) {//setter function for first name 
		this.firstName = firstName;
		
	}
	public String getLastName() {//getter function for last name 
		return lastName;
	}
	public void setLastName(String lastName) {//setter function for last name 
		this.lastName = lastName;
		
	}
	public abstract void useSocialMedia();//this method is used in order for accounts use set media
	
	public void setSocialMedia(SocialMedia socialMedia) {//this methods was created in order to set a certain media in the accounts constructor 
		this.socialMedia = socialMedia;
	}
	

}
