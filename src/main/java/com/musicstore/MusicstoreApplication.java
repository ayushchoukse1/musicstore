package com.musicstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MusicstoreApplication extends SpringBootServletInitializer{

	/*Running as a JAR*/

	public static void main(String[] args) {
		SpringApplication.run(MusicstoreApplication.class, args);
	}



	/*Running as a WAR*/

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MusicstoreApplication.class);
	}
}
