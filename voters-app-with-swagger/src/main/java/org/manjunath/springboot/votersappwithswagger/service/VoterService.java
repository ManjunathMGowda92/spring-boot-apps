package org.manjunath.springboot.votersappwithswagger.service;

import java.util.List;

import org.manjunath.springboot.votersappwithswagger.model.Voter;

public interface VoterService {
	
	public List<Voter> getAllVoters();
	public Voter getVoterById(int id);
	public Voter getVoterById(String voterId);
	public Voter addVoter(Voter voter);
	public Voter updateVoter(Voter voter);
	public void deleteVoterById(int id);
	public void deleteVoterById(String voterId);
	
}
