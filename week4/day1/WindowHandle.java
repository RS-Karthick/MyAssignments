package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		String windowHandle1 = driver.getWindowHandle();
		System.out.println(windowHandle1);
		//896D117C534146E8AC2B06221320A5CD
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println(driver.getTitle());
	}

}
