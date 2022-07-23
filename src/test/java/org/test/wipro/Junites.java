package org.test.wipro;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junites {
	static WebDriver driver ;
public static void beforeClass() {
	WebDriverManager.chromedriver().setup();
    driver  = new  ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
}
   @AfterClass
  public static void afterClass() {
	driver.quit();

}
    @Before 
   public void before() {
	Date d = new Date ();
	System.out.println(d);
}
    @After
    public void after() {
		Date d = new Date ();
		System.out.println(d);
		
	}  
    @Test
        public void test1() {
			driver.findElement(By.id("email")).sendKeys("greens");
        	driver.findElement(By.name("pass")).sendKeys("password1$");
        	driver.findElement(By.name("login")).click();
        	
		}
    
}
