package pe.com.arboleda.repository.CustomizedTransference;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import pe.com.arboleda.dto.TransferenceDTO;
import pe.com.arboleda.exception.CustomException;
import pe.com.arboleda.model.Account;
import pe.com.arboleda.model.Transference;
import pe.com.arboleda.model.User;
import pe.com.arboleda.repository.AccountRepository;
import pe.com.arboleda.repository.TransferenceRepository;
import pe.com.arboleda.repository.UserRepository;

public class CustomizedTransferenceRepositoryImpl implements CustomizedTransferenceRepository {

  @Autowired
  @Lazy
  TransferenceRepository transferenceRepository;

  @Autowired
  @Lazy
  AccountRepository accountRepository;

  @Autowired
  @Lazy
  UserRepository userRepository;
  
  public String addTransference(TransferenceDTO transferenceDTO) throws Exception {
    try{
      if (transferenceDTO.getTransferAmount() <= 0){
        throw new CustomException("Monto inválido");
      }

      if (!transferenceDTO.getSourceAccountNumber().startsWith("125")){
        throw new CustomException("Cuenta de origen inválida");
      }

      if (!transferenceDTO.getDestinyAccountNumber().startsWith("125")){
        throw new CustomException("Cuenta de destino inválida");
      }

      Account originAccount = accountRepository.findOneByAccountNumber(transferenceDTO.getSourceAccountNumber());
      Account destinyAccount = accountRepository.findOneByAccountNumber(transferenceDTO.getDestinyAccountNumber());
      User user = userRepository.findOneById(originAccount.getUserId());

      if (transferenceDTO.getTransferAmount() >= originAccount.getAvailableAmount()){
        throw new CustomException("Monto menor al saldo de la cuenta de origen");
      }

      if (!originAccount.getUserId().equals(destinyAccount.getUserId())){
        throw new CustomException("Usuarios propietarios de las cuentas diferentes");
      }

      if (!user.getSecretKey().equals(transferenceDTO.getSecretKey())){
        throw new CustomException("Clave secreta incorrecta");
      }

      originAccount.setAvailableAmount(originAccount.getAvailableAmount() - transferenceDTO.getTransferAmount());
      accountRepository.save(originAccount);

      destinyAccount.setAvailableAmount(destinyAccount.getAvailableAmount() + transferenceDTO.getTransferAmount());
      accountRepository.save(destinyAccount);

      transferenceRepository.save(new Transference(originAccount.getId(), destinyAccount.getId(), transferenceDTO.getTransferAmount(), LocalDateTime.now(), true));

      return "Transferencia realizada";
    } catch (Exception e){
      throw e;
    }
  }

}
