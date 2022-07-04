package tests.us_012Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.us_012Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_1203 extends TestBaseRapor {

   TradylinnPage obj;

    @Test
    public void tc_1203a() throws InterruptedException {
        extentTest=extentReports.createTest("US_012_TC_1203","Kullanıcı Adresler sayfasına gider,adresleri listeler");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("kullanıcı Tradylinn anasayfasına gider");

        obj.girisYapButonu.click();
        extentTest.info("Kullanıcı giriş sayfasına gider");

        obj.mailKutusu.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        obj.sifreKutusu.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Kullanıcı giriş sayfasında  gecerli email ve gecerli sifreyi girdi");

        obj.loginButonu.click();
        extentTest.info("Kullanıcı giriş yaparak anasayfaya gider");
        Thread.sleep(3000);
        obj.hesabimButonu.click();
        extentTest.info("Kullanıcı hesabım sayfasına tıklar");
        obj.adreslerButonu.click();
        extentTest.info("Kullanıcı Adresler sayfasına gider");

        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertFalse(obj.faturaAdresiListesi.isEmpty());


        for (int i = 0; i <obj.faturaAdresiListesi.size() ; i++) {
            Thread.sleep(2000);
            Assert.assertTrue(obj.faturaAdresiListesi.get(i).isDisplayed());

        }
        extentTest.pass("Adresler sayfasında fatura adresinin listelendiğini görür");




        Assert.assertFalse(obj.gonderimAdresiListesi.isEmpty());


        for (int i = 0; i <obj.gonderimAdresiListesi.size() ; i++) {
            Thread.sleep(2000);
            Assert.assertTrue(obj.gonderimAdresiListesi.get(i).isDisplayed());

        }
        extentTest.pass("Adresler sayfasında gonderim adresinin listelendiğini görür");



        Driver.closeDriver();




    }


    public void tc_1203b() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        obj.girisYapButonu.click();

        obj.mailKutusu.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        obj.sifreKutusu.sendKeys(ConfigReader.getProperty("gecerliSifre"));

        obj.loginButonu.click();

        Thread.sleep(3000);
        obj.hesabimButonu.click();

        obj.adreslerButonu2.click();



        Driver.closeDriver();




    }
}
