package mx.com.gm.impl;

import mx.com.gm.dao.ICustomerDAO;
import mx.com.gm.entities.Customer;
import mx.com.gm.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDAO iCustomerDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> customersList() {
        return (List<Customer>) iCustomerDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Customer customer) {
        iCustomerDAO.save(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        iCustomerDAO.delete(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findCustomer(Customer customer) {
        return iCustomerDAO.findById(customer.getCustomerId()).orElse(null);
    }
}
