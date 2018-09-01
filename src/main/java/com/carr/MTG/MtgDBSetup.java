package com.carr.MTG;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories
class MtgDBSetup {

	@Bean
	public DataSource dataSource() {
		DataSource dataSource = null;

		return dataSource;
	}

}