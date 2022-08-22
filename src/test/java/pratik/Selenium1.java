package pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Selenium1 {
    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver drive= new ChromeDriver();
        drive.manage().window().maximize();
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        drive.get("http://a.testaddressbook.com");

        WebElement SignInLink= drive.findElement(By.linkText("Sign in"));
        SignInLink.click();

        WebElement EMailButonu= drive.findElement(By.id("session_email"));
        WebElement PasswordButonu= drive.findElement(By.id("session_password"));
        WebElement SigninButonu= drive.findElement(By.name("commit"));

        EMailButonu.sendKeys("testtechproed@gmail.com");
       PasswordButonu.sendKeys("Test1234!");
       SigninButonu.click();

       WebElement UserId= drive.findElement(By.className("navbar-text"));
        System.out.println(UserId.getText());

        String ExpectedUser="testtechproed@gmail.com";

        if (ExpectedUser.equals(UserId.getText())){
            System.out.println("Expected User PASSED");
        }else {
            System.out.println("Expected User FAILED");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement AdressesDogrula= drive.findElement(By.linkText("Addresses"));
        WebElement Signout= drive.findElement(By.linkText("Sign out"));

        if(AdressesDogrula.isDisplayed()){
            System.out.println("Adressed testi gecti");
        }else {
            System.out.println("Adressed kaldi");
        }

        if(Signout.isDisplayed()){
            System.out.println("Signout testi gecti");
        }else {
            System.out.println("Signout kaldi");

        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> LinkSayisi= drive.findElements(By.tagName("a"));
        System.out.println("link sayisi: "+ LinkSayisi.size());

        for (WebElement each:LinkSayisi ) {
            System.out.println(each.getText());
        }

        drive.close();






    }
}
