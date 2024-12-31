package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcc2 {
public static void main(String[] args) {
	ChromeDriver cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.get("http://leaftaps.com/opentaps/");
	cd.findElement(By.id("username")).sendKeys("democsr");
	cd.findElement(By.id("password")).sendKeys("crmsfa");
	cd.findElement(By.className("decorativeSubmit")).click();
	cd.findElement(By.linkText("CRM/SFA")).click();
	cd.findElement(By.linkText("Accounts")).click();
	cd.findElement(By.linkText("Create Account")).click();
	cd.findElement(By.id("accountName")).sendKeys("RSKarthick");
	cd.findElement(By.id("numberEmployees")).sendKeys("50");
	cd.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	cd.findElement(By.className("smallSubmit")).click();
	String title = cd.getTitle();
	System.out.println(title);
	cd.close();
}
}
