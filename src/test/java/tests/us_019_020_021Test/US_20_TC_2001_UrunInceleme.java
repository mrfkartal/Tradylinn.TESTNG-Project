package tests.us_019_020_021Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_019_020_021Page.TradylinnPage192021;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_20_TC_2001_UrunInceleme  extends TestBaseRapor {
    TradylinnPage192021 tradylinnPage192021;

    /*  1 vendor url ye gider
       2 vendor sayfadan Giriş Yap tıklar
       3.vendor unique bir email girer
       4. vendor Password girer
       5. vendor giriş yap tıklar
       6. vendor hesabım a tıklar
       7. vendor store manager a tıklar
       8. incelemeler e tıklar
       9. kullanici isim, yorum, verdiği puan, tarih ve eylem görünür*/

    @Test
    public void test2001() throws InterruptedException {

         tradylinnPage192021=new TradylinnPage192021();

        extentTest=extentReports.createTest("TC2001","kullanici bilgileri, yorum, puan, tarih,eylem görünebilmeli");

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
        Thread.sleep(9000); // sayfanın yuklenmesi ve hesabim butonu görünmesi icin beklendi


        // 6. vendor hesabım a tıklar
        tradylinnPage192021.hesabim.click();
        extentTest.info("hesabim butonuna tiklandi");

        //7. vendor store manager a tıklar
        tradylinnPage192021.storeManager.click();
        extentTest.info("store manager butonuna tiklandi");

        Actions a = new Actions(Driver.getDriver());
        // incelemeler butonu acilan sayfanin alt kisminda kaldigi icin sayfa asagi indirildi

        a.sendKeys(Keys.PAGE_DOWN).perform();
        a.sendKeys(Keys.PAGE_DOWN).perform();


        //8. incelemeler e tıklar
        tradylinnPage192021.incelemeler.click();
        extentTest.info("incelemeler butonuna tiklandi");

        Thread.sleep(5000);// sayfanın yuklenmesi  icin beklendi

        Assert.assertTrue(tradylinnPage192021.kullanicibilgi.isDisplayed());
        Assert.assertTrue(tradylinnPage192021.yorum.isDisplayed());
        Assert.assertTrue(tradylinnPage192021.puan.isDisplayed());
        Assert.assertTrue(tradylinnPage192021.tarih.isDisplayed());
        Assert.assertTrue(tradylinnPage192021.eylem.isDisplayed());
        extentTest.pass("kullanici bilgileri, yorum, puan, tarih,eylem görünür oldugu test edildi");

        Driver.closeDriver();




    }
}
