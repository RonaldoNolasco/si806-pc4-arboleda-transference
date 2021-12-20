package pe.com.arboleda.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  private @Id Integer id;
  private String email;
  private String password;
  private Integer secretKey;

  public User() {
  }

  public User(Integer id, String email, String password, Integer secretKey) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.secretKey = secretKey;
  }



  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public Integer getSecretKey() {
    return secretKey;
  }
  public void setSecretKey(Integer secretKey) {
    this.secretKey = secretKey;
  }

}
