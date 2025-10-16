package seleBaseCLass;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static WebDriver openBrowser(String url)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter desired browser chrome/ff/edge/ie");
		String browser="chrome";
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("ff"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}else if(browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("grid"))
		{
			
		}
		
		else
		{
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		
		return driver;
		
	}
	
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
	

}
