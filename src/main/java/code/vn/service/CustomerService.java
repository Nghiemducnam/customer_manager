package code.vn.service;

import code.vn.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int ID);

    void update(int id, Customer customer);

    void remove(int id);
}
