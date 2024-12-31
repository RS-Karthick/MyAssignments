package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws Exception {
	ChromeDriver dr = new ChromeDriver();
	dr.get("http://leaftaps.com/opentaps/");
	dr.manage().window().maximize();
	dr.findElement(By.id("username")).sendKeys("DemoCSR");
	dr.findElement(By.id("password")).sendKeys("crmsfa");
	dr.findElement(By.className("decorativeSubmit")).click();
	dr.findElement(By.linkText("CRM/SFA")).click();
	dr.findElement(By.linkText("Create Lead")).click();
	//Thread.sleep(5000);
	dr.findElement(By.id("createLeadForm_companyName")).sendKeys("COMCAST");
	//Thread.sleep(5000);
	dr.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");
	//Thread.sleep(5000);
	dr.findElement(By.id("createLeadForm_lastName")).sendKeys("RS");
	WebElement sourceWE = dr.findElement(By.id("createLeadForm_dataSourceId"));
	Select sourceDD = new Select(sourceWE);
	//Thread.sleep(5000);
	sourceDD.selectByIndex(4);
	WebElement marketingCM = dr.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select marketingDD = new Select(marketingCM);
	//Thread.sleep(5000);
	//marketingDD.selectByIndex(3);
	marketingDD.selectByVisibleText("Automobile");
WebElement ownershipWE =dr.findElement(By.id("createLeadForm_ownershipEnumId"));
Select ownershipDD = new Select(ownershipWE);
Thread.sleep(5000);
//ownershipDD.selectByIndex(6);
//ownershipDD.selectByVisibleText("Partnership");
ownershipDD.selectByValue("OWN_CCORP");
dr.findElement(By.className("smallSubmit")).click();
String tit = dr.getTitle();
System.out.println(tit);
Thread.sleep(5000);
dr.close();
}
}
