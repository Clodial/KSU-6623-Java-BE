package com.ksu6623.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class ApiConfig {

	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	@Import(LocalConfiguration.class)
	public @interface EnableApiMicroservice {
		
	}
	
	@Configuration
	public static class LocalConfiguration {
		
	}
	
}
