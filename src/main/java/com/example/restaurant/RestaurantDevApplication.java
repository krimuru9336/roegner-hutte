package com.example.restaurant;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class RestaurantDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantDevApplication.class, args);
	}

}
