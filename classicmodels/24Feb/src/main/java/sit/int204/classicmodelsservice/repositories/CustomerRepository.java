package sit.int204.classicmodelsservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelsservice.entities.Customer;

import java.math.BigDecimal;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //public List<Customer> findAllByCustomerNameContaining(String name);
    public List<Customer> findAllByCreditLimitBetween(BigDecimal lower, BigDecimal upper);
    //public List<Customer> findAllByCustomerNameBetween(String lower, String upper);
}
