package net.haddouchi.costumerservice;

import net.haddouchi.costumerservice.entites.Custumer;
import net.haddouchi.costumerservice.repository.CustomerRepository;
import net.haddouchi.costumerservice.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CostumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostumerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner (CustomerService customerService){
        return args -> {

          List <String>names = List.of("Mohamed","Imane","Yassine");
            names.forEach(name->{
                customerService.saveCustomer(Custumer.builder()
                                .name(name)
                                .email(name+"@hotmail.com")
                        .build());
            });
        };
    }





}


