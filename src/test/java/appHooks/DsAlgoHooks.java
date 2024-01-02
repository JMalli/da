package appHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DsAlgoHooks {
 
	private static WebDriver driver;
   // @Before
   // getDriver().manage().window().maximize();
	//getDriver().manage().deleteAllCookies();
	@Before
	public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    
//	@After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//        	String screenshotName = scenario.getName().replaceAll(" ", "_");
//           byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//           scenario.attach(screenshot, "image/png", screenshotName); 
//        }   
//    }
    
	@After
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
}
}
