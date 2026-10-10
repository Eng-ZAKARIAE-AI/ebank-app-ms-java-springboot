package net.haddouchi.costumerservice.service;

import net.haddouchi.costumerservice.entites.Custumer;
import net.haddouchi.costumerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;


    // ingection des dependences

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    // les fct qui retourn tout les clients

    public List<Custumer> getAllCustumers(){
        return customerRepository.findAll();
    }
    // trouve une client avec sont id
    public Custumer getCustomerById(Long id){
        return  customerRepository.findById(id).orElseThrow(
                ()->new RuntimeException("Customer Not found "));
    }
    public Custumer saveCustomer(Custumer custumer){
        return customerRepository.save(custumer);
    }
}
