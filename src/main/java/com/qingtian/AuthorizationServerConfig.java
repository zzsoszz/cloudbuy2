package com.qingtian;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//OAuth2AuthorizationServerConfiguration
//AuthenticationManagerConfiguration
//http://stackoverflow.com/questions/19500332/spring-security-and-json-authentication
//http://stackoverflow.com/questions/24150621/spring-security-token-authentication-restful-json-service
//https://dzone.com/articles/spring-oauth2-with-jwt-sample
//UsernamePasswordAuthenticationFilter

/*
 * 授权
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig  extends AuthorizationServerConfigurerAdapter{
	@Autowired
	DataSource datasource;
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.jdbc(datasource);
//				.withClient("cloudbuyadmin")
//		 			.resourceIds("cloudbuy")
//		 			.authorizedGrantTypes("authorization_code", "implicit")
//		 			.authorities("ROLE_CLIENT")
//		 			.scopes("read", "write")
//		 			.secret("cloudbuypassword");
	}
}
