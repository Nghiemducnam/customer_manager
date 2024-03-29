package code.vn.service;

import code.vn.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer>customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1,"Nam","nghiemducnam@gmail.com","Hanoi"));
        customers.put(2, new Customer(2,"Dung","dung0032@gmail.com","Haiphong"));
        customers.put(3, new Customer(3,"Tung","tung1990@gmail.com","Vinhphuc"));
        customers.put(4, new Customer(4,"Ngoc","ngojc2002@gmail.com","QuangNinh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
