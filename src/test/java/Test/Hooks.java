package Test;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.BeforeAll;
import pages.Baseclass;

public class Hooks {
	static WebDriver driver;
	@BeforeAll
	public static void LounchBrowser() throws IOException {
		
		
		Properties prop =new Properties();
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Execution\\prop.properties";
		FileInputStream fs=new FileInputStream(path);
		
		prop.load(fs);
		
		
		String BroName = prop.getProperty("browsername");
		
		Baseclass bs=new Baseclass();
		
	 driver = bs.InitializeBrowser(BroName);

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}

}
