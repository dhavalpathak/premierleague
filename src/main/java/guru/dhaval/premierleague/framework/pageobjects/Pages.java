package guru.dhaval.premierleague.framework.pageobjects;

import guru.dhaval.premierleague.framework.Browser;

import org.openqa.selenium.support.PageFactory;

public class Pages {
	
	public static LoginPage LoginPage() {
		LoginPage loginPage = new LoginPage();
		PageFactory.initElements(Browser.driver, loginPage);
		return loginPage;
	}

	public static AccountHomePage AccountHomePage() {
		// TODO Auto-generated method stub
		AccountHomePage accountHomePage = new AccountHomePage();
		PageFactory.initElements(Browser.driver, accountHomePage);
		return accountHomePage;		
	}
	
	public static TopMenuPage TopMenuPage() {
		TopMenuPage topMenuPage = new TopMenuPage();
		PageFactory.initElements(Browser.driver, topMenuPage);
		return topMenuPage;
	}
}

