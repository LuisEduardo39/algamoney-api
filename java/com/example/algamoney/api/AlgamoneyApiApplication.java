package com.example.algamoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgamoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgamoneyApiApplication.class, args);
	}

}

/*
 * Status code: 2xx -> Sucesso 4xx -> Erro o cliente 5xx -> Erro no
 * serviço/servidor
 */