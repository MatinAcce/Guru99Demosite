package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	static WebDriver driver;
	//ChromeOptions options = new ChromeOptions();
	// options.addArguments("--incognito");

	// Initialize WebDriver with ChromeOptions


	public WebDriver InitializeBrowser(String Browsername ) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		// Initialize WebDriver with ChromeOptions

		if(Browsername.contains("chrome"))
		{
			driver =new ChromeDriver();
		}

		else if(Browsername.contains("firefox")) {


			driver =new FirefoxDriver();



		}


		return driver;
	}

	public static WebDriver getdriver() {

		return driver;
	}

}
