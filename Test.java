package Junit;


import org.junit.Before;
import org.junit.After;

public class Test {
	@Before
	public void beforeCase() {
		System.out.println("welcome to JUnit");
	}
	@org.junit.Test
	public void testCase() {
		System.out.println("This is test Case");
	}
	@After
	public void afterCase() {
		System.out.println("Thank You");
	}

}
