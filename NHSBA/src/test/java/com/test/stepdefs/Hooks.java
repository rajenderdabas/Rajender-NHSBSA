package com.test.stepdefs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Hooks{	
	public static WebDriver driver = null;
	public static Scenario scenario;


	@Before
	public void initialize(Scenario scenario) throws Exception {
		this.scenario = scenario;

			if (readProperty("BROWSER") == null ||
					readProperty("BROWSER").equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			if (readProperty("BROWSER").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			WebDriverWait wait = new WebDriverWait(this.driver, 30);

			String url = readProperty("URL");
			driver.get(url);

	}

		@After
		public void tearDown (Scenario scenario) throws Exception {
			if (scenario.isFailed()) {
				takeScreenShot();
			}

			if (driver != null) {
				driver.quit();
			}

		}

		public static void takeScreenShot() {
			try {
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
		}

		public String readProperty (String key) throws IOException {
			Properties prop = new Properties();
			InputStream input = null;
			input = Files.newInputStream(Paths.get("src/test/resources/config.properties"));
			prop.load(input);
			return prop.getProperty(key);
		}


}

