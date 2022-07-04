package tests.us_001_002Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.us_001_002Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_202 extends TestBaseRapor {

    TradylinnPage obj;

    @Test
    public void test202() throws InterruptedException {

        extentTest=extentReports.createTest("US_002_TC_202","Vendor'ın, hesabında Orders, Downloads, addresses, \n"+
                        "account details, whishlist ve Logout'u görmesi gerektiğini test eder");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("tradylinn anasayfasına gider");

        obj.signinButton.click();
        extentTest.info("Login sayfasına yönlendirir");

        obj.mailBox.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Login girisi için gercerli email'i girer");

        obj.passwordBox.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Login girisi için gercerli password'ü girer");

        obj.loginButton.click();
        extentTest.pass("Login buttonunun calıstığını test eder");

        ReusableMethods.waitFor(3);
        obj.myAccountButton.click();
        extentTest.pass("myAccount butonunun calıstığını test eder");


        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(obj.orders.isDisplayed());
        softAssert.assertTrue(obj.dbDownloads.isDisplayed());
        softAssert.assertTrue(obj.adresses.isDisplayed());
        softAssert.assertTrue(obj.accountDetails.isDisplayed());
        softAssert.assertTrue(obj.wishlist.isDisplayed());
        softAssert.assertTrue(obj.logout.isDisplayed());
        extentTest.pass("Orders, Downloads, addresses,account details,whislist ve Logout'un  görüntülendigini test eder");

        softAssert.assertAll();

       Driver.closeDriver();

    }
}
