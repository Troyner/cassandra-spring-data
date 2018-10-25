package br.com.yaman.cassandraspringdata.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.yaman.cassandraspringdata.entity.God;
import br.com.yaman.cassandraspringdata.service.GodService;

/**
 * Classe de com as regras de negócio e funcionalidades
 * da entidade God.
 * @author marcus.martins
 * @since 25/10/2018
 */
@Component
public class GodBusiness {
	
	@Autowired
	private GodService godService;
	
	/**
	 * Realiza a busca da entidade God, através do nome passado
	 * por parâmetro,  retornando um Optional de God.
	 * @param String name
	 * @return God
	 */
	public God findByName(String name) {
		try {
			return this.godService.findByName(name);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
