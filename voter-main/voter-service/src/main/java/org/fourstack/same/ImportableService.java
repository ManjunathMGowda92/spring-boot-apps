package org.fourstack.same;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ImportableService {
	
	@Value("${app.description}")
	private String importStatement;

	public String getStatement() {
		return importStatement;
	}
}
