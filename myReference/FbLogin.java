package myReference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
public static void main(String[] args) throws Exception {
	ChromeDriver fb = new ChromeDriver();
	fb.get("https://www.facebook.com/login/");
	//Thread.sleep(5000);
	fb.manage().window().maximize();
	//Thread.sleep(8000);
	WebElement idName = fb.findElement(By.id("email"));
	idName.sendKeys("8148845684");
	//Thread.sleep(8000);
	WebElement pswrd = fb.findElement(By.id("pass"));
	pswrd.sendKeys("9715458814");
	fb.findElement(By.name("login")).click();
	String t = fb.getTitle();
	System.out.println(t);
}
}