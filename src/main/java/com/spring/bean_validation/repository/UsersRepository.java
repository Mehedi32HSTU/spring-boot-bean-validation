package com.spring.bean_validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.bean_validation.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{
	

}
