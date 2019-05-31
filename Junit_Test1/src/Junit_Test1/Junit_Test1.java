package Junit_Test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit_Test1 {

	@Test
	public void addTest() {
		Junit_Test junit = new Junit_Test();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	}
	
	@Test
	public void ConcatTest() {
		Junit_Test junit2 = new Junit_Test();
		String result = junit2.concat("Hello", "World");
		assertEquals("HelloWorld",result);
	}
	
}
