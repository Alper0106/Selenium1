package day04_xpath_cssLocator.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazo, gidip nutella aratalim

        driver.get("https://amazon.com");
        // findElement(By...locator) istedigimiz web elementini bize dondururu.
        // bizde o web elementini kullanmak icin bir objeye assign ederiz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        // WebElement aramaKutusu= driver.findElement(By.className("nav-search-field"));
        // bu locator calismadi
        // locator alirken gozumuzden kacan detaylar olabilir. aldigimiz bir locator calismazsa alternatif locator ler denemeliyiz

        //herhangi bir web elementine istedigimiz YAZIYI YOLLAMAK ISTERSEK

        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
}
