package br.com.yaman.cassandraspringdata.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 * Classe responsável por fazer a conexão com o banco Cassandra
 * @author marcus.martins
 * @since 25/10/2018
 */
@Configuration
@EnableCassandraRepositories(
		  basePackages = "br.com.yaman.cassandraspringdata.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {
 
	@Autowired
	private Environment environment;
	
    @Override
    protected String getKeyspaceName() {
        return environment.getProperty("cassandra.keyspace");
    }
 
    @Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster = 
          new CassandraClusterFactoryBean();
        cluster.setContactPoints(environment.getProperty("cassandra.host"));
        cluster.setPort(Integer.parseInt(environment.getProperty("cassandra.port")));
        return cluster;
    }
 
    @Bean
    public CassandraMappingContext cassandraMapping() 
      throws ClassNotFoundException {
        return new BasicCassandraMappingContext();
    }
}