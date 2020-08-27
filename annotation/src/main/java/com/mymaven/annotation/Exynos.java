package com.mymaven.annotation;

import org.springframework.stereotype.Component;

@Component
public class Exynos implements Processor {

	public void process() {
		System.out.println("Samsung's Mobile processor");

	}

}
