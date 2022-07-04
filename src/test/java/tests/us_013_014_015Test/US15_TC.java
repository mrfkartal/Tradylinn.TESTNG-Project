package tests.us_013_014_015Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_013_014_015Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Random;

public class US15_TC extends TestBaseRapor {

    TradylinnPage tradylinnPage = new TradylinnPage();
    Random random = new Random();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test_US15_TC01() {
        extentTest = extentReports.createTest("US15_TC1501", "Restrictions yapilabilmeli / ürüne kısıtlamalar getirilebilmelidir, \"Usage limit per coupon\" bolumune deger girilebilmelidir");

        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn ana sayfaya gidildi");

        // 2- Vendor "Giriş yap" butonuna tiklar
        tradylinnPage.girisYap.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 3- Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        tradylinnPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Gecerli Email girildi");

        // 4- Vendor "Parola" inputuna  gecerli parolayi girer
        tradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Gecerli sifre girildi");

        // 5- Vendor "GİRİŞ YAP" butonuna tiklar
        tradylinnPage.login.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 6- Vendor "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        tradylinnPage.hesabim.click();
        extentTest.info("Hesabim butonuna tiklandi");

        // 7- Vendor "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        tradylinnPage.storeManagerButonu.click();
        extentTest.info("Store Manager butonuna tiklandi");

        // 8- Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        tradylinnPage.kuponlarYeniEkleButonu.click();
        extentTest.info("Kuponlar-Yeni ekle butonuna tiklandi");

        // 9- Vendor "Limit" butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.limitButon.click();
        extentTest.info("Limit butonuna tiklandi");

        // 10- Vendor "Usage limit per coupon" a kupon basina kullanım limiti icin deger girer
        tradylinnPage.usageLimitPerCoupon.sendKeys("5");
        extentTest.info("\"Usage limit per coupon\" a deger girildi");

        // 11- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 12- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Usage limit per coupon\" bolumune deger girildi");
        Driver.closeDriver();
    }

    @Test
    public void test_US15_TC02() {
        extentTest = extentReports.createTest("US15_TC1502", "\"Limit usage to X items\" bolumune deger girilebilmelidir");

        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn ana sayfaya gidildi");

        // 2- Vendor "Giriş yap" butonuna tiklar
        tradylinnPage.girisYap.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 3- Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        tradylinnPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Gecerli Email girildi");

        // 4- Vendor "Parola" inputuna  gecerli parolayi girer
        tradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Gecerli sifre girildi");

        // 5- Vendor "GİRİŞ YAP" butonuna tiklar
        tradylinnPage.login.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 6- Vendor "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        tradylinnPage.hesabim.click();
        extentTest.info("Hesabim butonuna tiklandi");

        // 7- Vendor "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        tradylinnPage.storeManagerButonu.click();
        extentTest.info("Store Manager butonuna tiklandi");

        // 8- Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        tradylinnPage.kuponlarYeniEkleButonu.click();
        extentTest.info("Kuponlar-Yeni ekle butonuna tiklandi");

        // 9- Vendor "Limit" butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.limitButon.click();
        extentTest.info("Limit butonuna tiklandi");

        // 10- Vendor "Limit usage to X items" a kupon kullanım limiti icin deger girer
        tradylinnPage.limitUsageToXItems.sendKeys("4");
        extentTest.info("\"Limit usage to X items\" a deger girildi");

        // 11- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 12- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Limit usage to X items\" bolumune deger girildi");
        Driver.closeDriver();
    }

    @Test
    public void test_US15_TC03() {
        extentTest = extentReports.createTest("US15_TC1503", "\"Usage limit per user\" bolumune deger girilebilmelidir");

        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn ana sayfaya gidildi");

        // 2- Vendor "Giriş yap" butonuna tiklar
        tradylinnPage.girisYap.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 3- Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        tradylinnPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Gecerli Email girildi");


        // 4- Vendor "Parola" inputuna  gecerli parolayi girer
        tradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Gecerli sifre girildi");

        // 5- Vendor "GİRİŞ YAP" butonuna tiklar
        tradylinnPage.login.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 6- Vendor "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(3);
        tradylinnPage.hesabim.click();
        extentTest.info("Hesabim butonuna tiklandi");

        // 7- Vendor "Store Manager" butonuna tiklar
        ReusableMethods.waitFor(3);
        tradylinnPage.storeManagerButonu.click();
        extentTest.info("Store Manager butonuna tiklandi");

        // 8- Vendor "Kuponlar" butonundan "Yeni ekle" secenegini tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.kuponlarButonu.click();
        ReusableMethods.waitFor(3);
        tradylinnPage.kuponlarYeniEkleButonu.click();
        extentTest.info("Kuponlar-Yeni ekle butonuna tiklandi");

        // 9- Vendor "Limit" butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.limitButon.click();
        extentTest.info("Limit butonuna tiklandi");

        // 10- Vendor "Usage limit per user" a kupon kullanım limiti icin deger girer
        tradylinnPage.usageLimitPerUser.sendKeys("6");
        extentTest.info("\"Usage limit per user\" a deger girildi");

        // 11- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 12- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Usage limit per user\" bolumune deger girildi");
        Driver.closeDriver();
    }
}
