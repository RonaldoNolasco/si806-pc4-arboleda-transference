package pe.com.arboleda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {
  private @Id Integer id;
  private String name;
  private String symbol;

  public Currency() {
  }

  public Currency(Integer id, String name, String symbol) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  
  
}
