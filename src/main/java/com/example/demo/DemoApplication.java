package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    ResponseEntity<Flux<String>> hello() {
        return ResponseEntity.ok(Flux.just("Ola, ", "Bien vindo, ", "Hello !"));
    }
}


