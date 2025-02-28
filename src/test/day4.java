package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day4 {
	
	

@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlname)
	{
		//selenium
		System.out.println("WebLoginHome");
		System.out.println("URL: "+urlname);
	}
	
	//@Test
	public void MobileLoginCarLoan()
	{
		//appium
		System.out.println("MobileLoginHome");
	}
	
	//@Test(timeOut=3000)
	public void MobileSigninCarLoan()
	{
		//appium
		System.out.println("MobileSigninHome");
	}
//	@Test(enabled=false)
	public void MobileLogOutCarLoan()
	{
		//appium
		System.out.println("MobileLogOutHome");
	}
	//@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void APILoginLoan()
	{
		//Rest API automation
		System.out.println("APILoginHome");
	}
	
//	@Test(groups= {"Smoke"})
	public void LoginLoan()
	{
		//Rest API automation
		System.out.println("Smoke Test Case 3");
	}
	
	//@BeforeSuite
	public void Bfsuite()
	{
		//Rest API automation
		System.out.println("Before Suite Here!");
	}
	
	//@AfterSuite
	public void Afsuite()
	{
		//Rest API automation
		System.out.println("After Suite Here!");
	}
}
