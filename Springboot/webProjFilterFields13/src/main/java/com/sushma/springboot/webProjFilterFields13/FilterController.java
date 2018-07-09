package com.sushma.springboot.webProjFilterFields13;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilterController {
	
	@GetMapping("/someBean")
	public MappingJacksonValue getSomeBean() {
		SomeBean someBean = new SomeBean("value", "value2"," value3");
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);// this SomeBeanFilter need to be on defined on the POJO
		mapping.setFilters(filters );
		
		return mapping;
	}

}
