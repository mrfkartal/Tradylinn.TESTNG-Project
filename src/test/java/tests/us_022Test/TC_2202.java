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

public class TC_2202 extends TestBaseRapor {
    us_0022_tradylinnPage us_0022_tradylinnPage ;

    @Test
    public void test2202() throws InterruptedException {
        extentTest=extentReports.createTest("US022_TC2202",
                "Gecerli email ve sifre girilerek Indirimli urun sayfasinda sirala butonundaki tum kriterlerin sayfasina giris yapilabilmeli");
        //1-Vendor tradylinn anasayfasina gider
        us_0022_tradylinnPage = new us_0022_tradylinnPage();
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
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us_0022_tradylinnPage.indirimliUrunlertumunuGorButonu.click();
        extentTest.info("Anasayfada Indirimli Urunler kisminda Tumunu gor butonuna tiklandi");
        //ana sayfada indirimli urunler tumunu gore tikladik.

       //Vendor sirala butonunun ustune tiklar
      // sonra EN COK INCELENENE GORE SIRALA'ya tiklar ve acilan sayfayi test eder.
       us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi ");
      us_0022_tradylinnPage.varsayilanSiralama.click();
        extentTest.info("Varsayilan siralamaya tiklandi");
        Assert.assertTrue(us_0022_tradylinnPage.varsayilanSiralama.isDisplayed());
        extentTest.pass("Basarili sekilde indirimli urunler varsayilan sirala sayfasina giris yapti");
   // String actualUrlVsgs= getDriver().getCurrentUrl();
   // Assert.assertEquals("https://tradylinn.com/product-category/indirimli-urunler/", actualUrlVsgs);


       //Vendor sirala butonunun ustune tiklar
       // sonra EN COK INCELENENE GORE SIRALA'ya tiklar ve acilan sayfayi test eder.
       us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi");
       us_0022_tradylinnPage.enCokInceleneneGoreSirala.click();
        extentTest.info("En cok incelenene gore siralaya tiklandi");
       Assert.assertTrue(us_0022_tradylinnPage.enCokInceleneneGoreSirala.isDisplayed());
        extentTest.pass("Basarili sekilde indirimli urunler En cok incelenene gore sirala sayfasina giris yapti");

   //    Thread.sleep(4000);
   //    //getDriver().navigate().back();

   //    //Vendor sirala butonunun ustune tiklar
   //    // sonra EN COK OY ALANA GORE SIRALA'yatiklar ve acilan sayfayi test eder.
       us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi");
       us_0022_tradylinnPage.enCokOyAlanaGoreSirala.click();
        extentTest.info("En cok oy alana gore siralaya tiklandi");
       Assert.assertTrue(us_0022_tradylinnPage.enCokOyAlanaGoreSirala.isDisplayed());
        extentTest.pass("Basarili sekilde indirimli urunler En cok oy alana gore sirala sayfasina giris yapti");


   //    //Vendor sirala butonunun ustune tiklar
   //    // sonra EN YENIYE GORE SIRALA'ya tiklar ve acilan sayfayi test eder.
      us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi");
      us_0022_tradylinnPage.enYeniyeGoreSirala.click();
        extentTest.info("En yeniye gore siralaya tiklandi");
      Assert.assertTrue(us_0022_tradylinnPage.enYeniyeGoreSirala.isDisplayed());
        extentTest.pass("Basarili sekilde indirimli urunler en yeniye gore sirala sayfasina giris yapti");


   //    //Vendor sirala butonunun ustune tiklar
   //    // sonra DUSUK  FIYATTAN YUKSEK FIYATA GORE SIRALA'ya tiklar ve acilan sayfayi test eder.
       us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi");
       us_0022_tradylinnPage.dusukFiyattanYuksekFiyataGoreSirala.click();
        extentTest.info("Fiyata gore sirala: Dusukten yuksege tiklandi");
       Assert.assertTrue(us_0022_tradylinnPage.dusukFiyattanYuksekFiyataGoreSirala.isDisplayed());
        extentTest.pass("Basarili sekilde indirimli urunler Fiyata gore sirala: Dusukten yuksege sayfasina giris yapti");
        //    //Vendor sirala butonunun ustune tiklar
        //    // sonra YUKSEK FIYATTAN DUSUK FIYATA GORE SIRALA'YA ve acilan sayfayi test eder.
        us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi");
        us_0022_tradylinnPage.yuksekFiyattanDusukFiyataGoreSirala.click();
        extentTest.info("Fiyata gore sirala: Yuksekten dusuge tiklandi");
        Assert.assertTrue(us_0022_tradylinnPage.yuksekFiyattanDusukFiyataGoreSirala.isDisplayed());
        extentTest.pass("Basarili sekilde indirimli urunler Fiyata gore sirala: Yuksekten dusuge sayfasina giris yapti");


        Driver.closeDriver();




    }
}