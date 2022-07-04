package tests.us_003_004Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_003_004Page.UsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_401_2_3_4_5_6_7_8 extends TestBaseRapor {
    UsPage UsPage;
    @Test public void test004() throws InterruptedException  {
        extentTest=extentReports.createTest("US_04_TC_1245678","defaming olarak, View Cart yapılmalı  stok ürünleri fazla miktar  secilebilmeli ve stok fazlasına müsade etmemeli");

        UsPage=new UsPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("https://tradylinn.com/ adresine gidildi");
        UsPage.girisYap.click();
        extentTest.info("giris yap tıklandı");


        //3-Vendor kullanici emali ve password ile satici olarak giris yapar
        UsPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("gecerli email girildi");
        UsPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("gecerli sifre girildi");
        UsPage.login.click();
        extentTest.info("giris butonuna basıldı");

        // Vendor hesam butonunu tiklar
        Thread.sleep(3000);
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.hesabimButonu);
        Thread.sleep(3000);
        extentTest.info("hesabım butonuna basıldı");

        //Vendor siparişler ve alısverişe devam et butonuna tıklar
        JavascriptExecutor jse0=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.siparisler);
        Thread.sleep(3000);
        extentTest.info("siparisler butonuna basıldı");
        JavascriptExecutor jse1=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.alisveriseDevamButonu);
        Thread.sleep(3000);
        extentTest.info("alısverise devam et butonuna basıldı");

        //Vendor 5 ürün seçer ve sepete ekler

        //Birinci ürünü ekler
        JavascriptExecutor jse2=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.birinciUrun);
        Thread.sleep(8000);
        extentTest.info("birinci ürün secildi");

        //ikinci ürünü ekler
        JavascriptExecutor jse3=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.ikinciUrun);
        Thread.sleep(8000);
        extentTest.info("ikinci ürün secildi");

        //üçüncü ürünü ekler
        JavascriptExecutor jse4=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.ucuncuUrun);
        Thread.sleep(8000);
        extentTest.info("ucuncu urun secildi");

        //Dördüncü ürünü ekler
        JavascriptExecutor jse5=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.dorduncuUrun);
        Thread.sleep(8000);
        extentTest.info("dorduncu urun secildi");

        //Besinci ürünü ekler
        JavascriptExecutor jse6=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.besinciUrun);
        Thread.sleep(8000);
        extentTest.info("besinci urun secildi");

        //Sepete gider
        JavascriptExecutor jse7=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.sepet);
        Thread.sleep(3000);
        extentTest.info("sepete gidildi urun secildi");
        //Sepeti görüntüler
        JavascriptExecutor jse8=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.sepetiGoruntule);
        Thread.sleep(8000);
        extentTest.pass("sepet goruntulendi");

        Assert.assertTrue(UsPage.fiyat.isDisplayed());
        extentTest.pass("fiyat gorunurlugu test edildi");
        Assert.assertTrue(UsPage.miktar.isDisplayed());
        extentTest.pass("miktar gorunurlugu test edildi");
        Assert.assertTrue(UsPage.araToplam.isDisplayed());
        extentTest.pass("aratoplam gorunurlugu test edildi");

        //6.Urun adedini artirmak icin ( + ) butonuna tiklar
        int artiButonunaTiklamadanOncekiDeger = Integer.parseInt(UsPage.birMiktar.getAttribute("value"));
        System.out.println("artiButonunaTiklamadanOncekiDeger = " + artiButonunaTiklamadanOncekiDeger);
        extentTest.info("artı butonuna tıklanmadan onceki deger alındı");
        UsPage.artı.click();
        extentTest.info("artı butonuna basıldı");
        //7.Urun adedinin arttigini test eder
        int artiButonuTiklandiktanSonrakiDeger = Integer.parseInt(UsPage.ikiMiktar.getAttribute("value"));
        System.out.println("artiButonuTiklandiktanSonrakiDeger = " + artiButonuTiklandiktanSonrakiDeger);
        extentTest.info("artı butonundan sonraki deger alındı");
        Assert.assertTrue(artiButonunaTiklamadanOncekiDeger<artiButonuTiklandiktanSonrakiDeger,"deger arttı");
        extentTest.pass("artı butonuna tıklandıktan sonraki değiişim test edildi");
        //8.Urun adedini azaltmak icin ( - ) butonuna tiklar
        UsPage.eksiButton.click();
        extentTest.info("eksi butonuna basıldı");
        int eksiButonunaTikladiktanSonrakiDeger = Integer.parseInt(UsPage.birMiktar.getAttribute("value"));
        System.out.println("eksiButonunaTikladiktanSonrakiDeger = " + eksiButonunaTikladiktanSonrakiDeger);
        extentTest.info("artı butonundan sonraki deger alındı");
       Assert.assertTrue(eksiButonunaTikladiktanSonrakiDeger < artiButonuTiklandiktanSonrakiDeger,"deger azaldı");
        extentTest.pass("eksi butonuna tıklandıktan sonraki değiişim test edildi");

       JavascriptExecutor jse10=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.artı);
        extentTest.info("artı butonuna basıldı");


        JavascriptExecutor jse12=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.sepetiYenile);
        extentTest.info("sepet yenilendi");

        JavascriptExecutor jse9=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.fiyatıGüncelle);
        extentTest.info("fiyat güncellendi");

        ReusableMethods.waitForVisibility(UsPage.fiyatGüncellendiYazısı,180);

      Assert.assertTrue(UsPage.fiyatGüncellendiYazısı.isDisplayed(),"fiyat güncellendi");
        extentTest.pass("fiyatin guncellendigi test edildi");

        Assert.assertTrue(UsPage.kuponKullan.isDisplayed(),"kupon kullan secenegi var");
        extentTest.pass("kupon kullan butonun sayfada gorundugu test edildi");


        ReusableMethods.waitForVisibility(UsPage.alısveriseDevamEt,180);
        Assert.assertTrue(UsPage.alısveriseDevamEt.isDisplayed());
        extentTest.pass("alısverise devam et butonun sayfada gorundugu test edildi");


        JavascriptExecutor jse11=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", UsPage.temizleButton);
        extentTest.info("Temizle butonuna basıldı");
      Assert.assertTrue(UsPage.sepetBosYazisi.isDisplayed(),"Temizle buttonu var");
        extentTest.pass("Temizle butonun sayfada gorundugu test edildi");

      Assert.assertTrue(UsPage.odemeButonu.isDisplayed(),"ödeme buttonu var");
        extentTest.pass("ödemelere  gecebildigi test edildi");





    }
}
