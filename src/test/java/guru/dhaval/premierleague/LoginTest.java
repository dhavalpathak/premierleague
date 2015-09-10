package guru.dhaval.premierleague;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import guru.dhaval.premierleague.framework.Browser;
import guru.dhaval.premierleague.framework.pageobjects.*;


public class LoginTest extends TestSetup {
  
	@SuppressWarnings("static-access")
	@Test
	public void can_login_with_valid_id() {
		Assert.assertTrue(Pages.AccountHomePage().isAtTeamPage(), "Failed to login");
	}
}
