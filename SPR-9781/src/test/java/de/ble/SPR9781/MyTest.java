package de.ble.SPR9781;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({ "classpath:test-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

	@Test
	public void test(){
		assertTrue(true);
	}
}
