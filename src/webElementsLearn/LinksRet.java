package webElementsLearn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleBaseCLass.BaseClass;

public class LinksRet {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/");
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		List<String> URLs=new ArrayList<String>();
		
		for(WebElement e:links)
		{
			URLs.add(e.getAttribute("href"));
		}
		
		
		for(String u:URLs)
		{
			driver.navigate().to(u);
			System.out.println(driver.getCurrentUrl());
		}
		
		
		
		
		
		int i=1;
		
		
		
		
		for(WebElement ele:links)
		{
			
			System.out.println(ele.getText()+"\t"+ele.getAttribute("href"));
			if(i!=1) {ele.click();}
			driver.navigate().to("https://the-internet.herokuapp.com/");
			driver.navigate().refresh();
			i++;
			
		}
		
		
		
		
		BaseClass.quitBrowser(driver);

	}

}
