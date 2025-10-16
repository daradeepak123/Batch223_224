package seleniumLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
		
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
