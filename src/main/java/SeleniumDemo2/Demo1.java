package SeleniumDemo2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSource\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver Rajkumar = new ChromeDriver();
		
		Rajkumar.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.3.0");
		
		WebElement AspectLink = Rajkumar.findElement(By.linkText("Aspect Oriented"));
		AspectLink.click();
		
		Actions Raju=new Actions(Rajkumar);
		Raju.sendKeys(Keys.PAGE_DOWN).build().perform();
		Raju.sendKeys(Keys.PAGE_DOWN).build().perform();
		Raju.sendKeys(Keys.PAGE_DOWN).build().perform();

	}
	
}
