package pe.com.arboleda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.arboleda.model.Transference;

public interface TransferenceRepository extends JpaRepository<Transference, Long>{
  
}
