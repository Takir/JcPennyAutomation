package pom.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pom.utility.ReadPropFile;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	@Before
	public void open1() throws IOException {
		//prop=ReadPropFile.readFile("/Users/bittech/eclipse-workspace/pomProject/config.properties");
		//String browser=prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		if(driver.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver=new ChromeDriver();
		}else if(driver.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			//System.setProperty("webdriver.gecko.driver", "path of geckodriver");
			driver=new FirefoxDriver();
		}else if(driver.equals("ie"))
		{
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver=new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}


}
