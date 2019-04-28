package com.ivan.pontointeligente.api.utils;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	
	public PasswordUtils() {
		super();
	}
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		
		log.info("Gerando hash com o BCrypt");
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		return bcrypt.encode(senha);
	}
	
	
	public static boolean senhaValida(String senha, String senhaEncoded) {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		return bcrypt.matches(senha, senhaEncoded);
	}

	
	
}
