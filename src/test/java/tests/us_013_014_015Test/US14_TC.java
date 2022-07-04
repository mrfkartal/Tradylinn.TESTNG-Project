package tests.us_013_014_015Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_013_014_015Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Random;

public class US14_TC extends TestBaseRapor {

    TradylinnPage tradylinnPage = new TradylinnPage();
    Random random = new Random();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test_US14_TC01() {
        extentTest = extentReports.createTest("US14_TC1401", "Restrictions yapilabilmeli / ürüne kısıtlamalar getirilebilmelidir, \"Minimum spend\" bolumune deger girilebilmelidir");


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

        // 9- Vendor "Minimum spend" bolumune en az alma miktarini girer
        tradylinnPage.minimumSpend.sendKeys("10");
        extentTest.info("Minimum spend bolumune en az alma miktari girildi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Minimum spend\" bolumune deger girildi");
        Driver.closeDriver();
    }


    @Test
    public void test_US14_TC02() {
        extentTest = extentReports.createTest("US14_TC1402", "\"Maximum spend\" bolumune deger girilebilmelidir");


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

        // 9- Vendor "Maximum spend" bolumune en fazla alma miktarini girer
        tradylinnPage.maximumSpend.sendKeys("20");
        extentTest.info("Maximum spend bolumune en fazla alma miktari girildi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Maximum spend\" bolumune deger girildi");
        Driver.closeDriver();
    }

    @Test
    public void test_US14_TC03() {
        extentTest = extentReports.createTest("US14_TC1403", " \"Individual use only\" bolumunun isaretlenebilir oldugu gorulmelidir");


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

        // 9- Vendor "Individual use only" secenegini isaretler
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        tradylinnPage.individualUseOnly.click();
        extentTest.info("Individual use only secenegi isaretlendi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Individual use only\" bolumunun isaretlendi");
        Driver.closeDriver();
    }

    @Test
    public void test_US14_TC04() {
        extentTest = extentReports.createTest("US14_TC1404", " \"Exclude sale items\" bolumunun isaretlenebilir oldugu gorulmelidir");


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

        // 9- Vendor "Exclude sale items" secenegini isaretler
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        tradylinnPage.excludeSaleItems.click();
        extentTest.info("Exclude sale items secenegi isaretlendi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Exclude sale items\" bolumunun isaretlendi");
        Driver.closeDriver();
    }

    @Test
    public void test_US14_TC05() {
        extentTest = extentReports.createTest("US14_TC1405", "\"Exclude categories\" bolumune kategori secilebilmelidir");


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

        // 9- Vendor "Code" satirina uniq bir deger girer
        String code2= String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys( code2);
        extentTest.info("Code satirina deger girildi");

        // 10- Vendor "Exclude categories" dan random bir kategori secer
        Select tr=new Select(tradylinnPage.excludeCategories);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        tr.selectByIndex(4);
        extentTest.info("Exclude categoriesden bir dropdown secildi");

        // 11- Vendor "SUBMİT" butonuna tiklar
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",tradylinnPage.submitButonu);
        extentTest.info("Submit butonuna tiklandi");


        // 12- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("\"Exclude categories\" bolumune kategori secildi");
        Driver.closeDriver();
    }
}