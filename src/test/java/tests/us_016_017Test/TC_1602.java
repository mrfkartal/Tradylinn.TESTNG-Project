package tests.us_016_017Test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_016_017Page.US_16_17_TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TC_1602 extends TestBaseRapor {
    US_16_17_TradylinnPage tradylinnPage;

    @Test
    public void tc_1602pdf() {

        extentTest=extentReports.createTest("1602","Vendor müşterilerini pdf olarak indirir ");
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


        tradylinnPage.pdfButonu.click();
        ReusableMethods.waitForPageToLoad(3);
        String farkliKisim= System.getProperty("user.home");
        String ortakKisimPDF= "\\Downloads\\Store Manager – Tradylinn.pdf";
        String arananDosyaYoluPDF= farkliKisim+ortakKisimPDF;
        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYoluPDF)));
        extentTest.pass("Vendor “PDF” seceneğini tıklayarak dosyanın indiğini doğrular");
        // Driver.getDriver().close();

    }

    @Test

    public void tc_1602excel(){
        extentTest=extentReports.createTest("1602","Vendor müşterilerin  bilgilerini excel olarak indirir");
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

        jse.executeScript("arguments[0].click();",tradylinnPage.excelButonu);
        ReusableMethods.waitForPageToLoad(3);
        String farkliKisim= System.getProperty("user.home");
        String ortakKisimExcel = "\\Downloads\\Store Manager – Tradylinn.xlsx";
        String arananDosyaYoluExcel= farkliKisim+ortakKisimExcel;
        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYoluExcel)));
        ReusableMethods.waitFor(3);
        extentTest.pass("Vendor “EXCEL” seceneğini tıklayarak dosyanın indiğini doğrular");
        //Driver.getDriver().close();
    }

    @Test
    public void tc_1602csv(){
        extentTest=extentReports.createTest("1602","Vendor müşterilerin bilgilerini csv olarak indirir");
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

        tradylinnPage.csvButonu.click();
        ReusableMethods.waitForPageToLoad(3);
        String farkliKisim= System.getProperty("user.home");
        String ortakKisimCsv = "\\Downloads\\Store Manager – Tradylinn.csv";
        String arananDosyaYoluCsv= farkliKisim+ortakKisimCsv;
        Assert.assertTrue(Files.exists(Paths.get(arananDosyaYoluCsv)));
        extentTest.pass("Vendor “CSV” seceneğini tıklayarak dosyanın indiğini doğrular");
        //Driver.getDriver().close();


    }
}
