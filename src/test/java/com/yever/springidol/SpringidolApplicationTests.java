package com.yever.springidol;

import com.yever.springidol.api.Performer;
import com.yever.springidol.exception.PerformanceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringidolApplicationTests {
	@Autowired
	@Qualifier("poemJuggler")
	private Performer performer;
	@Autowired
	@Qualifier("repo")
	private Performer performeranother;

	@Test
	public void testPerformer()  {
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPerformerAnother()  {
		try {
			performeranother.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}

	}

}
