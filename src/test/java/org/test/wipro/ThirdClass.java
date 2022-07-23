package org.test.wipro;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThirdClass {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeclass");	
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("afterclass");
	}
	@Before
	public void before() {
		System.out.println("before");

	}
	@After
	public void after() {
		System.out.println("after");

	}
	@Test
	public void test1() {
		System.out.println("test1");
	
		

	}
	@Test
	public void test2() {
		System.out.println("test2");

	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@Test
	public void test4() {
System.out.println("test4");
	}
}
