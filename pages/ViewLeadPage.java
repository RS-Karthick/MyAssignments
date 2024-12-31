package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod {

	public ViewLeadPage retriveLeadID() {
		
		String replaceAll = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]","");
		
		int id = Integer.parseInt(replaceAll);
		System.out.println("Company ID is : "+id);
		
//		Assert.assertTrue(id<0, "ID is not crated pls check again");
		
		Assert.assertFalse(id>0, "ID is created");
		return this;
	}
}
