package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public static void test() {
		assertTrue(1==1);
		MyInteger num1 = new MyInteger(6);
		MyInteger num2 = new MyInteger(7);
		assertEquals(num1.isEven(),true);
		assertEquals(num2.isEven(),false);
		assertEquals(num1.isOdd(),false);
		assertEquals(num2.isOdd(),true);
		assertEquals(num1.isPrime(),false);
		assertEquals(num2.isPrime(),true);
		assertEquals(MyInteger.isEven(6),true);
		assertEquals(MyInteger.isEven(7),false);
		assertEquals(MyInteger.isOdd(6),false);
		assertEquals(MyInteger.isOdd(7),true);
		assertEquals(MyInteger.isPrime(6),false);
		assertEquals(MyInteger.isPrime(7),true);
		assertEquals(MyInteger.isEven(num1),true);
		assertEquals(MyInteger.isEven(num2),false);
		assertEquals(MyInteger.isOdd(num1),false);
		assertEquals(MyInteger.isOdd(num2),true);
		assertEquals(MyInteger.isPrime(num1),false);
		assertEquals(MyInteger.isPrime(num2),true);
		
		assertEquals(num1.equals(6),true);
		assertEquals(num1.equals(7),false);
		assertEquals(num1.equals(num2),false);
	}

}
