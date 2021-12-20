package pe.com.arboleda;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.com.arboleda.model.Account;
import pe.com.arboleda.model.User;
import pe.com.arboleda.model.Currency;
import pe.com.arboleda.model.Transference;
import pe.com.arboleda.repository.AccountRepository;
import pe.com.arboleda.repository.CurrencyRepository;
import pe.com.arboleda.repository.TransferenceRepository;
import pe.com.arboleda.repository.UserRepository;

@Configuration
public class LoadDatabase {
  @Bean
  CommandLineRunner initDatabase(UserRepository userRepository, CurrencyRepository currencyRepository, AccountRepository accountRepository, TransferenceRepository transferenceRepository) {

    return args -> {
      userRepository.save(new User(1, "rnolascoc@uni.pe", "prueba123", 254785));
      userRepository.save(new User(2, "fbendezui@uni.pe", "prueba123", 586874));
      userRepository.save(new User(3, "mvelar@uni.pe", "prueba123", 868743));
      userRepository.save(new User(4, "ysuarezr@uni.pe", "prueba123", 354686));

      currencyRepository.save(new Currency(1, "Soles", "S/"));
      currencyRepository.save(new Currency(2, "Dolares", "$"));
      currencyRepository.save(new Currency(3, "Euros", "€"));

      accountRepository.save(new Account(1, 1, 1, "Cuenta Ahorro Soles 1", "12592799890059", 1254.53));
      accountRepository.save(new Account(2, 1, 1, "Cuenta Ahorro Soles 2", "12564676763138", 324.63));

      //transferenceRepository.save(new Transference(1,1, 2331.45, LocalDateTime.now(), true));

    };
  }

}

