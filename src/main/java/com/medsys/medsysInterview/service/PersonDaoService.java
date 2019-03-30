package com.medsys.medsysInterview.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.medsys.medsysInterview.model.Person;

@Component
public class PersonDaoService {
	private static List<Person> personList = new ArrayList<>();
	static {
		personList.add(new Person("Adam", "Best", "101 Sunset Blvd", "", "Toledo", "Ohio", 75895));
		personList.add(new Person("Arnold", "Lickenbrock", "102 Sunset Blvd", "", "Toledo", "Ohio", 75895));
		personList.add(new Person("Maddy", "Morocco", "103 charger Dr.", "", "dearborn", "Michigan", 15879));
		personList.add(new Person("Hank", "Moody", "345 edwin c. mosses Blvd", "", "Toledo", "Ohio", 75895));
		personList.add(new Person("Adam", "Best", "101 Sunset Blvd", "", "Toledo", "Ohio", 75895));
		
	}
	
	public List<Person> retreiveAll()  {
		return personList;
	}
	
}
