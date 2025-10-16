package seleniumFunctionalFlow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleBaseCLass.BaseClass;
import utils.SeleniumHelper;

public class LoginOrangeHRM {
static WebDriver driver;
	static SeleniumHelper sh=new SeleniumHelper();
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement lgnBtn=driver.findElement(By.xpath("//button"));
		
		
		sh.SendDataToTB(driver, uname, "Admin");
		sh.SendDataToTB(driver, pwd, "admin123");
		sh.clickElement(driver, lgnBtn);
		
		Thread.sleep(5000);
		
		WebElement hdr=driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		String header=sh.readDataFromElement(driver, hdr);
		if(header.contains("Dashboard"))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("Tc fail");
		}
		
		
		
		BaseClass.quitBrowser(driver);
	
	}

}
