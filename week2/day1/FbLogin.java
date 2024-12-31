package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {
public static void main(String[] args) {
	ChromeDriver cd = new ChromeDriver();
	cd.manage().window().maximize();
	cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	cd.get("https://en-gb.facebook.com/");
	cd.findElement(By.linkText("Create new account")).click();
	cd.findElement(By.name("firstname")).sendKeys("Azar");
	cd.findElement(By.name("lastname")).sendKeys("Mohammed");
	cd.findElement(By.name("reg_email__")).sendKeys("8124648094");
	cd.findElement(By.id("password_step_input")).sendKeys("8148845684");
	WebElement dayWE = cd.findElement(By.id("day"));
	Select dd1 = new Select(dayWE);
	dd1.selectByIndex(1);
	WebElement monthWE = cd.findElement(By.id("month"));
	Select dd2 = new Select(monthWE);
	dd2.selectByValue("3");
	WebElement yearWE = cd.findElement(By.id("year"));
	Select dd3 = new Select(yearWE);
	dd3.selectByVisibleText("1993");
	cd.findElement(By.xpath("//input[@value='2']")).click();
}
}
