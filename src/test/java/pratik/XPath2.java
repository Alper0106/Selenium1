package pratik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPath2 {
    public static void main(String[] args) throws InterruptedException {
        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        //  b. Locate email textbox
        //  c. Locate password textbox ve
        //  d. Locate signin button
        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement EmailTextbox=driver.findElement(By.cssSelector("input[name='session[email]']"));
        WebElement PasswordTexbox=driver.findElement(By.cssSelector("input[placeholder='Password']"));
        WebElement SignInbuton=driver.findElement(By.cssSelector("input[data-test='submit']"));

        EmailTextbox.sendKeys("testtechproed@gmail.com");
        PasswordTexbox.sendKeys("Test1234!");
        SignInbuton.click();

        Thread.sleep(3000);
        //driver.close();


       /*
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://a.testaddressbook.com/sign_in");
       WebElement mailTextbox= driver.findElement(By.xpath("//input[@id='session_email']"));
        WebElement passwordTexbox= driver.findElement(By.xpath("//input[@type='password']"));
        WebElement SiginButtonu= driver.findElement(By.xpath("//input[@type='submit']"));

        mailTextbox.sendKeys("testtechproed@gmail.com");
        passwordTexbox.sendKeys("Test1234!");
        SiginButtonu.click();

        */

    }
}
