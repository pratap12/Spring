package com.mymaven.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mysamsung") //optional, default name is samsung
public class Samsung {
	
	@Autowired
	@Qualifier("exynos")
	
	Processor cpu;
	
	public Processor getCpu() {
		return cpu;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Samsung M31 \n 64mp camera \n 32mp front \n Amoled Display");
		cpu.process();
	}
}
