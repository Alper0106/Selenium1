package day02_driversMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // amazon sitesine gidip Kaynek kodlarinda "Gateway" yazdigini test edin

        driver.get("https://www.amazon.com");
       String sayfaKaynakKodlari=  driver.getPageSource();
       String arananKelime= "Gateway";

       if (sayfaKaynakKodlari.contains(arananKelime)){
           System.out.println("kaynak kodu testi PASSED");
       }else {
           System.out.println("kaynak kodlarinda aranan kelime yok test FAILED");

       }
    }
}
