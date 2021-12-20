package pe.com.arboleda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.arboleda.model.Transference;
import pe.com.arboleda.repository.CustomizedTransference.CustomizedTransferenceRepository;

public interface TransferenceRepository extends JpaRepository<Transference, Long>, CustomizedTransferenceRepository{
  
}
