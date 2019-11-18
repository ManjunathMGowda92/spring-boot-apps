package org.manjunath.springboot.votersappwithswagger.dao;

import org.manjunath.springboot.votersappwithswagger.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VoterDAO extends JpaRepository<Voter, Integer>{
	
	@Query(value = "SELECT * FROM VOTERS WHERE VOTERID = ?1", nativeQuery = true)
	Voter findVoterByVoterId(String voterId);
}
