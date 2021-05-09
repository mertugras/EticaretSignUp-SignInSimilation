package Bussiness.Concretes;

import Bussiness.Absracts.UserService;
import Core.RegisterService;
import DataAccess.Absracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService {

	RegisterService registerService;
	UserDao userDao;
	
	
	
	public UserManager(RegisterService registerService,UserDao userDao) {
		super();
		this.registerService = registerService;
		this.userDao=userDao;
	}


	@Override
	public void add() {
		if (!(registerService.register()==null)) {
			User user=registerService.register();
			if (!userDao.checkMailUsed(user)) {
				userDao.add(user);
				
			}
			
		}
		
	}


	@Override
	public void login(User user) {
		if (userDao.controlUser(user)) {
			System.out.println("Sisteme giriş yapıldı");
		}else {
			System.out.println("Kullanıcı adı veya şifrei yanlış lütfen kontrol ediniz");
		}
		
	}

}
