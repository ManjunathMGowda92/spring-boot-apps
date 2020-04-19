package org.fourstack.same;

import org.springframework.stereotype.Service;

@Service
public class ImportableService {

	private String importStatement;

	public String getStatement() {
		importStatement = "you bloody fellow, I'm imported successfully";
		
		return importStatement;
	}
}
