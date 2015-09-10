package guru.dhaval.premierleague.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver = new FirefoxDriver();

	public static void goTo(String url) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static void close() {
		// TODO Auto-generated method stub
		driver.close();
		driver.quit();
	}
}
