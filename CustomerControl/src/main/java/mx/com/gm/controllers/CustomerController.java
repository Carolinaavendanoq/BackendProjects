package mx.com.gm.controllers;

import jakarta.validation.Valid;
import mx.com.gm.entities.Customer;
import mx.com.gm.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/")
    public String goHome(Model model){
        var customers = iCustomerService.customersList();
        model.addAttribute("customers", customers);
        return "index";
    }

    @GetMapping("/add")
    public String add(Customer customer){
        return "edit";
    }

    @PostMapping("/save")
    public String save(@Valid Customer customer, Errors errors){
        if (errors.hasErrors()) {
            return "edit";
        }
        iCustomerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/edit/{customerId}")
    public String edit(Customer customer, Model model){
        System.out.println("CUSTOMEEER " + customer);
        customer = iCustomerService.findCustomer(customer);
        System.out.println("CUSTOMEEER DB " + customer);
        model.addAttribute("customer", customer);
        return "edit";
    }

    @GetMapping("/delete")
    public String delete(Customer customer){
        iCustomerService.delete(customer);
        return "redirect:/";
    }
}
