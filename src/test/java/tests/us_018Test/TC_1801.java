package tests.us_018Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_018Page.US_18_TradylinnPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

public class TC_1801 extends TestBaseRapor {

    US_18_TradylinnPage US_18_TradylinnPage ;
    @Test
    public void test_US18_TC01() {

        extentTest = extentReports.createTest("US_018_TC_1801 ", "RequestId bilgilerinin gorunmesi");


      US_18_TradylinnPage = new US_18_TradylinnPage();

        //1-vendor "https://tradylinn.com/" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("https://tradylinn.com/ anasayfaya gidildi");

        // 2- Vendor "Giriş yap" butonuna tiklar
        US_18_TradylinnPage.girisYap.click();
        extentTest.info("girisYap butonuna tiklandi");

        //3-Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        US_18_TradylinnPage.kullaniciAdiVeyaEmail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Gecerli email yazildi");

        //4-Vendor "Parola" inputuna  gecerli parolayi girer
        US_18_TradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Gecerli sifre yazildi");

        //5-Vendor "GİRİŞ YAP" butonuna tiklar
        US_18_TradylinnPage.girisYapButonu.click();
        extentTest.info("giris yap butonuna basildi");

        //6-Vendor "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        US_18_TradylinnPage.hesabim.click();
        extentTest.info("HESABIM butonuna basildi");



        //7-Vendor "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        US_18_TradylinnPage.storeManagerButonu.click();
        extentTest.info("Store Manager butonuna basildi");


        //8-Vendor "Geri Odeme" butonuna tiklar
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        US_18_TradylinnPage.geriOdemeButonu.click();
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Geri Odeme butonuna basildi");

        //9-Vendor geri odeme listesinde requestId oldugunu test eder

        if (!(US_18_TradylinnPage.requestIdListesi.isEmpty())){


            for (int i = 0; i <US_18_TradylinnPage.requestIdListesi.size() ; i++) {

                Assert.assertTrue(US_18_TradylinnPage.requestIdListesi.get(i).isDisplayed());

                System.out.println(US_18_TradylinnPage.requestIdListesi.get(i).getText());

            }
            System.out.println("RequestId listesi gorundu");
            extentTest.pass("RequestId listesinin dolu oldugu test edildi");

        }




        Driver.closeDriver();





    }
}
