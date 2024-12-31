package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
ChromeDriver fb = new ChromeDriver();
fb.get("https://www.facebook.com/login/");
WebElement Email = fb.findElement(By.id("email"));
Email.sendKeys("8148845684");
WebElement pswd = fb.findElement(By.id("pass"));
pswd.sendKeys("9715458814");
WebElement lg = fb.findElement(By.id("loginbutton"));
lg.submit();
fb.findElement(By.linkText("_xkv fsm fwn fcg")).submit();
	}
}
