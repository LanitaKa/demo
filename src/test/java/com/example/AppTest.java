package com.example;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import  java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;



public class AppTest  
{
    private WebDriver driver;

    @Before
    public void installDriver() {
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        
    }
    @Test
    public void goToChessly(){
        try {
            String url = "https://chessly.com/";
            driver.get(url);
            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/button[2]")).click();
            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.linkText("Courses")).click();
            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.linkText("Bootcamps")).click();
            TimeUnit.SECONDS.sleep(5);
            
            TakesScreenshot screenshot1 = (TakesScreenshot) driver;
            File src1 = screenshot1.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(src1, new File("screenshots/screenshot" + Math.random() + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            driver.navigate().back();
            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.linkText("Lectures")).click();
            TimeUnit.SECONDS.sleep(5);

            TakesScreenshot screenshot2 = (TakesScreenshot) driver;
            File src2 = screenshot2.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(src2, new File("screenshots/screenshot" + Math.random() + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div[2]/div[2]/div[1]/form/div/input"));
            inputField.sendKeys("Kasparov's Greatest Games");
            TimeUnit.SECONDS.sleep(5);

            TakesScreenshot screenshot3 = (TakesScreenshot) driver;
            File src3 = screenshot3.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(src3, new File("screenshots/screenshot" + Math.random() + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            inputField.submit();

            TakesScreenshot screenshot4 = (TakesScreenshot) driver;
            File src4 = screenshot4.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(src4, new File("screenshots/screenshot" + Math.random() + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.linkText("Courses")).click();
            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div[2]/div[4]/div[4]/div[1]/div/div[1]/button")).click();
            TimeUnit.SECONDS.sleep(5);
            driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div[2]/div[4]/div[4]/div[1]/div/div[2]/div/div/fieldset[1]/div[2]/label[3]/span/span")).click();
            TimeUnit.SECONDS.sleep(5);

            driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div[2]/div[4]/div[4]/div[4]/div/div[1]/button")).click();
            TimeUnit.SECONDS.sleep(5);
            WebElement sortByPrice = driver.findElement(By.xpath("/html/body/div/div/div[2]/main/div[2]/div[2]/div[4]/div[4]/div[4]/div/div[2]/div/div/div[1]/fieldset/div[2]/label[2]/span/span"));
            sortByPrice.click();
            TimeUnit.SECONDS.sleep(5);

            driver.navigate().refresh();
            TimeUnit.SECONDS.sleep(5);

            TakesScreenshot screenshot5 = (TakesScreenshot) driver;
            File src5 = screenshot5.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(src5, new File("screenshots/screenshot" + Math.random() + ".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            TimeUnit.SECONDS.sleep(5);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
           driver.quit();
        }      
    }
}
