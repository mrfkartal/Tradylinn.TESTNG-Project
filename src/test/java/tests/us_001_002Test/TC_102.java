package tests.us_001_002Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.us_001_002Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_102 extends TestBaseRapor {

    TradylinnPage obj;
    @Test
    public void test102() throws InterruptedException {
        extentTest=extentReports.createTest("US_001_TC_102","Registration sayfasında uc özellik olmalı;\n"+
                "email, password, confirm password");
        obj=new TradylinnPage();
        SoftAssert softAssert=new SoftAssert();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("tradylinn anasayfasına gider");

        obj.uyeOlButonu.click();
        extentTest.pass("Uye Ol butonunun calıştığını test eder");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        obj.becomeVendorButonu.click();
        extentTest.pass("Become a Vendor butonunun çalışabilirliğini test eder");

        softAssert.assertTrue(obj.registerEmail.isDisplayed(), "Register email özelliği mevcut");
        softAssert.assertTrue(obj.registerPassword.isDisplayed(), "Register Password özelliği mevcut");
        softAssert.assertTrue(obj.confirmRegisterPassword.isDisplayed(), "Register Confirm Password özelliği mevcut");
        extentTest.pass("Registration sayfasında \"email, password, confirm password inputlarının görülebilir olduğunu test eder");

        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        Thread.sleep(3000);

        softAssert.assertAll();

        Driver.closeDriver();

    }
}
