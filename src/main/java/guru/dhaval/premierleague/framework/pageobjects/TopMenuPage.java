package guru.dhaval.premierleague.framework.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TopMenuPage {

	@FindBy (how = How.LINK_TEXT, using = "Logout")
	private static WebElement logoutLink;
	
	public void Logout() {
		// TODO Auto-generated method stub
		logoutLink.click();
	}
}
