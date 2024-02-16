package com.recyclaback.recyclaback;

import com.recyclaback.recyclaback.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RecyclabackApplication {

	@Autowired
	ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(RecyclabackApplication.class, args);
	}

	@Configuration
	public class CorsConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("http://localhost:3000") // Autoriser les requêtes provenant de localhost:3000
					.allowedMethods("GET", "POST", "PUT", "DELETE") // Autoriser les méthodes HTTP spécifiées
					.allowCredentials(true); // Autoriser les cookies et les en-têtes d'authentification
		}
	}
}
