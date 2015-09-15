package guru.dhaval.premierleague;

import guru.dhaval.premierleague.framework.Browser;
import guru.dhaval.premierleague.framework.pageobjects.Pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class TestSetup {
  
	@BeforeSuite
	public void setupWebDriver() {
		String browser = (String)System.getProperty("browser");
		Browser.init(browser);
	}
	
	@BeforeTest
	@Parameters ({"userId", "password"}) 
	public void beforeTest(String userId, String password) {
		Pages.LoginPage().goTo();
		Pages.LoginPage().Login(userId, password);
	}

	@AfterTest
	public void afterTest() {
		Pages.TopMenuPage().Logout();
		Browser.close();
	}
  
	@AfterSuite
	public void ShutDownDriver() {
		Browser.shutDown();
	}
}
