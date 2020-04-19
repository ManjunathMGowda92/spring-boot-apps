package org.fourstack.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public String getServiceName() {
		return "Welcome to Multi Module Project-Updated the project Settings";
	}
	
}
