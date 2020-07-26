package BasicSeleniumFunctions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch1Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChromeOptions chOption = new ChromeOptions();
		
		chOption.addArguments("--user-data-dir =C:\\Users\\lenovo pc\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		//chOption.setExperimentalOption("useAutomationExtension", false);
		chOption.addArguments("--start-maximized");
		ChromeDriver dr = new ChromeDriver(chOption);
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		

	}

}
