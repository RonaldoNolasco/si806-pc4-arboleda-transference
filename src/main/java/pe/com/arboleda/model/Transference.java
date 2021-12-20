package pe.com.arboleda.model;

import java.time.LocalDateTime;

import javax.persistence.Id;

public class Transference {
  private @Id Long id;
  private String sourceAccountId;
  private String destinyAccountId;
  private Float amount;
  private LocalDateTime dateTime;
  private Boolean success;

  public Transference(Long id, String sourceAccountId, String destinyAccountId, Float amount, LocalDateTime dateTime,
      Boolean success) {
    this.id = id;
    this.sourceAccountId = sourceAccountId;
    this.destinyAccountId = destinyAccountId;
    this.amount = amount;
    this.dateTime = dateTime;
    this.success = success;
  }
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getSourceAccountId() {
    return sourceAccountId;
  }
  public void setSourceAccountId(String sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }
  public String getDestinyAccountId() {
    return destinyAccountId;
  }
  public void setDestinyAccountId(String destinyAccountId) {
    this.destinyAccountId = destinyAccountId;
  }
  public Float getAmount() {
    return amount;
  }
  public void setAmount(Float amount) {
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

