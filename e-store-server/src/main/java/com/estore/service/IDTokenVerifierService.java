package com.estore.service;

import java.io.IOException;
import java.security.GeneralSecurityException;

public interface IDTokenVerifierService {
		
	public String verifyIDToken(String token);
}
