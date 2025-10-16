package seleniumwebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleBaseCLass.BaseClass;

public class WebTableLearn {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=BaseClass.openBrowser("https://the-internet.herokuapp.com/tables");
		
		WebElement data1_1=driver.findElement(By.xpath("//table[@id='table1']/tbody//tr[1]//td[1]"));
		
		System.out.println(data1_1.getText());
		
		
		int row=driver.findElements(By.xpath("//table[@id='table1']/tbody//tr")).size();

		int col=driver.findElements(By.xpath("//table[@id='table1']/tbody//tr[1]/td")).size();
		
		
		for(int i=1;i<=row;i++)   // 1
		{
			for(int j=1;j<=col;j++)
			{
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@id='table1']/tbody//tr["+i+"]//td["+j+"]"))));
				
				String data=driver.findElement(By.xpath("//table[@id='table1']/tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		BaseClass.quitBrowser(driver);
	}

}
