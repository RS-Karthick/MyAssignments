package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	
	//click simple alert
	//driver.findElement(By.linkText("Show")).click();
	driver.findElement(By.xpath("//span[text()='Show']")).click();
	
	//transfer driver control to alert box
	Alert alert = driver.switchTo().alert();
//	String tt = alert.getText();
//	System.out.println(tt);
	System.out.println(alert.getText());
	alert.accept();
	
	//driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	driver.findElement(By.xpath("(//h5[text()=' Alert (Confirm Dialog)']/following::span)[2]")).click();
	System.out.println(alert.getText());
	alert.dismiss();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	System.out.println(alert.getText());
	alert.sendKeys("Karthick R");
	alert.accept();

	driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']/following::span[text()='Show']")).click();
	//driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
}
}
