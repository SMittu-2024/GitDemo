package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day3 {
	
/*	@BeforeMethod
	public void beforeEveryMethodInClass()
	{
		
		System.out.println("Before Every Method in Class Day3!");
	}
	
	@AfterMethod
	public void afterEveryMethodInClass()
	{
		
		System.out.println("After Every Method in Class Day3!");
	}
*/
	

//@Parameters({"URL","APIKey"})
//	@Test
//	public void WebLoginCarLoan(String urlname, String key)
//	{
//		//selenium
//		System.out.println("WebLoginHome");
//		System.out.println("URL: "+urlname);
//		System.out.println("Key: "+key);
//	}
	
	@Test(dataProvider="getData")
	public void MobileLoginCarLoan(String usernm, String pwd)
	{
		//appium
		System.out.println("MobileLoginHome");
		System.out.println("UserName: "+usernm);
		System.out.println("Pwd: "+ pwd);
	}
	
	@Test(timeOut=3000)
	public void MobileSigninCarLoan()
	{
		//appium
		System.out.println("MobileSigninHome");
	}
	@Test(enabled=false)
	public void MobileLogOutCarLoan()
	{
		//appium
		System.out.println("MobileLogOutHome");
	}
	@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void APILoginLoan()
	{
		//Rest API automation
		System.out.println("APILoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginLoan()
	{
		//Rest API automation
		System.out.println("Smoke Test Case 3");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		//Rest API automation
		System.out.println("Before Suite Here!");
	}
	
	@AfterSuite
	public void Afsuite()
	{
		//Rest API automation
		System.out.println("After Suite Here!");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//three user sets- username and password as input in array
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstusrname";
		data[0][1] = "firstusrpwd";
		
		//2nd set
		data[1][0] = "secondusrname";
		data[1][1] = "secondusrpwd";
		
		//3rd set
		data[2][0] = "thirdusrname";
		data[2][1] = "thirdusrpwd";
		
		return data;
	}
}
