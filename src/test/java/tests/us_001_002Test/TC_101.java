package tests.us_001_002Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_001_002Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_101 extends TestBaseRapor {

    TradylinnPage obj;

    @Test
    public void test101() throws InterruptedException {

        extentTest=extentReports.createTest("US_001_TC_101","user, vendor olarak kayıt için\n" +
                "-Become a Vendor- butonu ile navigate eder");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
         extentTest.info("tradylinn anasayfasına gider");

        obj.uyeOlButonu.click();
        extentTest.pass("Uye Ol butonunun calıştığını test eder");

        Assert.assertTrue(obj.becomeVendorButonu.isDisplayed());
        extentTest.pass("Become a Vendor butonunun görünürlüğünü test eder");

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();

        Thread.sleep(3000);

        Driver.closeDriver();


   }


}
