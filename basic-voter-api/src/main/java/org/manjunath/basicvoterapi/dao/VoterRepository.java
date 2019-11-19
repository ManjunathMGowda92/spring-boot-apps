package org.manjunath.basicvoterapi.dao;

import org.manjunath.basicvoterapi.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Integer> {

}
