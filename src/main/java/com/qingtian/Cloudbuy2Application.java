package com.qingtian;

/*
 * EnableOAuth2Sso
 * OAuth2SsoDefaultConfiguration
 */
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.mysql.cj.jdbc.MysqlDataSource;
@SpringBootApplication
public class Cloudbuy2Application {
	@Bean
	public DataSource dataSource() {
		 MysqlDataSource datasource = new MysqlDataSource() ;  
		 datasource.setURL("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		 datasource.setPort(3306);
		 datasource.setUser("root");
		 datasource.setPassword("");
	     return datasource;
	}
	public static void main(String[] args) {
		SpringApplication.run(Cloudbuy2Application.class, args);
	}
}