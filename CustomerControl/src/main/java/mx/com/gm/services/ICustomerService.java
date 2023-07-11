package mx.com.gm.services;

import mx.com.gm.entities.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> customersList();

    public void save(Customer customer);

    public void delete(Customer customer);

    public Customer findCustomer(Customer customer);
}
