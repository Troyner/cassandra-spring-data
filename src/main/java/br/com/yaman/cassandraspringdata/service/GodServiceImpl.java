package br.com.yaman.cassandraspringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.yaman.cassandraspringdata.entity.God;
import br.com.yaman.cassandraspringdata.repository.GodRepository;

/**
 * Serviço da entidade God, responsável por fazer o acesso
 * aos métodos do repositório.
 * @author marcus.martins
 * @since 25/10/2018
 */
@Service
public class GodServiceImpl implements GodService {

	@Autowired
	private GodRepository godRepository;
	
	/**
	 * Realiza a busca da entidade God, através do nome passado
	 * por parâmetro,  retornando um Optional de God.
	 * @param String name
	 * @return Optional<God>
	 */
	@Override
	public God findByName(String name) throws Exception {
		return godRepository.findByName(name).orElseThrow(() -> new Exception());
	}

}
