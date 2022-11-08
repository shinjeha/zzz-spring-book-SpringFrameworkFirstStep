package com.example.demo;

import com.example.demo.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	/**
	 * 메인 메서드
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
				.getBean(DemoApplication.class).excute();
	}

	/**
	 * 주입하는 곳(인터페이스)
	 */
	@Autowired
	Greet greet;

	/**
	 * 실행 메서드
	 */
	private void excute() {
		greet.greeting();
	}
}
