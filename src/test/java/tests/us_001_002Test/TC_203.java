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

public class TC_203 extends TestBaseRapor {

    TradylinnPage obj;

    @Test
    public void test203() throws InterruptedException {

        extentTest=extentReports.createTest("US_002_TC_203","Vendor'ın, Dashboard altında ise; Store manager, orders, downloads, \n" +
                "addresses , account details, appointments, wishlist,Support tickets, followings ve logoutu görmesi gerektigini test eder");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("tradylinn anasayfasına gider");

        obj.signinButton.click();
        extentTest.info("Login sayfasına yönlendirir");

        obj.mailBox.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Login girisi için gecerli email'i girer");

        obj.passwordBox.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Login girisi için gercerli password'ü girer");

        obj.loginButton.click();
        extentTest.pass("Login buttonunun calıstığını test eder");

        ReusableMethods.waitFor(3);
        obj.myAccountButton.click();
        extentTest.pass("myAccount butonunun calıstığını test eder");



        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(obj.storeManager.isDisplayed());
        softAssert.assertTrue(obj.dbOrders.isDisplayed());

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        softAssert.assertTrue(obj.dbDownloads.isDisplayed());
        softAssert.assertTrue(obj.dbAdress.isDisplayed());
        softAssert.assertTrue(obj.dbAccountDetails.isDisplayed());
        softAssert.assertTrue(obj.dbAppointments.isDisplayed());
        softAssert.assertTrue(obj.dbWishlist.isDisplayed());
        softAssert.assertTrue(obj.dbSupportTickets.isDisplayed());
        softAssert.assertTrue(obj.dbFollowing.isDisplayed());
        softAssert.assertTrue(obj.dbLogout.isDisplayed());
        extentTest.pass("Dashboard altında ; Store manager, orders, downloads,\n" +
                "        addresses , account details, appointments, wishlist\n" +
                "        Support tickets, followings ve logout butonlarının görünürlüğünü test eder");

        softAssert.assertAll();

        Driver.closeDriver();
    }
}
