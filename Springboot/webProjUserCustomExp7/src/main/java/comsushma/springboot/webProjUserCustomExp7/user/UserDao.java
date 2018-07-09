package comsushma.springboot.webProjUserCustomExp7.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	
	private static List<User> users = new ArrayList<User>();
	private static int userCnt = 3;
	
	static {
		users.add(new User(1, "Sushma"));
		users.add(new User(2, "Kiran"));
		users.add(new User(3, "KUmara Swamy"));
	}

	public List<User> getUsers() {
		return users;
	}
	
	public User getUser(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}

}
