package com.mymaven.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary we may use "Qualifier" annotation or primary just to not have any confusion

public class Snapdragon implements Processor {

	public void process() {

		System.out.println("The best processor");

	}

}
