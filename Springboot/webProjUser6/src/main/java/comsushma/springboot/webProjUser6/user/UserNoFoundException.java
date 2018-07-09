package comsushma.springboot.webProjUser6.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNoFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public UserNoFoundException(String message) {
		super(message);
	}

	
}
