package Practice;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUplod {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		Actions SS=new Actions(driver);
		
		SS.sendKeys(Keys.DOWN).build().perform();
		SS.sendKeys(Keys.DOWN).build().perform();
		SS.sendKeys(Keys.DOWN).build().perform();
		SS.sendKeys(Keys.DOWN).build().perform();
		WebElement Files=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		
		JavascriptExecutor vp=(JavascriptExecutor)driver;
		
		vp.executeScript("arguments[0].click", Files);
		
		System.out.println("Upload File option Clickable ");
		
		StringSelection DP= new StringSelection("D:\\ScreenSchot\\Screen.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(DP,null);
		
		Robot vs=new Robot();
		
		vs.delay(1000);
		
		vs.keyPress(KeyEvent.VK_CONTROL);
		vs.keyPress(KeyEvent.VK_V);
		
		vs.keyRelease(KeyEvent.VK_CONTROL);
		vs.keyRelease(KeyEvent.VK_V);
		
		
		vs.keyPress(KeyEvent.VK_ENTER);
		vs.keyRelease(KeyEvent.VK_ENTER);
		
		
		System.out.println("Upload File Succefully Done");
		
		
		
	}

}
