package com.acnovate.hexm.esm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.acnovate.hexm.esm")
public class HexmEsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexmEsmApplication.class, args);
	}
}
