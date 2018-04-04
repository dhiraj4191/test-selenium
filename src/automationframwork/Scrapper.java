package automationframwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scrapper {
	public static void main (String args[]) {
		System.setProperty("webdriver.gecko.driver","/Users/dhiraj/Downloads/geckodriver");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.thyrocare.com/wellness");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		WebElement menu=driver.findElement(By.xpath("//a[contains(text(),'BOOK TEST')]"));
		driver.findElement(By.linkText("BOOK TEST")).click();
		
		
		
	}
}
