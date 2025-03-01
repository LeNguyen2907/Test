package service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    ChromeDriver driver;

    @BeforeEach
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testSelenium () throws InterruptedException {

        driver.get("https://vitimex.com.vn/");

//        driver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']//*[name()='path' and contains(@d,'M3 20C5.33')]")).click();
//
//        Thread.sleep(2000);

//        DangKy
//        driver.findElement(By.xpath("//a[contains(text(),'Đăng ký tài khoản mới')]")).click();
//
//        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Le Nguyen");
//        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0456789987");
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nguyen@gmail.com");
//        driver.findElement(By.xpath("//input[@id='pass-regis']")).sendKeys("Nguyen123");
//        driver.findElement(By.xpath("//input[@id='pass-confirm']")).sendKeys("Nguyen123");
//
//        driver.findElement(By.xpath("//a[@id='register-btn']")).click();

//        DangNhap
//        driver.findElement(By.xpath("//input[@id='account']")).sendKeys("0456789987");
//        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Nguyen123");
//
//        driver.findElement(By.xpath("//a[@id='signin-btn']")).click();
    }
}
