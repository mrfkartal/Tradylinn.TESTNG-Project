package tests.us_008_009_010_011Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_008_009_010_011Page.TradylinnNPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_801_802 extends TestBaseRapor {
    TradylinnNPage tradylinnPage;
    @Test
    public void uS08() {

     extentTest=extentReports.createTest("US08","Manage Stock, Stok yönetimi / Order yonetimi");
        //1-Vendor tradylinn anasayfasina gider
      tradylinnPage=new TradylinnNPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Anasayfaya gidildi");

        //2-Vendor anasayfaya gittigini test eder
        String anasayfayaTitle=Driver.getDriver().getTitle();
        System.out.println(anasayfayaTitle);
        Assert.assertEquals("Tradylinn – Hızlı ve Güvenli Alışveriş",anasayfayaTitle);
        extentTest.info("Anasayfaya gidildigi test edildi");

        //3- Vendor girisyap/uyeol butonunu tiklar
        tradylinnPage.girisYap.click();
        extentTest.info("Giris butonu tiklandi");

        //3-Vendor kullanici emali ve password ile satici olarak giris yapar
        tradylinnPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
       extentTest.info("Gecerli mail adresi girildi");
        tradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
       extentTest.info("Gecerli sifre girildi");
        tradylinnPage.login.click();
       extentTest.info("Login butonuna basildi");

        // Vendor hesam butonunu tiklar
        ReusableMethods.waitFor(10);
        tradylinnPage.hesabim.click();
       extentTest.info("Hesabim butonuna tiklandi");
        ReusableMethods.waitFor(3);
        //4-Vendor Store Manager butununu tiklar
        tradylinnPage.storeManagerButonu.click();
       extentTest.info("Store Manager butonu tiklandi");
        ReusableMethods.waitFor(3);
        //5-Vendor store manager sayfasina yonlendirildigini test eder
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals("https://tradylinn.com/store-manager/", actualUrl);
       extentTest.info("Store Manager sayfasina gidildigi test edildi");

        //6-Vendor urunler butonunun ustune gelir ve yeni ekle'yi tiklar
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.urunlerButonu.click();
       extentTest.info("Urunler butonu tiklandi");
        tradylinnPage.yeniEkleButonu.click();
       extentTest.info("yeni ekle butonu tiklandi");
        //7-vendor yeni urun ekleme sayfasina gittigini test eder
        Assert.assertTrue(tradylinnPage.addProductTexti.isDisplayed());
       extentTest.info("Yeni urun ekle sayfasina gidildigi test edildi");

        //8-Inventory'i tiklar

        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.inventoryButonu.click();
       extentTest.info("Inventory butonu tiklandi");
        //10-Vendor Manage Stock butonunu tiklar
        tradylinnPage.manageStockButonu.click();
       extentTest.info("Manage Stock butonu tiklandi");

        //11-Vendor Stock Qty (stok miktarini girer)
        tradylinnPage.stockMiktari.clear();
       extentTest.info("Stok Miktari textbox'i silindi");
        ReusableMethods.waitFor(3);
        tradylinnPage.stockMiktari.sendKeys("15");
       extentTest.info("Stok miktari girildi");

        //10-Vendor Allow Backorders(on siparise izin ver) kisminda
        //  Allow but notify customber'i(musteriye haber ver) tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select select=new Select(tradylinnPage.vendorAllowBackordersButonu);

        select.selectByIndex(1);
       extentTest.info(" Allow Backorders butonundan Allow but notify customber secildi");







    }
}
