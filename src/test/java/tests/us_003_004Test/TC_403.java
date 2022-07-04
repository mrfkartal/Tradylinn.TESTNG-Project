package tests.us_003_004Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.us_003_004Page.UsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_403 extends TestBaseRapor {
      UsPage UsPage;
    @Test
    public void test004() throws InterruptedException {
        extentTest=extentReports.createTest("US_04_TC_03","Stok fazlası urun eklenmemli" );

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

        jse.executeScript("arguments[0].click();", UsPage.siparisler);
        extentTest.info("siparislere girildi");
        Thread.sleep(3000);

        jse.executeScript("arguments[0].click();", UsPage.alisveriseDevamButonu);
        Thread.sleep(3000);
        extentTest.info("alısverise devam edildi");

        jse.executeScript("arguments[0].click();", UsPage.ikinciSyfa);
        Thread.sleep(3000);

       /* JavascriptExecutor jse3 = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.surahi);
        Thread.sleep(3000);
        extentTest.info("sepete urun eklendi");*/
        Actions ac=new Actions(Driver.getDriver());
       //ac.moveToElement(UsPage.surahi).perform();
        jse.executeScript("arguments[0].click();", UsPage.SayılacakürünEkleButton);
        Thread.sleep(3000);


        jse.executeScript("arguments[0].click();", UsPage.sepet);
        Thread.sleep(3000);
        extentTest.info("sepete gidildi");



        jse.executeScript("arguments[0].click();", UsPage.sepetiGoruntule);
        Thread.sleep(3000);
        extentTest.info("sepet goruntulendi");




        String maxStokAdedi = UsPage.SayılacakürünMinMaxMktr.getAttribute("max");
        UsPage.SayılacakürünMinMaxMktr.sendKeys(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE,Keys.ENTER, maxStokAdedi);
        extentTest.info("urunun max stok adedine bakıldı");



    }
}