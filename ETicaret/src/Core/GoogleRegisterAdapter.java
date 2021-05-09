package Core;

import Entities.Concretes.User;
import WithGoogleSignUp.GoogleSignUp;
import WithGoogleSignUp.GoogleUser;

public class GoogleRegisterAdapter implements RegisterService {

	private String eMail;
	private String password;

	public GoogleRegisterAdapter(String eMail, String password) {
		super();
		this.eMail = eMail;
		this.password = password;
	}

	@Override
	public User register() {
		GoogleSignUp googleSignUp = new GoogleSignUp();
		GoogleUser googleUser = googleSignUp.SignUp(this.eMail, this.password);

		if (!(googleUser == null)) {
			User user = new User(0, googleUser.getName(), googleUser.getLastName(), password, googleUser.geteMail());
			return user;
		} else {
			return null;
		}

	}

	public String geteMail() {
		return eMail;
	}

	public String getPassword() {
		return password;
	}

}
