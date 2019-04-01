package com.medsys.medsysInterview.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.medsys.medsysInterview.model.Person;

@Component
public class PersonDaoService {
	private static List<Person> personList = new ArrayList<>();
	private static int personCount = 5;
	static {
		personList.add(new Person(1,"Adam", "Best",new Date(), "101 Sunset Blvd", "Apt #1A", "Toledo", "Ohio", 75895));
		personList.add(new Person(2,"Arnold", "Lickenbrock",new Date(), "102 Sunset Blvd", "Apt #2A", "Toledo", "Ohio", 75895));
		personList.add(new Person(3,"Maddy", "Morocco",new Date(), "103 charger Dr.", "Apt #9D", "dearborn", "Michigan", 15879));
		personList.add(new Person(4,"Hank", "Moody",new Date(), "345 edwin c. mosses Blvd", "Apt #5C", "Toledo", "Ohio", 75895));
		personList.add(new Person(5,"Rabecca", "Lee",new Date(), "101 Drummer lane", "Apt#3C", "Toledo", "Ohio", 75895));
		
	}
	
	public List<Person> retreiveAll()  {
		return personList;
	}
	
	
	
	public static int getPersonCount() {
		return personCount;
	}



	public static void setPersonCount(int personCount) {
		PersonDaoService.personCount = personCount;
	}



	public void save(Person newPerson)  {
		
		personList.add(new Person(6,newPerson.getFname(),newPerson.getLname(),newPerson.getDob(), newPerson.getAddr1(), 
						newPerson.getAddr2(), newPerson.getCity(), newPerson.getState(), newPerson.getZip()));
	}
	
}
