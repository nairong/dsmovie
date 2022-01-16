package com.nrnprojects.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrnprojects.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
