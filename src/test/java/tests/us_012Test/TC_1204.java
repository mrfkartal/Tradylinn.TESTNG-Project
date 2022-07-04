package tests.us_012Test;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_012Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_1204 extends TestBaseRapor {

 TradylinnPage obj;
    @Test
    public void tc_1204a() throws InterruptedException {
        extentTest=extentReports.createTest("US_012_TC_1204","Kullanıcı Hesapdetaylari sayfasına gider,hesap detaylarının göründüğünü test eder ve değişiklik yapar");
        obj=new TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("kullanıcı Tradylinn anasayfasına gider");

        Thread.sleep(2000);

        obj.girisYapButonu.click();
        extentTest.info("Kullanıcı giriş sayfasına gider");

        obj.mailKutusu.sendKeys("java.team.qa.2022@gmail.com");
        obj.sifreKutusu.sendKeys("TEAM21a.");
        extentTest.info("Kullanıcı giriş sayfasında  gecerli email ve gecerli sifreyi girdi");

        obj.loginButonu.click();
        extentTest.info("Kullanıcı giriş yaparak anasayfaya gider");

        Thread.sleep(10000);
        obj.hesabimButonu.click();
        extentTest.info("Kullanıcı hesabım sayfasına tıklar");

        obj.hesapDetaylarButonu.click();
        extentTest.info("Kullanıcı Hesapdetaylari sayfasına gider");


        Assert.assertTrue(obj.hesapDetaylariAdBolumu.isDisplayed());
        extentTest.pass("kullanıcı ad bolumunun oldugunu görür");

        Assert.assertTrue(obj.hesapDetaylariSoyAdBolumu.isDisplayed());
        extentTest.pass("kullanıcı soyad bolumunun oldugunu görür");
        Thread.sleep(3000);
        Actions actions=new Actions(Driver.getDriver());

        for (int i = 0; i < obj.hesapDetaylariEmailBiografiParolaBolumu.size() ; i++) {
            actions.sendKeys(Keys.DOWN).perform();
            Assert.assertTrue(obj.hesapDetaylariEmailBiografiParolaBolumu.get(i).isDisplayed());

        }
        extentTest.pass("kullanıcı Hesap detaylarindaki diğer bolumleri görür");


        Faker faker=new Faker();
        String name=faker.name().firstName();
        String lastName=faker.name().lastName();
        String fullName=faker.name().fullName();
       obj.hesapDetaylariAdInputu.clear();
        obj.hesapDetaylariAdInputu.sendKeys(name);
      obj.hesapDetaylariSoyAdInputu.clear();
        obj.hesapDetaylariSoyAdInputu.sendKeys(lastName);
          obj.hesapDetaylariGorunenAdInputu.clear();
        obj.hesapDetaylariGorunenAdInputu.sendKeys(fullName);
        actions.sendKeys(Keys.DOWN).perform();
        extentTest.info("Kullanıcı Hesapdetaylari sayfasında ad , soyad ve gorünen ad bolumunde değişiklik yapar");
       Thread.sleep(5000);
        JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",obj.hesapDetaylariDegisiklikButonu);
        jse.executeScript("arguments[0].click();", obj.hesapDetaylariDegisiklikButonu);
        extentTest.info("Kullanıcı Hesapdetaylari sayfasındadeğişilkil butonuna tıklar");

        // obj.hesapDetaylariDegisiklikButonu.click();
        Assert.assertTrue(obj.hesapDetaylariDegistiMesaji.isDisplayed());
        extentTest.pass("kullanıcı Hesap detaylarindaki degişiklikler gercekleşti mesajını görür ");
        obj.hesapDetaylarButonu.click();
        String valueAd=obj.hesapDetaylariAdInputu.getAttribute("value");

        Assert.assertEquals(valueAd,name);
        Assert.assertEquals(obj.hesapDetaylariSoyAdInputu.getAttribute("value"),lastName);
        Assert.assertEquals(obj.hesapDetaylariGorunenAdInputu.getAttribute("value"),fullName);
        extentTest.pass(" Hesap detaylari sayfasında degişiklikler gercekleştigini görür");


        Driver.closeDriver();





    }



    public void tc_1204b() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        Thread.sleep(2000);

        obj.girisYapButonu.click();

        obj.mailKutusu.sendKeys("java.team.qa.2022@gmail.com");
        obj.sifreKutusu.sendKeys("TEAM21a.");

        obj.loginButonu.click();

        Thread.sleep(3000);
        obj.hesabimButonu.click();

        obj.hesapDetaylarButonu2.click();


        Driver.closeDriver();





    }





}
