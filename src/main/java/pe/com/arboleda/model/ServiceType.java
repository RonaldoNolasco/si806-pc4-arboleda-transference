package pe.com.arboleda.model;

import javax.persistence.Id;

public class ServiceType {
  private @Id Long id;
  private String name;

  public ServiceType(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
