package mx.com.gm.services;

import mx.com.gm.entities.Person;

import java.util.List;

public interface IPersonService {
    public List<Person> peopleList();

    public void save(Person person);

    public void delete(Person person);

    public Person findPerson(Person person);

}
