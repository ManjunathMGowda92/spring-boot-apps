package org.manjunath.basicvoterapi.services;

import java.util.List;

import org.manjunath.basicvoterapi.dao.VoterRepository;
import org.manjunath.basicvoterapi.model.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {
	@Autowired
	private VoterRepository dao;

	@Override
	public List<Voter> getVotersList() {
		return dao.findAll();
	}

	@Override
	public Voter getVoterById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public Voter addVoter(Voter voter) {
		return null;
	}

	@Override
	public Voter updateVoter(Voter voter) {
		return null;
	}

	@Override
	public Voter deleteVoter(int id) {
		return null;
	}

}
