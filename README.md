# Testando Conexão com Cassandra, via Spring Data

## Subir o Cassandra via docker

**Comando para baixar e configar imagem no docker**

docker run --name cassandra-dev -v /Users/MyProjects/scripts/:/script -d -p "7191:7191" -p "7000:7000" -p "7001:7001" -p "9160:9160" -p "9042:9042" -e CASSANDRA_BROADCAST_ADDRESS=***HOST_DO_CASSANDRA*** cassandra:latest

**CQL para criar keyspace e tabela**

CREATE KEYSPACE dev
  WITH REPLICATION = { 
   'class' : 'SimpleStrategy', 
   'replication_factor' : 1 
  };

USE dev;

create table dev.god (id uuid primary key, name varchar, power varchar);

insert into dev.god (id, name, power) values (now(), 'Cthulhu', 'Unknown');

insert into dev.god (id, name, power) values (now(), 'Nyarlathotep', 'Tentacles');
