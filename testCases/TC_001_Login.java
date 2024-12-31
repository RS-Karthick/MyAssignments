package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod{
@Test
	public void runLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUserName()
		.entetPassword()
		.clickLoginButton();
//		.clickCrmsfaLink()
//		.clickLeadsTab()
//		.clickCreateLeadLink()
//		.enterCompanyName()
//		.enterFirstname()
//		.enterLastname()
//		.enterPhoneNumber().clickCreateLeadButton();
		
	}
}
