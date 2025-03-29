package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void LaunchDriver()
	{
		System.out.println("Running Test in Chrome");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test 1 Title is : " + driver.getTitle());
	}
	
	@Test
	public void Test2()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test 2 Title is : " + driver.getTitle());
	}
	
	@Test
	public void Test3()
	{
		driver.get("https://automationtalks.com/");
		System.out.println("Test 3 Title is : " + driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
