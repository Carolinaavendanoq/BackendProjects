package mx.com.gm.dao;

import mx.com.gm.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ICustomerDAO extends CrudRepository<Customer, Long> {
}
