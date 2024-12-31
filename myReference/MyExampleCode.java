package myReference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyExampleCode {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	WebElement we = driver.findElement(By.id("username"));
	we.sendKeys("democsr");
	WebElement we1 = driver.findElement(By.name("PASSWORD"));
	we1.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	String t = driver.getTitle();
	System.out.println(t);
//	Thread.sleep(5000);
//	driver.close();
}
}
