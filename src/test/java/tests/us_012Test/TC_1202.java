package tests.us_012Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.us_012Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_1202 extends TestBaseRapor {

   TradylinnPage obj;

    @Test
    public void tc_1202a() throws InterruptedException {
        extentTest=extentReports.createTest("US_012_TC_1202","Kullanıcı İndirmeler sayfasına gider,indirmeleri listeler");
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

        obj.indirmelerButonu.click();
        extentTest.info("Kullanıcı indirmeler sayfasına gider");


        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

       if (!(obj.indirmelerListesi.isEmpty())){
           for (int i = 0; i <obj.indirmelerListesi.size() ; i++) {
               Thread.sleep(2000);
               Assert.assertTrue(obj.indirmelerListesi.get(i).isDisplayed());

           }
           extentTest.pass("İndirmeler sayfasında indirmelerin listelendiğini görür");


       }else {

           for (int i = 0; i <obj.indirmelerBaslikListesi.size() ; i++) {
               Thread.sleep(2000);
               Assert.assertTrue(obj.indirmelerBaslikListesi.get(i).isDisplayed());

           }
           extentTest.pass("indirmeler sayfasında indirmeler olmadığı için başlıkların olduğunu görür");

       }




        Driver.closeDriver();




    }

    public void tc_1202b() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));


        obj.girisYapButonu.click();

        obj.mailKutusu.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        obj.sifreKutusu.sendKeys(ConfigReader.getProperty("gecerliSifre"));

        obj.loginButonu.click();

        Thread.sleep(3000);
        obj.hesabimButonu.click();

        obj.indirmelerButonu2.click();



        Driver.closeDriver();




    }


}
