package br.com.yaman.cassandraspringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.yaman.cassandraspringdata.business.GodBusiness;
import br.com.yaman.cassandraspringdata.entity.God;

/**
 * Classe com endpoint referentes a entidade God.
 * @author marcus.martins
 * @since 25/10/2018
 */
@Controller
@RequestMapping("god")
public class GodController {
	
	@Autowired
	private GodBusiness godBusiness;

    public static final String JSON = "application/json";
    
    /**
	 * Realiza a busca da entidade God, através do nome passado
	 * por parâmetro,  retornando um Optional de God.
	 * @param String name
	 * @return God
	 */
    @RequestMapping(value="find-by-name", method = RequestMethod.GET, produces = { JSON })
    public ResponseEntity<God> findByName(String name) {
    	return ResponseEntity.ok(this.godBusiness.findByName(name));
    }
    
}