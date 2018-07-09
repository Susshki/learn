package com.sushma.springboot.webproj4;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		Book book1 = new Book(1, "Selenium", "Kiran P");
		return Arrays.asList(book1);
	}
}
