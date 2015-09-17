package guru.dhaval.premierleague.framework.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HistoryPage {

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'This Season']")
	private WebElement gameWeekH1;
	
	public boolean isAt() {
		// TODO Auto-generated method stub
		return gameWeekH1 != null;
	}
}
