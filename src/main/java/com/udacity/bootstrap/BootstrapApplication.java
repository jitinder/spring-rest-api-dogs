package com.udacity.bootstrap;

import com.udacity.bootstrap.entity.ShowCharacter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApplication.class, args);
	}

	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			ShowCharacter character = restTemplate.getForObject("https://rickandmortyapi.com/api/character/1", ShowCharacter.class);
			System.out.println(character.toString());
		};
	}*/

}
