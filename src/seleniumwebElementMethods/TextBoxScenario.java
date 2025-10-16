package seleniumwebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleBaseCLass.BaseClass;

public class TextBoxScenario extends BaseClass{

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/forgot_password");
		
		
		WebElement forgetPWDHeader=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		boolean flag=forgetPWDHeader.isDisplayed();
		flag&=forgetPWDHeader.isEnabled();
		if(flag) {
		String data=forgetPWDHeader.getText();
		System.out.println(data);
		}
		else
		{
			System.out.println("WebElement you are looking is not displayed/enabled");
		}
		
		WebElement emailEle=driver.findElement(By.xpath("//label[text()='E-mail']"));
		flag=emailEle.isDisplayed();
		flag&=emailEle.isEnabled();
		if(flag)
		{
			System.out.println(emailEle.getText());
		}
		else
		{
			System.out.println("not displayed");
		}
		
		WebElement tb=driver.findElement(By.xpath("//input[contains(@id,'em')]"));
		flag=tb.isDisplayed();
		flag&=tb.isEnabled();
		if(flag)
		{
			tb.clear();
			tb.sendKeys("email@email.com");
		}
		
		
				
		driver.findElement(By.xpath("//button")).click();
		
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		
		Thread.sleep(5000);
		
		quitBrowser(driver);
		

	}

}
