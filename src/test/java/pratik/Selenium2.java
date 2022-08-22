package pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium2 {
    /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- arama kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        String actualTagname= aramaKutusu.getTagName();
        String expectedTagname= "input";
        if (actualTagname.equals(expectedTagname)){
            System.out.println("arama kutusu tagname PASSED");
        }else {
            System.out.println("arama kutusu tagname FAILED");
        }

        String expectedAramaKutusuName= "field-keywords";
        String AramaKutusuName= aramaKutusu.getAttribute("name");

        if (expectedAramaKutusuName.equals(AramaKutusuName)){
            System.out.println("AramaKutusu gecti");
        }else {
            System.out.println(" arama kutusu kaldi");
        }


        driver.close();


    }
}
