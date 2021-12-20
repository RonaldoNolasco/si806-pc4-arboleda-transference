package pe.com.arboleda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.arboleda.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
  
}
