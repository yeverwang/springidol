package com.yever.springidol;

import com.yever.springidol.api.Performer;
import com.yever.springidol.exception.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringidolApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("poemJuggler")
	Performer performer;
	public static void main(String[] args) {
		SpringApplication.run(SpringidolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
}
