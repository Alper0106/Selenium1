package day02_driversMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driversMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();//browser i tam sayfa yapar
        driver.get("http://amazon.com");
        System.out.println("actuel title: "+ driver.getTitle());
        System.out.println("actuel url: "+ driver.getCurrentUrl());

        driver.close();

    }
}
