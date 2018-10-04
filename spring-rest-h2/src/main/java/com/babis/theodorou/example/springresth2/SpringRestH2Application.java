package com.babis.theodorou.example.springresth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.babis.theodorou.example.springresth2.controller.BasicRestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ComponentScan(basePackages = "com.babis.theodorou.example.springresth2")
@SpringBootApplication
@EntityScan(basePackages="com.babis.theodorou.example.springresth2")

@EnableJpaRepositories("com.babis.theodorou.example.springresth2")

@EnableSwagger2
@ComponentScan(basePackageClasses = BasicRestController.class)
public class SpringRestH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestH2Application.class, args);
	}
}
