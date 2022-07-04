package tests.us_001_002Test;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_001_002Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_103 extends TestBaseRapor {
    TradylinnPage obj;
    @Test
    public void test103() throws InterruptedException {

        extentTest=extentReports.createTest("US_001_TC_103","Email'in girilmesi gerektiğini ( geçerli bir email olmalı) ve\n" +
                "güçlü bir password olusturulması: \n" +
                "kucuk harf, büyük harf, rakam ve special karakter kullanılması gerektiğini test eder");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("tradylinn anasayfasına gider");

        obj.uyeOlButonu.click();
        extentTest.pass("Uye Ol butonunun calıştığını test eder");

        obj.becomeVendorButonu.click();
        extentTest.pass("Become a Vendor butonunun çalışabilirliğini test eder");

        Faker faker=new Faker();
        obj.registerEmail.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email inputuna gecerli mail adresi gönderilebildiğini test");

        obj.registerPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("Password kısmına uygun özelliklerdeki şifrenin gönderilebildiğini test eder");

        obj.confirmRegisterPassword.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("//Confirm Password inputuna aynı şifrenin gönderilebildiğini test eder");

        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();",obj.registerButton);
        extentTest.pass("Register butonunun calıstığını test eder");

        Thread.sleep(3000);
        Assert.assertTrue(obj.greenBlock.isDisplayed());
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        extentTest.pass("Uyelik isleminin basarılı olduğunu içeren green block'un görüntülendiğini test eder");

        Driver.closeDriver();

    }
}


