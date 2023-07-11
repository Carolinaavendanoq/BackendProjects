package mx.com.gm.impl;

import mx.com.gm.dao.IPersonDAO;
import mx.com.gm.entities.Person;
import mx.com.gm.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonDAO personDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Person> peopleList() {
        return (List<Person>) personDAO.findAll();

    }

    @Override
    @Transactional
    public void save(Person person) {
        personDAO.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDAO.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {
        return personDAO.findById(person.getIdPerson()).orElse(null);
    }
}
