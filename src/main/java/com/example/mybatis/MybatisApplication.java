package com.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.example.mybatis" })
@MapperScan("com.example.mybatis.mapper")
public class MybatisApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Iniciando....");
		SpringApplication.run(MybatisApplication.class, args);
	}

}
