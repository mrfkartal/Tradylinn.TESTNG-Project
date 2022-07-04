package tests.us_019_020_021Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_019_020_021Page.TradylinnPage192021;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_19_TC_1901_Takipciler  extends TestBaseRapor {
    TradylinnPage192021 tradylinnPage192021;

    /*  1 vendor url ye gider
        2 vendor sayfadan Giriş Yap tıklar
        3.vendor unique bir email girer
        4. vendor Password girer
        5. vendor giriş yap tıklar
        6. vendor hesabım a tıklar
        7. vendor store manager a tıklar
        8. takipçiler e tıklar
        9. isim, e posta, işlemler görünür*/
    @Test
    public void test1901() throws InterruptedException {

       tradylinnPage192021=new TradylinnPage192021();
        extentTest=extentReports.createTest("TC1901","Store manager takipci bilgilerini görebilmeli");

        //1 vendor url ye gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn anasayfaya gidildi");

        //2 vendor sayfadan Giriş Yap tıklar
        tradylinnPage192021.girisButonu.click();
        extentTest.info("giris yap butonuna tiklandi");

        //3.vendor unique bir email girer
        tradylinnPage192021.username.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("gecerli email girildi");

        //4. vendor Password girer
        tradylinnPage192021.password.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("gecerli sifre girildi");

        //5. vendor giriş yap tıklar
        tradylinnPage192021.girisYap.click();
        extentTest.info("giris yap butonuna tiklandi");
        Thread.sleep(7000); // sayfanın yuklenmesi ve hesabim butonu görünmesi icin beklendi


        // 6. vendor hesabım a tıklar
        tradylinnPage192021.hesabim.click();
        extentTest.info("hesabim butonuna tiklandi");

        //7. vendor store manager a tıklar
        tradylinnPage192021.storeManager.click();
        extentTest.info("store manager butonuna tiklandi");

        Thread.sleep(5000);// sayfanın yuklenmesi  icin beklendi

        Actions a = new Actions(Driver.getDriver()); // takipciler butonu acilan sayfanin alt kisminda kaldigi icin sayfa asagi indirildi

        a.sendKeys(Keys.PAGE_DOWN).perform();
        a.sendKeys(Keys.PAGE_DOWN).perform();
        a.sendKeys(Keys.PAGE_DOWN).perform();

        //8. takipçiler e tıklar

        tradylinnPage192021.takipciler.click();
        extentTest.info("takipciler butonuna tiklandi");

        //9. isim, e posta, işlemler görünür
        Assert.assertTrue(tradylinnPage192021.name.isDisplayed()); //takipcinin isminin gorundugu test edildi
        Assert.assertTrue(tradylinnPage192021.email.isDisplayed());//takipcinin epostası gorundugu test edildi
        Assert.assertTrue(tradylinnPage192021.islem.isDisplayed());//takipcinin yaptigi islemin gorundugu test edildi

        extentTest.pass("store manager takipci bilgilerini görüntüledi");
        Driver.closeDriver();






    }

}
