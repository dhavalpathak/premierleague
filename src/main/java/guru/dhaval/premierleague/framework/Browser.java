package guru.dhaval.premierleague.framework;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {

	public static WebDriver driver;
	private static final String CHROME_DRIVER = "c:" + File.separator + "chrome" +  File.separator +   "chromedriver.exe";
    private static final String IE_DRIVER = "c:" + File.separator + "ie" +  File.separator  +  "IEDriverServer.exe";	
	
    public static void init(String browser) {
		if (browser.toLowerCase().equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.toLowerCase().equals("ie")) {
			System.setProperty("webdriver.ie.driver", IE_DRIVER);
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			//caps.setCapability( InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			//caps.setCapability("requireWindowFocus", true);
			//caps.setCapability("ie.ensureCleanSession", true);
			//driver = new InternetExplorerDriver(caps);
			driver = new InternetExplorerDriver();
		} else if (browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
	}
	
	public static void shutDown() {
		driver.quit();
	}
}
