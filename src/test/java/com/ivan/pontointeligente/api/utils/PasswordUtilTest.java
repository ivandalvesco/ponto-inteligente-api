package com.ivan.pontointeligente.api.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtilTest {

	private static final String SENHA = "123456";
	private final BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
	
	@Test
	public void testSenhaNulo() throws Exception {
		assertNull(PasswordUtils.gerarBCrypt(null));		
	}
	
	@Test
	public void testGerarHashSenha()throws Exception {
		String hash = PasswordUtils.gerarBCrypt(SENHA);
		
		assertTrue(bCrypt.matches(SENHA, hash));
	
	}
}
