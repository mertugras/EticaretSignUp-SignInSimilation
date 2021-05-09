package WithGoogleSignUp;

public class GoogleSignUp {
	
	public GoogleUser SignUp(String mail,String password) {
		
		//mail ve şifre bilgisi doğru ise bize kullanıcının mail ve diğer bilgilerini döndürür
		if (mail.equals("mert@gmail.com")&&password.equals("12345")) {

			GoogleUser googleUser=new GoogleUser("Mert", "Uğraş", mail);
			return googleUser;
		}else {
			System.out.println("Kullanıcı Adı Veya şifre yanlış");
			return null;
		}
		
		
	}

}
