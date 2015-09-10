package guru.dhaval.premierleague;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import guru.dhaval.premierleague.framework.Browser;
import guru.dhaval.premierleague.framework.pageobjects.*;


public class LoginTest {
  
	@SuppressWarnings("static-access")
	@Test
	public void can_login_with_valid_id() {
	  
		Pages.LoginPage().goTo();
		Pages.LoginPage().Login("dhaval_pathak2001@yahoo.com","kal100");
		Assert.assertTrue(Pages.AccountHomePage().isAtTeamPage(), "Failed to login");
	}
	
	@AfterMethod
	public void logout() {
		Pages.TopMenuPage().Logout();
	}
	
	@AfterTest
	public void closeWindow() {
		Browser.close();
	}
}
