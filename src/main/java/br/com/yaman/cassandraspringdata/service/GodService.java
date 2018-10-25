package br.com.yaman.cassandraspringdata.service;

import br.com.yaman.cassandraspringdata.entity.God;

/**
 * Serviço da entidade God, responsável por fazer o acesso
 * aos métodos do repositório.
 * @author marcus.martins
 * @since 25/10/2018
 */
public interface GodService {
	
	/**
	 * Realiza a busca da entidade God, através do nome passado
	 * por parâmetro,  retornando um Optional de God.
	 * @param String name
	 * @return God
	 */
	God findByName(String name) throws Exception;
}

