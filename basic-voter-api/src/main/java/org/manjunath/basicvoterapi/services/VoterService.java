package org.manjunath.basicvoterapi.services;

import java.util.List;

import org.manjunath.basicvoterapi.model.Voter;
import org.springframework.stereotype.Service;

@Service
public interface VoterService {
	
	List<Voter> getVotersList();
	Voter getVoterById(int id);
	Voter addVoter(Voter voter);
	Voter updateVoter(Voter voter);
	Voter deleteVoter(int id);
	
}
