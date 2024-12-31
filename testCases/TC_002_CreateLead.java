package testCases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_CreateLead extends ProjectSpecificMethod{
@Test
	public void runCreateLead() {
		LoginPage lp2 = new LoginPage();
		lp2.enterUserName()
		.entetPassword().clickLoginButton().clickCrmsfaLink().clickLeadsTab().clickCreateLeadLink().enterCompanyName().enterFirstname().enterLastname().enterPhoneNumber().clickCreateLeadButton().retriveLeadID();
	}
}
