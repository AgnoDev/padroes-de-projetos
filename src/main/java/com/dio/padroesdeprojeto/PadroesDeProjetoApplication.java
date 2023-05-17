package com.dio.padroesdeprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesDeProjetoApplication.class, args);
	}

}
