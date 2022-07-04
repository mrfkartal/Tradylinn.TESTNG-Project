package tests.us_016_017Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_016_017Page.US_16_17_TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

public class TC_1601 extends TestBaseRapor {

    US_16_17_TradylinnPage tradylinnPage;
    @Test

    public void tc_1601() throws InterruptedException {

        extentTest=extentReports.createTest("1601","Vendor müşterilerin  bilgilerini görür");
        tradylinnPage=new US_16_17_TradylinnPage();
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info( "vendor https://tradylinn.com adresine gider");

        tradylinnPage.girisYapButonu.click();
        extentTest.info("Vendor Giriş Yap butonunu tıklar");

        tradylinnPage.kullaniciAdiVeyaMailKutusu.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Vendor “Kullanıcı adı veya e-posta adresi” kutusuna mailini yazar");

        tradylinnPage.parolaKutusu.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Vendor “Parola” kutusuna şifresini yazar");

        tradylinnPage.loginKutusu.click();
        ReusableMethods.waitFor(6);
        extentTest.info("Vendor “Giriş Yap” butonunu tıklar");


        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",tradylinnPage.hesabimButonu);
        jse.executeScript("arguments[0].click();",tradylinnPage.hesabimButonu);
        extentTest.info("Vendor “hesabım” yazısını tıklar");

        jse.executeScript("arguments[0].scrollIntoView(true);",tradylinnPage.storeManagerButonu);
        jse.executeScript("arguments[0].click();",tradylinnPage.storeManagerButonu);
        extentTest.info("Vendor “Store Manager” yazısını tıklar");


        jse.executeScript("arguments[0].scrollIntoView(true);",tradylinnPage.musterilerButonu);
        jse.executeScript("arguments[0].click();",tradylinnPage.musterilerButonu);
        ReusableMethods.waitFor(3);
        extentTest.info("Vendor “müşteriler” yazısını tıklar");

        List<WebElement> baslıkList= new ArrayList<>();
        baslıkList.add(tradylinnPage.nameYazisi);
        baslıkList.add(tradylinnPage.emailYazisi);
        baslıkList.add(tradylinnPage.locationYazisi);
        baslıkList.add(tradylinnPage.moneySpentYazisi);
        baslıkList.add(tradylinnPage.lastOrderYazisi);
        for (WebElement el : baslıkList) {
            Assert.assertTrue( el.isDisplayed());
            System.out.println(el.getText());
        }
        extentTest.pass(" Vendor “name/Username/email/Location/Money Spent/Last Order” bölümlerinin görünürlüğünü doğrular");

        // Driver.getDriver().close();
    }


}

