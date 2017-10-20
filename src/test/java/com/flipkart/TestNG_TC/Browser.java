package com.flipkart.TestNG_TC;

import org.testng.annotations.Test;

import com.flipkart.Repository.Library;

import org.testng.annotations.BeforeSuite;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class Browser {
	public static WebDriver driver;
  @BeforeSuite
  public void initializingBrowser() {
	  System.out.println("in browser");
		driver=new FirefoxDriver();
		 driver.get(Library.URL);
  }
  @Test
  public void f()
  {
	 // System.out.println("in test");
  }

  /*@AfterSuite
  public void closingBrowser() {
	  driver.close();
  }*/

}
