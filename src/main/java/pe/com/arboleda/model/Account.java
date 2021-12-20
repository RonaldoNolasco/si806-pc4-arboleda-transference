package pe.com.arboleda.model;

import javax.persistence.Id;

public class Account {
  private @Id Long id;
  private Long userId;
  private Long currencyId;
  private String name;
  private String accountNumber;
  private Float availableAmount;

  public Account(Long id, Long userId, Long currencyId, String name, String accountNumber, Float availableAmount) {
    this.id = id;
    this.userId = userId;
    this.currencyId = currencyId;
    this.name = name;
    this.accountNumber = accountNumber;
    this.availableAmount = availableAmount;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }
  public Long getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(Long currencyId) {
    this.currencyId = currencyId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  public Float getAvailableAmount() {
    return availableAmount;
  }
  public void setAvailableAmount(Float availableAmount) {
    this.availableAmount = availableAmount;
  }

  
}
