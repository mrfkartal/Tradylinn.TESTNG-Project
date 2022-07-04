package tests.us_022Test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_022Page.us_0022_tradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static utilities.Driver.getDriver;

public class TC_2201 extends TestBaseRapor {
    us_0022_tradylinnPage us_0022_tradylinnPage ;

    @Test
    public void test2201() throws InterruptedException {
        extentTest=extentReports.createTest("US022_TC2201",
                "Gecerli email ve sifre girilerek Indirimli urun sayfasina giris yapilabilmeli");
        us_0022_tradylinnPage = new us_0022_tradylinnPage();
        //1-Vendor tradylinn anasayfasina gider

        getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn anasayfaya gidildi");

        us_0022_tradylinnPage.girisYap.click(); //girisyap butonuna tikladik.
        extentTest.info("Giris yap butonuna tiklandi");

        us_0022_tradylinnPage.eMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Gecerli email yazildi");
        us_0022_tradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Gecerli sifre yazildi");
        us_0022_tradylinnPage.login.click();// emali ve sifre ile satici olarak giris yaptik.
        extentTest.info("login butonuna basildi");

        Thread.sleep(2000);
        Actions actions=new Actions(Driver.getDriver());
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       us_0022_tradylinnPage.indirimliUrunlertumunuGorButonu.click();
        extentTest.info("Anasayfada Indirimli Urunler kisminda Tumunu gor butonuna tiklandi");
       //ana sayfada indirimli urunler tumunu gore tikladik.

       String actualUrl= getDriver().getCurrentUrl();
       Assert.assertEquals("https://tradylinn.com/product-category/indirimli-urunler/", actualUrl);
        extentTest.pass("Basarili sekilde indirimli urunler sayfasina giris yapti");
        //vendor indirimli urunler sayfasina giris yaptigini test eder.

        Driver.closeDriver();

      // Thread.sleep(2000);
       //getDriver().navigate().back();
        //us_0022_tradylinnPage.anaSayfa.click();

      // Thread.sleep(5000);

      // actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
      //  us_0022_tradylinnPage.cokSatanlarTumunuGorButonu.click();
      //  String actualUrl2= getDriver().getCurrentUrl();
       // Assert.assertEquals("https://tradylinn.com/product-category/cok-satanlar/", actualUrl2);

      //  getDriver().navigate().back();

    }
}
