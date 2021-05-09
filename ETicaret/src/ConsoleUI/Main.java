package ConsoleUI;

import Bussiness.Concretes.UserManager;
import Core.GoogleRegisterAdapter;
import Core.MailRegisterManager;
import DataAccess.Concretes.TestDao;
import Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
//		UserManager userManager=new UserManager(new GoogleRegisterAdapter("mert@gmail.com", "12345"), new TestDao());
//		userManager.add();
		
		User user=new User(1, "Engin", "Demiroğ", "123456", "engin@gmail.com");
		UserManager userManager2=new UserManager(new MailRegisterManager(user), new TestDao());
		userManager2.add();
	
		userManager2.login(user);
	
	}
	

}
