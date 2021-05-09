package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import DataAccess.Absracts.UserDao;
import Entities.Absracts.Entity;
import Entities.Concretes.User;

public class TestDao implements UserDao {
	List<User> users;
	
	

	public TestDao() {
		super();
		User user1 =new User(1, "Mert", "Uğraş", "123456", "mert@gmail.com");
		User user2 =new User(2, "Engin", "Demiroğ", "123456", "engin@gmail.com");
		users=new ArrayList<User>();
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {
		System.out.println(user.getName()+" "+user.geteMail()+" Test Db eklendi.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" Db güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" Db silindi.");
		
	}

	@Override
	public User get(User user) {
		
		return user ;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public boolean controlUser(User user) {
		for (User user1 : users) {
			if (user.geteMail()==user1.geteMail()&&user.getPassword()==user1.getPassword()) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean checkMailUsed(User user) {
		for (User user1 : users) {
			if (user.geteMail()==user1.geteMail()) {
				System.out.println("Mail adresi kullanılmaktadır");
				return true;
			}
		}
		
		return false;
	}
	
	



}
