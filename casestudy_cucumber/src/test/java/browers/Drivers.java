package browers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	public static WebDriver getDriver1(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			return new ChromeDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		return null;
	}

}
