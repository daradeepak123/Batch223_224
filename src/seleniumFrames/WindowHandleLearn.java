package seleniumFrames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleBaseCLass.BaseClass;

public class WindowHandleLearn {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/");

		String parentTabID=driver.getWindowHandle();
		System.out.println(parentTabID);
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		Set<String> tabs=driver.getWindowHandles();
		
		
		for(String s:tabs)
		{
			if(!s.equals(parentTabID))
			{
			driver.switchTo().window(s);
			driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
			Thread.sleep(3000);
			driver.close();
			Thread.sleep(3000);
			}
		}
		
		
		driver.switchTo().window(parentTabID);
		
		Thread.sleep(3000);
		

		BaseClass.quitBrowser(driver);

	}

}
