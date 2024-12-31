package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {

	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Omega");
		return this;
	}
	
	public CreateLeadPage enterFirstname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kARthICk");
		return this;
	}
	
	public CreateLeadPage enterLastname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rs");
		return this;
	}
	
	public CreateLeadPage enterPhoneNumber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("81488456XX");
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage();
	}
}
