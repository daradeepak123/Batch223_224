package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleBaseCLass.BaseClass;

public class MoveToElementLearn {
	
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com");
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Typos']"));
		
		Actions ac=new Actions(driver);
		
		
		ac.scrollToElement(link).build().perform();
		
		Thread.sleep(5000);
		
		
		
		BaseClass.quitBrowser(driver);
		
	}

}
