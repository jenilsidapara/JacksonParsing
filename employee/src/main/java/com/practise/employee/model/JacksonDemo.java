package com.practise.employee.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonDemo {

public static void main(String args[]) {
		
		getJson(new Employee("jenil", "sidapara", 24));
	}

private static void getJson(Employee employee) {
	ObjectMapper om = new ObjectMapper();
	try {
		String json = om.writeValueAsString(employee);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	
}
