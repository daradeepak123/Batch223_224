package seleniumwebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleBaseCLass.BaseClass;

public class DropDownLearn {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dw=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select sel=new Select(dw);
		
		sel.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		
		sel.selectByIndex(2);
		
		Thread.sleep(3000);
		
		sel.selectByValue("1");
		
		
		BaseClass.quitBrowser(driver);
	}

}
