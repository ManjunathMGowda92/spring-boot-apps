package org.manjunath.springboot.votersappwithswagger.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.manjunath.springboot.votersappwithswagger.dao.VoterDAO;
import org.manjunath.springboot.votersappwithswagger.exceptionhandling.VoterNotFoundException;
import org.manjunath.springboot.votersappwithswagger.model.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {

	@Autowired
	private VoterDAO dao;

	@Override
	public List<Voter> getAllVoters() {
		return dao.findAll();
	}

	@Override
	public Voter getVoterById(int id) {
		Voter voter = null;
		try {
			voter = dao.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new VoterNotFoundException("Voter not found for the requested Id: " + id);
		}
		return voter;
	}

	@Override
	public Voter getVoterById(String voterId) {
		return null;
	}

	@Override
	public Voter addVoter(Voter voter) {
		voter.setId(0);
		return dao.save(voter);
	}

	@Override
	public Voter updateVoter(Voter voter) {
		return dao.save(voter);
	}

	@Override
	public Voter deleteVoterById(int id) {
		Voter voter = null;
		try {
			voter = dao.findById(id).get();

			dao.deleteById(id);
		} catch (NoSuchElementException e) {
			throw new VoterNotFoundException("Voter not found to delete :" + id);
		}

		return voter;
	}

	@Override
	public void deleteVoterById(String voterId) {

	}

}
