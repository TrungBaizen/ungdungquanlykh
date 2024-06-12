package vn.codegym.qlkh.service;



import vn.codegym.qlkh.model.Customer;
import org.springframework.web.servlet.ModelAndView;


public interface CustomerService {
    ModelAndView showHome();
    ModelAndView updateCustomer(Customer customer);
    Customer showFromUpdate(int id) ;
    int findIndexById(int id);
}
