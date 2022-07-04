package tests.us_001_002Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_001_002Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_105Negative extends TestBaseRapor {

    TradylinnPage obj;
    @Test
    public void test105Negative() throws InterruptedException {

        extentTest=extentReports.createTest("US_001_TC_105(Negative)","Girilen mail adresinin ununique olması durumunda\n"+
                "beklenen sonucun alındığını test eder");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("tradylinn anasayfasına gider");

        obj.uyeOlButonu.click();
        extentTest.pass("Uye Ol butonunun calıştığını test eder");

        obj.becomeVendorButonu.click();
        extentTest.pass("Become a Vendor butonunun çalışabilirliğini test eder");

        obj.registerEmail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Email inputuna ununique mail adresi gönderildiğini test");

        obj.registerPassword.sendKeys(ConfigReader.getProperty("samePassword"));
        extentTest.info("Password kısmına aynı şifrenin gönderilebildiğini test eder");

        obj.confirmRegisterPassword.sendKeys(ConfigReader.getProperty("samePassword"));
        extentTest.info("Confirm Password inputuna aynı şifrenin gönderilebildiğini test eder");

        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        js.executeScript("arguments[0].click();",obj.registerButton);
        extentTest.pass("Register butonunun calıstığını test eder");

        Assert.assertTrue(obj.errorMesajı.isDisplayed());
        extentTest.pass("unique email adresi ile vendor üyeliği işleminin gerçekleştirilemediğini test eder");
        Driver.closeDriver();

   }
}
