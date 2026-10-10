package net.haddouchi.ebankservice.repository;

import net.haddouchi.ebankservice.entites.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

    List<BankAccount> findByCustomerId(Long customerId);
}
