package tests.us_016_017Test;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_016_017Page.US_16_17_TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_1703 extends TestBaseRapor {
    US_16_17_TradylinnPage tradylinnPage;
    @Test

    public void tc_1703() {
        extentTest=extentReports.createTest("1703","Vendor müşterileri shiping ve billing adreslerini farklı bilgilerle ekler");
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info( "vendor https://tradylinn.com adresine gider");
        tradylinnPage=new US_16_17_TradylinnPage();
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

        tradylinnPage.yeniEkleButonu.click();
        extentTest.info("Vendor “yeni ekle” butonunu tıklar");


        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        String fakeMail=faker.internet().emailAddress();
        String fakeFirstName=faker.name().firstName();
        String fakeLastName=faker.name().firstName();
        String fakeAdress1=faker.address().fullAddress();
        String fakeAdress2=faker.address().secondaryAddress();
        actions.click(tradylinnPage.userNameButonu).
                sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).
                sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(fakeFirstName).
                sendKeys(Keys.TAB).sendKeys(fakeFirstName).
                sendKeys(Keys.TAB).sendKeys("tecpro").
                sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.address().secondaryAddress()).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Uskudar").
                sendKeys(Keys.TAB).sendKeys("istanbul").
                sendKeys(Keys.TAB).sendKeys("353321").perform();


        jse.executeScript("arguments[0].scrollIntoView(true);",tradylinnPage.sameAsBillingButonu);
        jse.executeScript("arguments[0].click();",tradylinnPage.sameAsBillingButonu);

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                click(tradylinnPage.shippingFirstNameKutusu).sendKeys(fakeFirstName).
                sendKeys(Keys.TAB).sendKeys(fakeLastName).
                sendKeys(Keys.TAB).sendKeys("techpro").
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).
                sendKeys(Keys.TAB).sendKeys(faker.address().secondaryAddress()).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Karsıyaka").
                sendKeys(Keys.TAB).sendKeys("İzmir").
                sendKeys(Keys.TAB).sendKeys("343321").
                perform();
        extentTest.info("Yeni ekleyeceği kişinin isim,soyisim,telefon,şirket adını ve billing ile shipping adres bilgilerini farklı olarak doldurur");

        String billingAdres1=tradylinnPage.billingAdres1Kutusu.getText();
        String biilingAdres2=tradylinnPage.billingAdres2Kutusu.getText();
        String shippingAdres1=tradylinnPage.shippingAdres1Kutusu.getText();
        String shippingAdres2=tradylinnPage.shippingAdres2Kutusu.getText();

        Assert.assertEquals(billingAdres1,shippingAdres1);
        Assert.assertEquals(biilingAdres2,shippingAdres2);
        extentTest.pass("Shipping ve billing kısmındaki adres bilgilerinin farklı olduğunu doğrular");

        jse.executeScript("arguments[0].scrollIntoView(true);",tradylinnPage.submitButonu);
        jse.executeScript("arguments[0].click();",tradylinnPage.submitButonu);
        extentTest.info("Vendor submit butonunu tıklayarak kayıt işlemini yapar");

        //Driver.getDriver().close();


    }
}

