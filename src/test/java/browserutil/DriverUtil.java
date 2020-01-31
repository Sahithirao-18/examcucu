package browserutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil
{
		public static WebDriver getDriver(String browser) 
		{
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\training_H2A.09.22\\Desktop\\selenium extracts\\chromedriver_win32 (1)\\chromedriver.exe");
				return new ChromeDriver();}
			
		else if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\training_H2A.09.22\\Desktop\\selenium extracts\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			 return new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) 
		{
			 System.setProperty("webdriver.ie.driver","C:\\Users\\training_H2A.09.22\\Desktop\\selenium extracts\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			 return new InternetExplorerDriver();
		}
		else 
		{
			return null;
		}
		}
}