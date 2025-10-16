package seleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleBaseCLass.BaseClass;

public class DragAndDropLearn {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/drag_and_drop");
	
		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions act=new Actions(driver);
		
	
		
		
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(5000);
		
		BaseClass.quitBrowser(driver);
		
		
	}

}
