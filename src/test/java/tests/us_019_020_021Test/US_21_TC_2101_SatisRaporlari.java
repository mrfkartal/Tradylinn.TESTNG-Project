package tests.us_019_020_021Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_019_020_021Page.TradylinnPage192021;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_21_TC_2101_SatisRaporlari extends TestBaseRapor {
    TradylinnPage192021 tradylinnPage192021;

    @Test
    public void test2101() throws InterruptedException {

       tradylinnPage192021=new TradylinnPage192021();

        extentTest=extentReports.createTest("TC2101","yil, en son ay, icinde bulunan ay, en son 7 gun ve specific bir tarih araligi secilebilir");

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

        //8. vendor raporlar a  tiklar
        tradylinnPage192021.raporlar.click();
        extentTest.info("raporlar butonuna tiklandi");

        a.sendKeys(Keys.PAGE_UP).perform();

        //9. Year butonuna tiklar
        tradylinnPage192021.year.click();
        extentTest.info("Year butonuna tiklandi");

        //10. Yillik rapor goruntulenir
        Assert.assertTrue(tradylinnPage192021.reportyear.isDisplayed());
        extentTest.info("yillik rapor goruntulendi");

        //11.Last Month a tiklar
        tradylinnPage192021.lastmonth.click();
        extentTest.info("Last Month tiklandi");

        //12.Bir onceki ayin raporu goruntulenir
        Assert.assertTrue(tradylinnPage192021.reportlastmonth.isDisplayed());
        extentTest.info("Bir onceki ayin raporu goruntulendi");

        //13. This Month a tiklar
        tradylinnPage192021.thismonth.click();
        extentTest.info("This Month tiklandi");

        //14.İçinde bulunulan ayın raporu görüntülenir
        Assert.assertTrue(tradylinnPage192021.reportthismonth.isDisplayed());
        extentTest.info("Icinde bulunulan ayin raporu goruntulendi");

        //15. 7 Days e tıklar
        tradylinnPage192021.sevendays.click();
        extentTest.info("7 Days tiklandi");

        //16. Son 7 günlük rapor görüntülenir
        Assert.assertTrue(tradylinnPage192021.reportsevendays.isDisplayed());
        extentTest.info("Yedi gunluk rapor goruntulendi");

        //17. Choose Date Range texbox a tıklar
        tradylinnPage192021.choosedate.click();
        extentTest.info("Spesifik tarih araligi secildi");

        //18. Başlangıç ve bitiş tarihi seçer
        tradylinnPage192021.startdate.click();
        extentTest.info("Baslangic tarihi secildi");

        tradylinnPage192021.enddate.click();
        extentTest.info("Bitis tarihi secildi");

        extentTest.pass("Yillik,onceki ay,simdiki ay, 7 gunluk, secili tarihler satis raporları goruntulendi");




        Driver.closeDriver();
    }
}
