package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last!");
	}

	@Test(groups={"Smoke"})
	public void demo2()
	{
		System.out.println("Smoke Test Case 2");
	}

	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first!");
	}
}
