package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {


	public void clickElement(WebDriver driver,WebElement  ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(ele));

		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.click();
		}
		else
		{
			System.out.println("Not able to click the element you are trying");
		}


	}


	public void SendDataToTB(WebDriver driver,WebElement  ele,String data)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(ele));

		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			ele.clear();
			ele.sendKeys(data);
		}
		else
		{
			System.out.println("Not able to click the element you are trying");
		}
	}

	public String readDataFromElement(WebDriver driver,WebElement  ele)
	{

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(ele));
		String data=null;
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		if(flag)
		{
			data=ele.getText();
			return data;
		}
		else
		{
			System.out.println("Not able to click the element you are trying");
		}
		return data;
	}


}
