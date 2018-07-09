package comsushma.springboot.webProjUser6.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public static List<User> users = new ArrayList<User>();
	
	//creating dummy users until we connect to DB
	static {
		users.add(new User(1, "Sushma", new Date()));
		users.add(new User(2, "Kiran", new Date()));
	}
	
	private static int userCounter  = 2;  
	
	public List<User> getUsers(){
		return users;
	}
	
	public User getUser(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}
	
	public User saveUser(User user) {
		if(user.getId() == 0) {
			user.setId(++userCounter);
		}
		users.add(user);
		return user;
	}

	public User deleteUser(int id) {
		for(User user : users) {
			if(user.getId() == id) {
				users.remove(user);
				return user;
			}
		}
		return null;
	}
}
