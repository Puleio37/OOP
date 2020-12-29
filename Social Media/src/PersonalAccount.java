
public class PersonalAccount extends Account{//extends Account in order to use its methods and instance variables
	
	
	public PersonalAccount(String firstName, String lastName) {
		super(firstName, lastName);//super in order to use the instance variables from Account class
		socialMedia = new Facebook(); //this sets the social media Facebook for this given account type
	
	}
	
	public void useSocialMedia() {//this method allows for the use of the media to take place
		socialMedia.useMedia();//calls the given media that was assigned 
	}
	
	
	

}
