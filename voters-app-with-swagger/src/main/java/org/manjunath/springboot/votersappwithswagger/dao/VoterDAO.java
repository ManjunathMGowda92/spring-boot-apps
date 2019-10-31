package org.manjunath.springboot.votersappwithswagger.dao;

import org.manjunath.springboot.votersappwithswagger.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterDAO extends JpaRepository<Voter, Integer>{

}
