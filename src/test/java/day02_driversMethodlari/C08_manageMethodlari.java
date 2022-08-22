package day02_driversMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class C08_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);
        // maximize iken boyutlari alalim
        System.out.println("pencere olculeri: "+ driver.manage().window().getSize());
        System.out.println("pencere olculeri: "+ driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        // fullscreeniken boyutlari alalim
        System.out.println("fullscreen konum : " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : " + driver.manage().window().getSize());
    }
}
