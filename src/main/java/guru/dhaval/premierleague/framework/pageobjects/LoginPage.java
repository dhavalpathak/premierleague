package guru.dhaval.premierleague.framework.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import guru.dhaval.premierleague.framework.Browser;

public class LoginPage {

	protected static String url = "http://fantasy.premierleague.com/";
	@FindBy(id = "ismEmail")
	static WebElement userId;
	
	@FindBy(id = "id_password")
	static WebElement pass;
	
	@FindBy(how = How.CSS, using = "input[type=submit]")
	static WebElement submit;
	
	public void goTo() {
		Browser.driver.navigate().to(url);
	}

	public void Login(String userName, String password) {
		// TODO Auto-generated method stub
		userId.sendKeys(userName);
		pass.sendKeys(password);
		submit.click();
	}
}
