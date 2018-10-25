package br.com.yaman.cassandraspringdata.repository;

import java.util.Optional;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import br.com.yaman.cassandraspringdata.entity.God;

/**
 * Repositório da entidade God, contendo os métodos padrão
 * extendidos do CassandraRepository.
 * @author marcus.martins
 * @since 25/10/2018
 */
public interface GodRepository extends CassandraRepository<God, String> {

	/**
	 * Realiza a busca da entidade God, através do nome passado
	 * por parâmetro,  retornando um Optional de God.
	 * 
	 * É necessário a annotation @AllowFiltering, para que
	 * seja possível realizar a busca.
	 * 
	 * @param String name
	 * @return Optional<God>
	 */
	@AllowFiltering
    Optional<God> findByName(String name);
}
