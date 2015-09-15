package guru.dhaval.premierleague.framework.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountHomePage {

	@FindBy(how = How.XPATH, using = "//h1[contains(text(), 'My Team') or contains(text(), 'Gameweek')]")
	WebElement h1;
	
	public boolean isAtTeamPage() {
		return h1 != null; 
	}
}
