package br.com.isaccanedo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.isaccanedo.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
