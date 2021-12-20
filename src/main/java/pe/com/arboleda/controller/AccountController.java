package pe.com.arboleda.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.arboleda.model.Account;
import pe.com.arboleda.repository.AccountRepository;

@RestController
public class AccountController {
  private final AccountRepository accountRepository;

  AccountController(AccountRepository accountRepository){
    this.accountRepository = accountRepository;
  }
  
  @RequestMapping(value = "/accounts", method = RequestMethod.GET)
  public ResponseEntity<List<Account>> getAllAccounts(){
    return new ResponseEntity<>(accountRepository.findAll(), HttpStatus.OK);
  }
}
