package pe.com.arboleda.repository.CustomizedTransference;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import pe.com.arboleda.dto.TransferenceDTO;
import pe.com.arboleda.model.Transference;
import pe.com.arboleda.repository.TransferenceRepository;

public class CustomizedTransferenceRepositoryImpl implements CustomizedTransferenceRepository {

  @Autowired
  @Lazy
  TransferenceRepository transferenceRepository;
  
  public String addTransference(TransferenceDTO transferenceDTO) {
    transferenceRepository.save(new Transference(1,1, 2331.45, LocalDateTime.now(), true));
    return "Transferencia realizada";
  }

}
