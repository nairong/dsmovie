package com.nrnprojects.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrnprojects.dsmovie.entities.Score;
import com.nrnprojects.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
