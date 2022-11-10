package testscripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.PredefinedActions;
import pages.LoginPage;

public class LoginTest {
	//WebDriver driver;

	@Test
	public void tc1() {

		System.out.println("Step- Launch Chrome Browser and open the URL");
		PredefinedActions.start("https://dbborse-trials77.orangehrmlive.com/");

		LoginPage loginpage = new LoginPage();
		loginpage.login("Admin","@9GIfwdT7D");
		
		
		System.out.println("Verify Page tile - OrangeHRM");
		String Expectedtitle="Employee Management";
		String acualtile=loginpage.getpagetitle();
		Assert.assertEquals(acualtile, Expectedtitle,Expectedtitle);
		
		PredefinedActions.closeAllBrowser();
	}

}
