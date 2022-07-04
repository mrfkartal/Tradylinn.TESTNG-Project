package tests.us_003_004Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_003_004Page.UsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_301_2_3_4_5 extends TestBaseRapor {
        UsPage UsPage;
    @Test public void test003() throws InterruptedException {

        extentTest=extentReports.createTest("US_03_TC_12345","Order olarak siparişin verilmesi");
            UsPage=new UsPage();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("https://tradylinn.com/ adresine gidildi");
        UsPage.girisYap.click();
        extentTest.info("giris yap butonuna tıklandı");


        //3-Vendor kullanici emali ve password ile satici olarak giris yapar
        UsPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("geçerli email yazıldı");
        UsPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
extentTest.info("gecerli sifre girildi");
        UsPage.login.click();
extentTest.info("siteye giriş yapıldı kullanıcı olarak");
        // Vendor hesam butonunu tiklar
        Thread.sleep(8000);
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.hesabimButonu);
        Thread.sleep(8000);
extentTest.info("hesabıma girildi");
        //Vendor siparişler ve alısverişe devam et butonuna tıklar
        JavascriptExecutor jse0=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.siparisler);
extentTest.info("siparislere girildi");
        Thread.sleep(3000);
        JavascriptExecutor jse1=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.alisveriseDevamButonu);
        Thread.sleep(3000);
extentTest.info("alısverise devam edildi");
        //Vendor 5 ürün seçer ve sepete ekler

        //Birinci ürünü ekler
        JavascriptExecutor jse2=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.birinciUrun);
        Thread.sleep(20000);
        extentTest.info("birinci urun sepete eklendi");

        //ikinci ürünü ekler
        JavascriptExecutor jse3=(JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].click();", UsPage.ikinciUrun);
        Thread.sleep(20000);
        extentTest.info("ikinci urun sepete eklendi");

        //üçüncü ürünü ekler
        JavascriptExecutor jse4=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.ucuncuUrun);
        Thread.sleep(20000);
        extentTest.info("ucuncu urun sepete eklendi");

        //Dördüncü ürünü ekler
        JavascriptExecutor jse5=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.dorduncuUrun);
        extentTest.info("dorduncu urun sepete eklendi");

        //Besinci ürünü ekler
        JavascriptExecutor jse6=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.besinciUrun);
        Thread.sleep(20000);
        extentTest.info("besinci urun sepete eklendi");

        //Sepete gider
        JavascriptExecutor jse7=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.sepet);
        extentTest.info("sepete gidildi");

        //Sepeti görüntüler
        JavascriptExecutor jse8=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.sepetiGoruntule);
        extentTest.info("sepet goruntulendi");

        //Ödeme buttonuna tıklar
        JavascriptExecutor jse9=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.odemeButonu);
        Thread.sleep(3000);
        extentTest.info("odeme buttonuna tıklandı");
        //Teslimat bilgilerini girer
        //UsPage.sokakAdresi.sendKeys("asasAsassA");
        //UsPage.sokakAdresi2.sendKeys("asAsasAs");
        UsPage.teslimatAdresi.sendKeys("İstanbul");
        extentTest.info("teslimat adresine İstanbul eklendi");
        //Ödeme secimini girer
        JavascriptExecutor jse11=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.odemeSecimi);
        Thread.sleep(3000);
        extentTest.info("odeme yontemi secildi");

        //Siparişi onaylar
        JavascriptExecutor jse12=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.onayButonu);
        extentTest.info("siparis onaylandı");

        //Sipariş onaylandı yazısının görünür olduğunu test eder.
        ReusableMethods.waitForVisibility(UsPage.siparisinizAlinmistirYazisi,180);

        Assert.assertTrue(UsPage.siparisinizAlinmistirYazisi.isDisplayed());
        extentTest.pass("sipariş alındı yazısı görüldüğü test edildi");



















    }
}
