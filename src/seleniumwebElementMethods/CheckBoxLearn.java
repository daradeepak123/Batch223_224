package seleniumwebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleBaseCLass.BaseClass;

public class CheckBoxLearn {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chk1=driver.findElement(By.xpath("(//input)[1]"));
		WebElement chk2=driver.findElement(By.xpath("(//input)[2]"));
		
		
		boolean flag=chk1.isDisplayed();
		flag&=chk1.isEnabled();
		if(flag)
		{
			boolean b=chk1.isSelected();
			System.out.println(b);  
			if(!b)
			{
				chk1.click();
			}
			
		}
		
		flag=chk2.isDisplayed();
		flag&=chk2.isEnabled();
		if(flag)
		{
			boolean b=chk2.isSelected();
			System.out.println(b);  
			if(!b)
			{
				chk2.click();
			}
			
		}
		
		
		Thread.sleep(5000);
		BaseClass.quitBrowser(driver);
		
		
	}

}
