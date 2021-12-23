package util;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CBT {

	@Parameters("browser")
	@BeforeMethod
	public void openBrowser(String browser) {

		if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
		} else {
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}

	}

}
