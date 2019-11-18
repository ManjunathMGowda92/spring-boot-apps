package org.manjunath.springboot.votersappwithswagger.dao;

import javax.transaction.Transactional;

import org.manjunath.springboot.votersappwithswagger.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterDAO extends JpaRepository<Voter, Integer>{
	
	@Query(value = "SELECT * FROM VOTERS WHERE VOTERID = ?1", nativeQuery = true)
	Voter findVoterByVoterId(String voterId);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM VOTERS WHERE VOTERID = ?1", nativeQuery = true)
	void deleteVoterByVoterId(String voterId);
}
