package guru.dhaval.premierleague;

import guru.dhaval.premierleague.framework.pageobjects.Pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HistoryTest extends TestSetup {
 
	@Test
	public void open_History_Page() {
	  Pages.AccountHomePage().goToHistoryPage();
	  Assert.assertTrue(Pages.HistoryPage().isAt());
	}
}
