package vn.codegym.qlkh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.qlkh.model.Customer;
import vn.codegym.qlkh.service.CustomerService;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ModelAndView showList() {
        return customerService.showHome();
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEdit(@PathVariable("id") Integer id) {
        ModelAndView mdv = new ModelAndView();
        mdv.setViewName("edit");
        mdv.addObject("customer", customerService.showFromUpdate(id));
        return mdv;
    }

    @PostMapping("/edit")
    public String update(@RequestParam int id, @RequestParam String name, @RequestParam String email, @RequestParam String address) {
        Customer customer = new Customer(id, name, email, address);
        customerService.updateCustomer(customer);
        return "redirect:/customers";
    }
}