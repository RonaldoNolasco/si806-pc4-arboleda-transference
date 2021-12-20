package pe.com.arboleda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
  private @Id Long id;
  private Long companyId;
  private Long currencyId;
  private String name;
  
  public Service(Long id, Long companyId, Long currencyId, String name) {
    this.id = id;
    this.companyId = companyId;
    this.currencyId = currencyId;
    this.name = name;
  }

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Long getCompanyId() {
    return companyId;
  }
  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
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

  
  
}
