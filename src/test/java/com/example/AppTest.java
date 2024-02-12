package com.example;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.assertTrue;

public class AppTest  
{
    private WebDriver driver;

    @Before
    public void installDriver() {
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); 
    }
    @Test
    public void goToBooking(){
        try {
            String url = "https://www.booking.com";
            driver.get(url);
            TimeUnit.SECONDS.sleep(5);
            WebElement destinationField = driver.findElement(By.name("ss"));
            destinationField.sendKeys("Kyiv, Ukraine");
            TimeUnit.SECONDS.sleep(5);
            WebElement searchButton = driver.findElement(By.xpath("//button[@class='a83ed08757 c21c56c305 a4c1805887 f671049264 d2529514af c082d89982 cceeb8986b']"));
            searchButton.click();
            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
        
        
    }
}
