package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		User user = context.getBean(User.class);
		System.out.println(user.getUserId());

	}
}