package kr.ac.jbnu.dao;

import java.util.List;

import kr.ac.jbnu.model.Person;

public interface PersonDAO {

	public void addPerson(Person p);

	public void updatePerson(Person p);

	public List<Person> listPersons();

	public Person getPersonById(int id);

	public void removePerson(int id);
}