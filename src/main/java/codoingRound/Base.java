package codoingRound;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class Base {

	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException 
	{
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("D:\\EclipseWorkSpace\\TestVAGrant\\codingRound\\src\\main\\java\\Resources\\Data.properties");
		properties.load(file);
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		int implicitTime = Integer.parseInt(properties.getProperty("implicitTimeout"));
		
		if(browser.equals("chrome"))
		{
			setDriverPath();
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			// firefox code
		}
		else if(browser.contentEquals("IE"))
		{
			// IE code
		}
		
		driver.manage().timeouts().implicitlyWait(implicitTime, TimeUnit.MILLISECONDS);
    	driver.get(url);
        driver.manage().window().maximize();
        
		return driver;
	}
	
	private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
	}
}
