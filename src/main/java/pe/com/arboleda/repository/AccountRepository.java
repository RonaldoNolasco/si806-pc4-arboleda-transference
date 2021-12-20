package pe.com.arboleda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.arboleda.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
  public Account findByAccountNumber(String AccountNumber);
  
}
