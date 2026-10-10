package net.haddouchi.ebankservice.service;

import net.haddouchi.ebankservice.entites.BankAccount;
import net.haddouchi.ebankservice.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class EBankService {
    private BankAccountRepository bankAccountRepository;

    public EBankService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    //retourn tout les comptes
    public List<BankAccount> getAllBankAccounts() {
        return bankAccountRepository.findAll();
    }
    //retourn une compt aprtire de id
    public BankAccount getBankAccountById(String id){
        return bankAccountRepository.findById(id).
                orElseThrow(()->new RuntimeException("Account not found")
        );
    //create Bank acount
    }
    public BankAccount save(BankAccount banckAccount){
        banckAccount.setId(UUID.randomUUID().toString());
        banckAccount.setCreatedAt(new Date());
        return bankAccountRepository.save(banckAccount);
    }
}
