package BasicSeleniumFunctions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://sampleapp.tricentis.com/101/index.php");

	}
	

}
