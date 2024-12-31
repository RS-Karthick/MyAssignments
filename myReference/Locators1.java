package myReference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators1 {
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
	cd.findElement(By.id("accountName")).sendKeys("Azar kasali");
	WebElement industryWE = cd.findElement(By.name("industryEnumId"));
	Select sDD = new Select(industryWE);
	sDD.selectByValue("IND_SOFTWARE");
	WebElement ownerWE = cd.findElement(By.name("ownershipEnumId"));
	Select sDD1 = new Select(ownerWE);
	sDD1.selectByVisibleText("S-Corporation");
	WebElement sourceWE = cd.findElement(By.id("dataSourceId"));
	Select sDD2 = new Select(sourceWE);
	sDD2.selectByValue("LEAD_EMPLOYEE");
	WebElement marketWE = cd.findElement(By.id("marketingCampaignId"));
	Select sDD3 = new Select(marketWE);
	sDD3.selectByIndex(6);
	WebElement stateWE = cd.findElement(By.id("generalStateProvinceGeoId"));
	Select sDD4 = new Select(stateWE);
	sDD4.selectByValue("TX");
	cd.findElement(By.className("smallSubmit")).click();
	//cd.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
    String text = cd.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
    System.out.println(text);
    cd.close();
}
}
