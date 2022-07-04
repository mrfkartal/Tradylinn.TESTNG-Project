package tests.us_012Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.us_012Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_1201 extends TestBaseRapor {
    TradylinnPage obj;
    @Test
    public void tc_1201a() throws InterruptedException {

        extentTest=extentReports.createTest("US_012_TC_1201","Kullanıcı siparişler sayfasına gider,Siparişleri listeler");
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
        extentTest.info("Kullanıcı hesabım sayfasına tıklar.");

        obj.siparislerButonu.click();
        extentTest.info("Kullanıcı siparişler sayfasına gider");




        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        if (!(obj.tamamlanmisSiparislerListesi.isEmpty())){


            for (int i = 0; i <obj.tamamlanmisSiparislerListesi.size() ; i++) {
                Thread.sleep(2000);
                Assert.assertTrue(obj.tamamlanmisSiparislerListesi.get(i).isDisplayed());

            }
            extentTest.pass("siparişler sayfasında tamamlandı yazan siparişlerin listelendiğini görür");

        }else {

            for (int i = 0; i <obj.siparislerBaslikListesi.size() ; i++) {
                Thread.sleep(2000);
                Assert.assertTrue(obj.siparislerBaslikListesi.get(i).isDisplayed());

            }
            extentTest.pass("siparişler sayfasında siparişler olmadığı için başlıkların olduğunu görür");

        }





      if (!( obj.odeniyorSiparislerListesi.isEmpty())){
          for (int i = 0; i <obj.odeniyorSiparislerListesi.size() ; i++) {
              Thread.sleep(2000);
              Assert.assertTrue(obj.odeniyorSiparislerListesi.get(i).isDisplayed());

          }
          extentTest.pass("siparişler sayfasında ödeme bekleniyor yazan siparişlerin listelendiğini görür");

      }else {

          for (int i = 0; i <obj.siparislerBaslikListesi.size() ; i++) {
              Thread.sleep(2000);
              Assert.assertTrue(obj.siparislerBaslikListesi.get(i).isDisplayed());

          }
          extentTest.pass("siparişler sayfasında siparişler olmadığı için başlıkların olduğunu görür");

      }






      Driver.closeDriver();





    }

    public void tc_1201b() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));


        obj.girisYapButonu.click();

        obj.mailKutusu.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        obj.sifreKutusu.sendKeys(ConfigReader.getProperty("gecerliSifre"));

        obj.loginButonu.click();

        Thread.sleep(3000);
        obj.hesabimButonu.click();

        obj.siparislerButonu2.click();



        Driver.closeDriver();





    }
}
