package pe.com.arboleda.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transference {
  private @Id @GeneratedValue Integer id;
  private Integer sourceAccountId;
  private Integer destinyAccountId;
  private Double amount;
  private LocalDateTime dateTime;
  private Boolean success;

  public Transference() {
  }

  public Transference(Integer sourceAccountId, Integer destinyAccountId, Double amount, LocalDateTime dateTime, Boolean success) {
    this.sourceAccountId = sourceAccountId;
    this.destinyAccountId = destinyAccountId;
    this.amount = amount;
    this.dateTime = dateTime;
    this.success = success;
  }

  public Integer getSourceAccountId() {
    return sourceAccountId;
  }
  public void setSourceAccountId(Integer sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }
  public Integer getDestinyAccountId() {
    return destinyAccountId;
  }
  public void setDestinyAccountId(Integer destinyAccountId) {
    this.destinyAccountId = destinyAccountId;
  }
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
  }
  public LocalDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  
  
  
}

