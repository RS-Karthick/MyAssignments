package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcc3 {
	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("http://leaftaps.com/opentaps/");
		cd.findElement(By.id("username")).sendKeys("democsr");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		cd.findElement(By.linkText("Create Lead")).click();
		cd.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");
		cd.findElement(By.id("createLeadForm_lastName")).sendKeys("RS");
		cd.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		cd.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Employee Details");
		cd.findElement(By.className("smallSubmit")).click();
		String title = cd.getTitle();
		System.out.println(title);
		cd.close();
	}

}
