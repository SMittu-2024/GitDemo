package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day1 {
	
//comment from gitDemo
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Executing Before Class Day1!");
		System.out.println("Architect1 on GitDemo!");
		System.out.println("Architect2 on GitX!");
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
		System.out.println("Smoke Test Case 2");
		System.out.println("Smoke Test Case 3");
		//Changes from GitX User
		System.out.println("Smoke Test Case 1");
		System.out.println("Smoke Test Case 2");
		System.out.println("Smoke Test Case 3");
	}

	@Test
	public void demo1()
	{
		System.out.println("BYE!");
		Assert.assertTrue(false);
	}
}
