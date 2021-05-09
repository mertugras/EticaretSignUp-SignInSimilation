package DataAccess.Absracts;

import java.util.List;

import Entities.Absracts.Entity;
import Entities.Concretes.User;

public interface UserDao {
void add(User user);
void update(User user);
void delete(User user);
User get(User user);
boolean controlUser(User user);
boolean checkMailUsed(User user);
List<User> getAll();
}
