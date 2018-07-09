package comsushma.springboot.webproj5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path="/sayhello")
	public HelloWorldBean getMessage() {
		return new HelloWorldBean("Hellow World!!!!");
	}
	
	@GetMapping("/sayhi")
	public HelloWorldBean sayHi() {
		return new HelloWorldBean("HI!!!!");
	}
	
	@GetMapping("/sayhello/path-variable/{name}")
	public HelloWorldBean sayHelloPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello! %s", name));
	}
}
