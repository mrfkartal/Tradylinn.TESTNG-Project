package tests.us_013_014_015Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

public class US13_TC extends TestBaseRapor {
    TradylinnPage tradylinnPage ;
    Random random ;
    Actions actions ;

    @Test
    public void test_US13_TC01() {
        extentTest = extentReports.createTest("US13_TC1301", "Store Manager olarak kupon olusturulabilmelidir, Cupon kodunun eklenebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
        // 1- Vendor "https://tradylinn.com/"  adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn ana sayfaya gidildi");

        // 2- Vendor "Giris yap" butonuna tiklar
        tradylinnPage.girisYap.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 3- Vendor "vendor adı veya e-posta adresi" inputuna gecerli Email girer"
        tradylinnPage.kullaniciAdiVeyaMail.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        extentTest.info("Gecerli Email girildi");


        // 4- Vendor "Parola" inputuna  gecerli parolayi girer
        tradylinnPage.sifre.sendKeys(ConfigReader.getProperty("gecerliSifre"));
        extentTest.info("Gecerli sifre girildi");

        // 5- Vendor "giris yap" butonuna tiklar
        tradylinnPage.login.click();
        extentTest.info("Giris Yap butonuna tiklandi");

        // 6- Vendor "Hesabım" butonuna tiklar
        ReusableMethods.waitFor(10);
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

        // 9- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code1 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code1, Keys.PAGE_DOWN, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 10- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Basarili sekilde code olusturdu");
        Driver.closeDriver();

    }

    @Test
    public void test_US13_TC02() {
        extentTest = extentReports.createTest("US13_TC1302", "Description bolumune aciklama eklenebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
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
        String code2 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code2);
        extentTest.info("Code satirina deger girildi");

        // 10- Vendor "Description" satirina bir tanimlama girer
        tradylinnPage.description.sendKeys("proje icin deneme olarak yazilmistir");
        extentTest.info("Description satirina bir aciklama girildi");

        // 11- Vendor "SUBMİT" butonuna tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        tradylinnPage.submitButonu.click();
        extentTest.info("Submit butonuna tiklandi");

        // 12- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Description bolumune basarili sekilde aciklama eklendi");
        Driver.closeDriver();
    }


    @Test
    public void test_US13_TC03() {
        extentTest = extentReports.createTest("US13_TC1303", "Discount Type bolumunde indirim turunun secilebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
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

        // 9- Vendor "Discount Type" ta bir Dropdown secer
        WebElement ddm = tradylinnPage.discountType;
        Select options = new Select(ddm);
        options.selectByIndex(1);
        extentTest.info("Discount Typeta bir Dropdown secildi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11-Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Discount Type bolumunde basarili sekilde indirim turu secildi");
        Driver.closeDriver();
    }


    @Test
    public void test_US13_TC04() {
        extentTest = extentReports.createTest("US13_TC1304", "Coupon Amount bolumune kupon tutarinin eklenebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
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

        // 9- Vendor "Coupon Amount" satirina bir kupon tutari girer
        tradylinnPage.couponAmount.sendKeys(String.valueOf(random.nextInt(1000)));
        extentTest.info("Coupon Amount satirina bir kupon tutari girildi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code4 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code4, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Coupon Amount bolumune basarili sekilde kupon tutari eklendi");
        Driver.closeDriver();
    }


    @Test
    public void test_US13_TC05() {
        extentTest = extentReports.createTest("US13_TC1305", "Coupon expiry date bolumune YYYY-MM-DD olacak sekilde tarihin eklenebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
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

        // 9- Vendor "Coupon expiry date" satirina YYYY-MM-DD olacak sekilde gecerli bir tarih girer
        tradylinnPage.couponAmount.sendKeys("2022-11-21");
        extentTest.info("Coupon expiry date bolumune istenen sekilde tarih girildi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code5 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code5, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Coupon expiry date bolumune basarili sekilde tarih eklendi");
        Driver.closeDriver();
    }


    @Test
    public void test_US13_TC06() {
        extentTest = extentReports.createTest("US13_TC1306", "Allow free shipping bolumunun isaretlenebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
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

        // 9- Vendor "Allow free shipping" secenegini isaretler
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        tradylinnPage.freeShipping.click();
        extentTest.info("Allow free shipping secenegi isaretlendi");

        // 10- Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code6 = String.valueOf(random.nextInt(250));
        tradylinnPage.code.sendKeys(code6, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11- Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Allow free shipping bolumu basarili sekilde isaretlendi");
        Driver.closeDriver();
    }


    @Test
    public void test_US13_TC07() {
        extentTest = extentReports.createTest("US13_TC1307", "Show on store bolumunun isaretlenebilir oldugu gorulmelidir");
        tradylinnPage = new TradylinnPage();
        actions = new Actions(Driver.getDriver());
        random = new Random();
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

        // 9- Vendor "Show on store" secenegini isaretler
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        tradylinnPage.showOnStore.click();
        extentTest.info("Show on store secenegi isaretlendi");

        // 10-Vendor "Code" satirina uniq bir deger girerek enter'a tiklar
        String code6 = String.valueOf(random.nextInt(250));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tradylinnPage.code.sendKeys(code6, Keys.ENTER);
        extentTest.info("Code satirina deger girildi");

        // 11 Vendor "Coupon Successfully Published." yazisinin görünüyor oldugunu test eder"
        Assert.assertTrue(tradylinnPage.submitOnayYazisi.isDisplayed());
        extentTest.pass("Show on store bolumu basarili sekilde isaretlendi");
        Driver.closeDriver();
    }

}
