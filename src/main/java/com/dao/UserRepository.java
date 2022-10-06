package com.dao;

import java.util.List;
import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findAllByOrderByLastNameAsc();
	
	// search by name
	public List<User> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}
