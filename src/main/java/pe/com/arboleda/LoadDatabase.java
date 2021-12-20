package pe.com.arboleda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.com.arboleda.model.Account;
import pe.com.arboleda.model.User;
import pe.com.arboleda.model.Currency;
import pe.com.arboleda.repository.AccountRepository;
import pe.com.arboleda.repository.CurrencyRepository;
import pe.com.arboleda.repository.TransferenceRepository;
import pe.com.arboleda.repository.UserRepository;

@Configuration
public class LoadDatabase {
  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository userRepository, CurrencyRepository currencyRepository, AccountRepository accountRepository, TransferenceRepository transferenceRepository) {

    return args -> {
      log.info("Preloading " + userRepository.save(new User(1, "rnolascoc@uni.pe", "prueba123", 254785)));
      log.info("Preloading " + userRepository.save(new User(2, "fbendezui@uni.pe", "prueba123", 586874)));
      log.info("Preloading " + userRepository.save(new User(3, "mvelar@uni.pe", "prueba123", 868743)));
      log.info("Preloading " + userRepository.save(new User(4, "ysuarezr@uni.pe", "prueba123", 354686)));

      log.info("Preloading " + currencyRepository.save(new Currency(1, "Soles", "S/")));
      log.info("Preloading " + currencyRepository.save(new Currency(2, "Dolares", "$")));
      log.info("Preloading " + currencyRepository.save(new Currency(3, "Euros", "€")));

      log.info("Preloading " + accountRepository.save(new Account(1, 1, 1, "Cuenta Ahorro Soles 1", "19192799890059", 1254.53)));
      log.info("Preloading " + accountRepository.save(new Account(2, 1, 1, "Cuenta Ahorro Soles 2", "56564676763138", 324.63)));

    };
  }

}

