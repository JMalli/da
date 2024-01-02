package newalgoutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    
    public static Properties prop;
    public static WebDriver driver;
    public static String browserName;
    
    public BaseClass() {
        try {
            prop = new Properties();
            System.out.println("super constructor invoked");
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Configuration_files/Config.properties");
            prop.load(ip);
            //browserName =prop.getProperty(browserName);
            System.out.println("driver:" + driver);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }

    public static void launchApp() {
    	
    	
//        if (browserName == null) {
//            browserName = "chrome";
//        	System.out.println("Brower is Null");
//        }
//
//        if (browserName.equalsIgnoreCase("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        } else if (browserName.equalsIgnoreCase("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        }
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get(prop.getProperty("URL"));
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
