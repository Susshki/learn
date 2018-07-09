package comsushma.springboot.webProjUserCustomExp7.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private UserDao dao;
	
	public List<User> getUsers() {
		return dao.getUsers();
	}
	
	public User getUser(int id) {
		return dao.getUser(id);
	}

}
