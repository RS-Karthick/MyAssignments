package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActions {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.google.co.in/");
	
	WebElement activeElement = driver.switchTo().activeElement();
	
	activeElement.sendKeys("TestLeaf",Keys.ENTER);
	
//	driver.findElement(By.name("q")).sendKeys("TestLeaf",Keys.ENTER);
	
	WebElement element = driver.findElement(By.cssSelector("h3"));
	
	Actions builder = new Actions(driver);
	
	builder.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).perform();
	
	
	
}
}
