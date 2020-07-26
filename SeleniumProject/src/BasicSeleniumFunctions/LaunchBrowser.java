package BasicSeleniumFunctions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Set Chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");				
		//ChromeDriverService chSvc = new ChromeDriverService.Builder()
              //  .usingDriverExecutable(new File("D:\\Drivers\\chrome84\\chromedriver.exe")).usingAnyFreePort().build();
        ChromeOptions chOption = new ChromeOptions();
        
       // chOption.addArguments("user-data-dir =C:\\Users\\lenovo pc\\AppData\\Local\\Google\\Chrome\\User Data");
        //chOption.addArguments("--start-maximized"); 
        //chOption.setExperimentalOption("useAutomationExtension", false);
        //chOption.addArguments("--disable-extensions");


        ChromeDriver dr = new ChromeDriver(chOption);
        dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/index.php");
		
		//Click and get text
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		String data=ele.getText();
		System.out.println(data);
		//ele.click();

		//Enter Text
		dr.findElement(By.id("search_form")).sendKeys("VW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);

        
        
	}

}
