package vn.codegym.qlkh.service.Impl;

import vn.codegym.qlkh.model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.qlkh.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final List<Customer> customerList = new ArrayList<>();

    public CustomerServiceImpl() {
        customerList.add(new Customer(1, "Trung", "trung@gmail.com", "Hà Nội"));
        customerList.add(new Customer(2, "Hoàng", "hoang@gmail.com", "Phú Thọ"));
        customerList.add(new Customer(3, "Nam", "nam@gmail.com", "Hà Nội"));
        customerList.add(new Customer(4, "Quảng", "hoang@gmail.com", "Bắc Ninh"));
    }

    @Override
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @Override
    public ModelAndView updateCustomer(Customer customer) {
        int index = findIndexById(customer.getId());
        ModelAndView modelAndView = new ModelAndView("home");
        if (index != -1) {
            Customer customerUpdate = customerList.get(index);
            customerUpdate.setName(customer.getName());
            customerUpdate.setEmail(customer.getEmail());
            customerUpdate.setAddress(customer.getAddress());
        }
        return modelAndView;
    }

    @Override
    public Customer showFromUpdate(int id) {
        int index = findIndexById(id);
        return customerList.get(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
