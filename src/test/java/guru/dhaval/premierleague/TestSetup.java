package guru.dhaval.premierleague;

import guru.dhaval.premierleague.framework.Browser;
import guru.dhaval.premierleague.framework.pageobjects.Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestSetup {
  
	private static String browser;
	@BeforeSuite
	public void setupWebDriver() {
		browser = (String)System.getProperty("browser");
	}
	
	@BeforeMethod
	@Parameters ({"userId", "password"}) 
	public void beforeTest(String userId, String password) {
		Browser.init(browser);
		Pages.LoginPage().goTo();
		Pages.LoginPage().Login(userId, password);
	}

	@AfterMethod
	public void afterTest() {
		Pages.TopMenuPage().Logout();
		Browser.close();
	}
  
	@AfterSuite
	public void ShutDownDriver() {
		Browser.shutDown();
	}
}
