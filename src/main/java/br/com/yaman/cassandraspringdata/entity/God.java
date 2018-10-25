package br.com.yaman.cassandraspringdata.entity;

import java.util.UUID;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Data
@Table
public class God {

//	 @PrimaryKeyColumn(
//      name = "isbn", 
//      ordinal = 2, 
//      type = PrimaryKeyType.CLUSTERED, 
//      ordering = Ordering.DESCENDING)
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
	 private UUID id;
	 
//	@PrimaryKeyColumn(
//		      name = "name", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	 @Column
	 private String name;

//	 @PrimaryKeyColumn(
//		      name = "power", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
	 @Column
	 private String power;

}
