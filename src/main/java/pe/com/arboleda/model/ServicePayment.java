package pe.com.arboleda.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServicePayment {
  private @Id Long id;
  private Long serviceId;
  private Long accountId;
  private Long serviceTypeId;
  private String userNumber;
  private Float amount;
  private LocalDateTime dateTime;
  private Boolean success;
  
  public ServicePayment(Long id, Long serviceId, Long accountId, Long serviceTypeId, String userNumber, Float amount,
      LocalDateTime dateTime, Boolean success) {
    this.id = id;
    this.serviceId = serviceId;
    this.accountId = accountId;
    this.serviceTypeId = serviceTypeId;
    this.userNumber = userNumber;
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

  public Long getServiceId() {
    return serviceId;
  }

  public void setServiceId(Long serviceId) {
    this.serviceId = serviceId;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public Long getServiceTypeId() {
    return serviceTypeId;
  }

  public void setServiceTypeId(Long serviceTypeId) {
    this.serviceTypeId = serviceTypeId;
  }

  public String getUserNumber() {
    return userNumber;
  }

  public void setUserNumber(String userNumber) {
    this.userNumber = userNumber;
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

  public void setDatetime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  } 
  
  
  
  
}
