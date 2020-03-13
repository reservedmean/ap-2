package com.revaturelabs.ap2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Optional;

@Slf4j
@EnableAsync
@EnableFeignClients
@SpringBootApplication
public class Ap2Application {

	public static void main(String[] args) {

				log.info("{}",Optional
						.of("string")
						.map(s -> Optional.of("STRING")));

				log.info("{}", Optional.of("string")
				.flatMap(s -> Optional.of("STRING")));
		SpringApplication.run(Ap2Application.class, args);
	}

}
