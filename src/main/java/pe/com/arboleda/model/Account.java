package pe.com.arboleda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
  private @Id Integer id;
  private Integer userId;
  private Integer currencyId;
  private String name;
  private String accountNumber;
  private Double availableAmount;

  public Account() {
  }

  public Account(Integer id, Integer userId, Integer currencyId, String name, String accountNumber, Double availableAmount) {
    this.id = id;
    this.userId = userId;
    this.currencyId = currencyId;
    this.name = name;
    this.accountNumber = accountNumber;
    this.availableAmount = availableAmount;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public Integer getCurrencyId() {
    return currencyId;
  }
  public void setCurrencyId(Integer currencyId) {
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
  public Double getAvailableAmount() {
    return availableAmount;
  }
  public void setAvailableAmount(Double availableAmount) {
    this.availableAmount = availableAmount;
  }

  
}
