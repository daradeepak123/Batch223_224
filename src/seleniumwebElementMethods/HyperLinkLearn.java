package seleniumwebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleBaseCLass.BaseClass;

public class HyperLinkLearn {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com");
		
		WebElement link=driver.findElement(By.xpath("//a[text()='A/B Testing']"));
		String linkText=link.getText();
		String linkURL=link.getAttribute("href");
		System.out.println(linkText+"\t"+linkURL);		
		
		link.click();
		System.out.println(driver.getCurrentUrl());
		
		BaseClass.quitBrowser(driver);
		
		
	}

}
