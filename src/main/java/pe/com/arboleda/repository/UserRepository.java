package pe.com.arboleda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.arboleda.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
  public User findOneById(Integer id);
  
}
