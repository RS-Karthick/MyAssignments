package myReference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesMyRef {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();

		//driver.switchTo().frame(0);
		//		driver.switchTo().frame("firstFr");
		WebElement wb = driver.findElement(By.xpath("//iframe[@name='firstFr']"));
		driver.switchTo().frame(wb);
		driver.findElement(By.name("fname")).sendKeys("Karthick");
		WebElement wele = driver.findElement(By.name("lname"));
		wele.sendKeys("Ravics");
		Thread.sleep(7000);
		String tt = wele.getText();
		System.out.println(tt);


		//		String text = driver.findElement(By.className("title has-text-info")).getText();		
		//		System.out.println(text);
		//		driver.switchTo().frame(1);
		//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rks");

		//		driver.switchTo().parentFrame();
		//		driver.findElement(By.name("lname")).sendKeys("Trichy");
		//		
		//		driver.switchTo().defaultContent();
		//		driver.findElement(By.linkText("Watch tutorial")).click();
	}
}
