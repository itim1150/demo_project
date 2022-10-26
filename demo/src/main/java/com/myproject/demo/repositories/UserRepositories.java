package com.myproject.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.demo.entity.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
	public List<User> findByFirstname(String name);

}
