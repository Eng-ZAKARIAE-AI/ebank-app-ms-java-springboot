package net.haddouchi.ebankservice.controllers;

import net.haddouchi.ebankservice.entites.BankAccount;
import net.haddouchi.ebankservice.service.EBankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankAccountRestController {
    private EBankService eBankService;

    //ingection des dependance

    public BankAccountRestController(EBankService eBankService) {
        this.eBankService = eBankService;
    }

    @GetMapping("/accounts")
    //retourn tout les comptes
    public List<BankAccount> getAllBankAccounts() {
        return eBankService.getAllBankAccounts();
    }
    @GetMapping("/accounts/{id}")
    //retourn une compt aprtire de id
    public BankAccount getBankAccountById(@PathVariable String id){
        return eBankService.getBankAccountById(id);
        //create Bank acount
    }
    @PostMapping("/accounts")
    public BankAccount save(@RequestBody BankAccount banckAccount){
        return eBankService.save(banckAccount);
    }

}
