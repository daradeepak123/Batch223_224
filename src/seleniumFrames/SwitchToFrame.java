package seleniumFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleBaseCLass.BaseClass;

public class SwitchToFrame {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=BaseClass.openBrowser("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		WebElement ele=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		System.out.println(ele.getText());
		
		driver.switchTo().defaultContent();
		
		
		BaseClass.quitBrowser(driver);
		
		

	}

}
