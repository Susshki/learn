package comsushma.springboot.webProjUser6.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //This will help spring manage this bean as we autowire this in the Contoller.
public class UserService {
	
	@Autowired
	private UserDao dao = null;
	
	public List<User> getUsers(){
		return dao.getUsers();
	}
	
	public User getUser(int id) {
		return dao.getUser(id);
	}
	
	public User saveUser(User user) {
		return dao.saveUser(user);
	}

	public User deleteUser(int id) {
		return dao.deleteUser(id);		
	}
}
