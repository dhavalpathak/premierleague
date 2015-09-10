package guru.dhaval.premierleague;

import guru.dhaval.premierleague.framework.Browser;
import guru.dhaval.premierleague.framework.pageobjects.Pages;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestSetup {
  
  @SuppressWarnings("static-access")
  @BeforeTest
  public void beforeTest() {
	  Pages.LoginPage().goTo();
	  Pages.LoginPage().Login("dhaval_pathak2001@yahoo.com","kal100");
  }

  @AfterTest
  public void afterTest() {
	  Pages.TopMenuPage().Logout();
	  Browser.close();
  }
}
