package ru.thelenskyy.bookservices;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ru.thelenskyy.bookservices.entity.Book;

@SpringBootApplication
@EnableEurekaClient
public class BookServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServicesApplication.class, args);
	}
}
