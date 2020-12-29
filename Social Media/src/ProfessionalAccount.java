
public class ProfessionalAccount extends Account{//extends Account in order to use its methods and instance variables
	
	
	public ProfessionalAccount(String firstName, String lastName){
		super(firstName, lastName);//super in order to use the instance variables from Account class
		socialMedia = new Linkedin();//this sets the social media Linkedin for this given account type
		

	}
	
	public void useSocialMedia() {//this method allows for the use of the media to take place
		socialMedia.useMedia();//calls the given media that was assigned 
	}
	
	

}