package com.baseclassf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClassf {
    
    public static WebDriver driver;
    
   /*
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }
    */
    
    
  //for the cross browser testing we need to do that the below code
    //parameters name has to be matched in cross browser xml
    @BeforeMethod
    @Parameters("browser")
    public  void  setUp(String browser) {
        
        if(browser.equalsIgnoreCase("chrome")) {
            
        
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        driver =new ChromeDriver();//up casting polymorphism
        //driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        }else if(browser.equalsIgnoreCase("firefox")) {
            
            System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
            driver =new FirefoxDriver();//up casting polymorphism
            
            
        }else {
            System.out.println("The browser does not exist");
            
            
        }
        
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @Test
    public void openApplication() {
        driver.get("https://www.facebook.com/");
        
    }
    

}
