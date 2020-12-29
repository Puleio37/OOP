import java.util.ArrayList;
import java.util.List;

public class CreateAccount {//class for creating accounts
	public static void main(String[] args) {//main
		Account Christian = new PersonalAccount("Christian","Puleio");//creating Personal account
		System.out.print(Christian.getFirstName() + " " + Christian.getLastName());
		Christian.useSocialMedia();//calling media in which personal account is using 
		
	
		Account Vinay = new ProfessionalAccount("Lebron", "James");//creating Professional account
		System.out.print(Vinay.getFirstName() + " " + Vinay.getLastName());
		Vinay.useSocialMedia();//calling media in which professional account is using 
		
		Account Chloe = new DatingAccount("Julia", "Rose");//creating Dating account
		System.out.print(Chloe.getFirstName() + " " + Chloe.getLastName());
		Chloe.useSocialMedia();//calling media in which dating account is using 
		
		FavoriteMedia<String> media = new FavoriteMedia<String>("My favorite media is facebook");//creating a string based off generic class
		media.display();//calling display function from generic class
	}
}
