package io.renren;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.renren.dao")
public class Renrengenerator {

	public static void main(String[] args) {
		SpringApplication.run(Renrengenerator.class, args);
	}
}
