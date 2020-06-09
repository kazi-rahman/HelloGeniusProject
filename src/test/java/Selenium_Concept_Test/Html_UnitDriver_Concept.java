package Selenium_Concept_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import javax.sound.midi.Soundbank;
import java.util.concurrent.TimeUnit;


public class Html_UnitDriver_Concept {

    WebDriver driver;
    @Test
    public void runHtmlUnitDriver(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--headless","--disable gpu");
        //options.setHeadless(true);
        WebDriver driver= new ChromeDriver(options);

        /*Setup Firefox headless

        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options1= new FirefoxOptions().setHeadless(true);
        WebDriver driver= new FirefoxDriver(options1);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);*/

        driver.navigate().to("https://www.ikea.com/us/en/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }


}
