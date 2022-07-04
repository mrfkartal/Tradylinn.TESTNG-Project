package tests.us_001_002Test;

import org.testng.annotations.Test;
import pages.us_001_002Page.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_201 extends TestBaseRapor {

     TradylinnPage obj;

     @Test
     public void test201() throws InterruptedException {

         extentTest=extentReports.createTest("US_002_TC_201","Vendor olarak email ve şifre\n" +
                 " girilebilmeli ve My Account'u görebilmeli");
         obj=new TradylinnPage();
     Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
         extentTest.info("tradylinn anasayfasına gider");

      obj.signinButton.click();
          extentTest.info("Login sayfasına yönlendirir");

      obj.mailBox.sendKeys(ConfigReader.getProperty("gecerliEmail"));
      extentTest.info("Login girisi için gercerli email ve sifreyi girer");

      obj.passwordBox.sendKeys(ConfigReader.getProperty("gecerliSifre"));
      extentTest.info("Login girisi için gercerli password'ü girer");

      obj.loginButton.click();
      extentTest.pass("Login buttonunun calıstığını test eder");
      Thread.sleep(3000);

      obj.myAccountButton.click();
      extentTest.pass("myAccount butonunun calıstığını test eder");

      Driver.closeDriver();


   }
}
