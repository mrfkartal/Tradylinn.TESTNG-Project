package tests.us_022Test;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_022Page.us_0022_tradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

import static utilities.Driver.getDriver;

public class TC_2204 extends TestBaseRapor {


    us_0022_tradylinnPage us_0022_tradylinnPage ;

    @Test
    public void test2202() throws InterruptedException {
        extentTest=extentReports.createTest("US022_TC2204",
                "Indirimli urun sayfasinda sirala butonundaki" +
                        " Fiyata gore sirala: Yuksekten dusuge sayfasindaki urunlerin " +
                        "dogru siralandigini gorulebilmeli");
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

        Thread.sleep(10000);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        us_0022_tradylinnPage.indirimliUrunlertumunuGorButonu.click();
        extentTest.info("Anasayfada Indirimli Urunler kisminda Tumunu gor butonuna tiklandi");
        //ana sayfada indirimli urunler tumunu gore tikladik.

        //Vendor sirala butonunun ustune tiklar
        //    // sonra DUSUK  FIYATTAN YUKSEK FIYATA GORE SIRALA'ya tiklar ve acilan sayfayi test eder.
        us_0022_tradylinnPage.siralaButonu.click();
        extentTest.info("Indirimli urunler sayfasinda sirala butonuna basildi");
        us_0022_tradylinnPage.yuksekFiyattanDusukFiyataGoreSirala.click();
        extentTest.info("Fiyata gore sirala: Yuksekten dusuge tiklandi");

        //indirimli sayfanin tum ogelerini ayni sayfaya getirir.
        Thread.sleep(3000);
        // us_0022_tradylinnPage.urunAdetFiltresi.click();
        // us_0022_tradylinnPage.otuzAltiAdetSec.click();

        List<Double> urunlerinFiyatListesi = new ArrayList<>();

        System.out.println(us_0022_tradylinnPage.indirimliurunlerList.get(1).getText());
        System.out.println(Double.parseDouble(us_0022_tradylinnPage.indirimliurunlerList.
                get(1).getText().substring(0,us_0022_tradylinnPage.indirimliurunlerList.
                get(1).getText().length()-1).replaceAll(",","")));


        for (int i = 0; i < us_0022_tradylinnPage.indirimliurunlerList.size(); i++) {
            urunlerinFiyatListesi.add(Double.parseDouble(us_0022_tradylinnPage.indirimliurunlerList.
            get(1).getText().substring(0,us_0022_tradylinnPage.indirimliurunlerList.
                            get(i).getText().length()-1).replaceAll(",","")));

        }
        for (int i = 0; i < urunlerinFiyatListesi.size() - 1; i++) {
            Assert.assertTrue(urunlerinFiyatListesi.get(i) >= urunlerinFiyatListesi.get(i + 1));
        }

        extentTest.pass("Indirimli urunler-> Fiyata gore sirala: Yuksekten dusuge sayfasindaki" +
                " urunlerin dogru siralandigini basarili sekilde test etti");

        Driver.closeDriver();
    }
}