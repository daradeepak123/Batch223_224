package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleBaseCLass.BaseClass;

public class RightClick {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/tables");
		
		Actions act=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("(//a[text()='edit'])[1]"));
		
		act.contextClick(ele).build().perform();
		
		Thread.sleep(3000);
		
		BaseClass.quitBrowser(driver);

	}

}
