package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Executing Before Class Day1!");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Executing After Class Day1!");
	}
	
	@Test(groups={"Smoke"})
	public void demo()
	{
		System.out.println("Smoke Test Case 1");
	}

	@Test
	public void demo1()
	{
		System.out.println("BYE!");
		Assert.assertTrue(false);
	}
}
