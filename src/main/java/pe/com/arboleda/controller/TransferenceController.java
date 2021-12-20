package pe.com.arboleda.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.arboleda.dto.TransferenceDTO;
import pe.com.arboleda.model.Transference;
import pe.com.arboleda.repository.TransferenceRepository;

@RestController
public class TransferenceController {
  private final TransferenceRepository transferenceRepository;

  TransferenceController(TransferenceRepository transferenceRepository){
    this.transferenceRepository = transferenceRepository;
  }

  @RequestMapping(value = "/transferences", method = RequestMethod.GET)
  public ResponseEntity<List<Transference>> getAllTransferences(){
    return new ResponseEntity<>(transferenceRepository.findAll(), HttpStatus.ACCEPTED);
  }

  @RequestMapping(value = "/transference", method = RequestMethod.POST)
  public ResponseEntity<String> transferenceBetweenAccounts(@RequestBody TransferenceDTO transferenceDTO){
    try{
      return new ResponseEntity<>(transferenceRepository.addTransference(transferenceDTO), HttpStatus.ACCEPTED);
    } catch(Exception e){
      return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
    }
    
    
  }

}
