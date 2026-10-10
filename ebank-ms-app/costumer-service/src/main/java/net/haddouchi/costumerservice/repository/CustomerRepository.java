package net.haddouchi.costumerservice.repository;

import net.haddouchi.costumerservice.entites.Custumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Custumer, Long> {

}
