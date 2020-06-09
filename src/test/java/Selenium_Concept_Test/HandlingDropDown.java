package Selenium_Concept_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HandlingDropDown {

    WebDriver driver;
    @Test
    public void drop_down() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement el1=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        Select dpdn   = new Select(el1);
        Thread.sleep(3000);
        dpdn.selectByVisibleText("Database Testing");
        Thread.sleep(3000);
        dpdn.selectByIndex(2);






    }


}
