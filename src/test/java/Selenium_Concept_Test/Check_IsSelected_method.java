package Selenium_Concept_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Check_IsSelected_method {
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.navigate().to("https://www.ikea.com/us/en/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);


    }

    @Test
    public void register() throws InterruptedException {

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M15,12H9a5')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
        boolean x=driver.findElement(By.xpath("//input[@id='family-signup-form-profileType-0']")).isSelected();
        boolean x1=driver.findElement(By.xpath("//input[@id='family-signup-form-profileType-1']")).isSelected();

        System.out.println(x);
        System.out.println("This radio button is not selectd and boolean result is :"+x1);


        //perform double click on a WebElement
//        Actions act = new Actions(driver); // where driver is WebDriver type
//        WebElement ikeaLogo=driver.findElement(By.xpath("//img[@class='header__ikea-logo']"));
//        act.moveToElement(ikeaLogo).perform();
//        act.contextClick().perform();

        //switch to  popup window
       // Alert alt= driver.switchTo().alert();
        //alt.accept();


        //driver.findElement(By.xpath("//select[@id='family-signup-form-addressCountryCode']")).click();


        //Taking screenshot when assert.assertEqual() method fails and save this file *****
        driver.findElement(By.xpath("//option[@id='family-signup-form-addressCountryCode-0']")).click();

        EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);

        File srcFile = eDriver.getScreenshotAs(OutputType.FILE);

       // FileUtils.copyFile(srcFile, new File(""));
    }

    @After
    public void closeWindow(){
        //driver.close();
       // driver.quit();
    }








}





