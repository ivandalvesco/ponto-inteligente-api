package com.ivan.pontointeligente.api.services;

import java.util.Optional;

import com.ivan.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	
	/**
	 * Retorna uma empresa a partir de um CNPJ
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Persiste um objeto empresa na base de dados
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
}
