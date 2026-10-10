package net.haddouchi.costumerservice.controllers;

import net.haddouchi.costumerservice.entites.Custumer;
import net.haddouchi.costumerservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerRestController {

    private CustomerService customerService;

    public CustomerRestController (CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Custumer>getAllCustomers(){
        return customerService.getAllCustumers();
    }
    @GetMapping("/customers/{id}")
    public Custumer findCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
    @PostMapping("/customers")
    public Custumer saveCustomer(@RequestBody Custumer custumer){
        return customerService.saveCustomer(custumer);
    }


}
