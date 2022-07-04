package tests.us_008_009_010_011Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_008_009_010_011Page.TradylinnNPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class TC_1101_1102_1013 extends TestBaseRapor {
    TradylinnNPage tradylinnPage;
    @Test
    public void test01() {
        extentTest=extentReports.createTest("US11","Toptan urun gösterme ayarlari");
        tradylinnPage=new TradylinnNPage();

        //1-Vendor tradylinn anasayfasina gider

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Anasayfaya gidildi");

        //2-Vendor anasayfaya gittigini test eder
        String anasayfayaTitle=Driver.getDriver().getTitle();
        System.out.println(anasayfayaTitle);
        Assert.assertEquals("Tradylinn – Hızlı ve Güvenli Alışveriş",anasayfayaTitle);
        extentTest.info("Anasayfaya gidildigi test edildi");

        //3- Vendor girisyap/uyeol nutonunu tiklar
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
        ReusableMethods.waitFor(7);
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

        //8- Vendor Toptan Ürün Gösterme Ayarları butonunu tiklar butonunu tiklar

        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.toptanUrunSecme.click();
        extentTest.info("Toptan urun secme tiklandi");



        //9-Vendor Piece Type'dan urun birimini secebilir
        Select select= new Select(tradylinnPage.pieceType);

        List<WebElement> pieceTypeOptions=select.getOptions();
        for (WebElement pieceType : pieceTypeOptions)
             {pieceType.click();
        }
        extentTest.info("piece Type secenekleri tiklandi");


        //10-Vendor Units per piece'den urunun birim miktarini belirler
        tradylinnPage.unitsPerPiece.clear();
        tradylinnPage.unitsPerPiece.sendKeys("15");
        extentTest.info("Units Per Piece urun birim miktari belirtildi");


        //11-Vendor Minimum quantity'den urunun minumum miktari girebilir
        tradylinnPage.minOrderQuantity.clear();
        tradylinnPage.minOrderQuantity.sendKeys("20");
        extentTest.info("Min Order Quantity miktari belirtildi");
    }
}
