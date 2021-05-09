package Core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.Concretes.User;

public class MailRegisterManager implements RegisterService {

	User user;

	public MailRegisterManager(User user) {
		super();
		this.user = user;
	}

	@Override
	public User register() {
		if (passwordValidtyCheck(user.getPassword()) && eMailValidtyCheck(user.geteMail())
				&& nameValidtyCheck(user.getName()) && lastNameValidtyCheck(user.getLastName())) {
			
			return user;
		}
		return null;
	}

	public boolean passwordValidtyCheck(String password) {
		if (password.length() >= 6) {
			return true;
		}
		System.out.println("Parola en az 6 karekterden oluşmalıdır.");
		return false;
	}

	public boolean eMailValidtyCheck(String eMail) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(eMail);
		if (matcher.matches()) {
			return true;
		}
		System.out.println("Lütfen email adresini doğru girdiğinizden emin olun");
		return false;
	}

	public boolean nameValidtyCheck(String name) {
		if (name.length() >= 2) {
			return true;
		}
		System.out.println("İsim en az 2 karakter olmalıdır.");
		return false;
	}

	public boolean lastNameValidtyCheck(String lastName) {
		if (lastName.length() >= 2) {
			return true;
		}
		System.out.println("Soyisim en az 2 karakter olmalıdır.");
		return false;
	}

	public void activitonCodeSendMail() {
		System.out.println("Aktivasyon kodu mail adresinize gönderildi");

	}

}
