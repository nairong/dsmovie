package com.nrnprojects.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrnprojects.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
