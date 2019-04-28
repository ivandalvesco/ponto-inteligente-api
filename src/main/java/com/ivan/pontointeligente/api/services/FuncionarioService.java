package com.ivan.pontointeligente.api.services;

import java.util.Optional;

import com.ivan.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	
	/**
	 * Método para persistir um objeto funcionário na base de dados
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Método para buscar um funcionário pelo CPF
	 * @param cpf
	 * @return Funcionario
	 */
	Optional<Funcionario> buscaPorCpf(String cpf);
	
	
	/**
	 * Método para buscar um funcionário pelo email
	 * @param email
	 * @return Funcionario
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	
	/**
	 * Método para buscar o funcionário pelo ID
	 * @param id
	 * @return Funcionario
	 */
	Optional<Funcionario> buscarPorId(Long id);
	
}
