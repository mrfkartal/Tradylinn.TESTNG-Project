package pages.us_016_017Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_16_17_TradylinnPage {
    public US_16_17_TradylinnPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdiVeyaMailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement parolaKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginKutusu;

    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement storeManagerButonu;

    @FindBy(xpath = "//span[@class='wcfmfa fa-user-circle']")
    public WebElement musterilerButonu;


    @FindBy(xpath = "//th[@class='sorting_asc']")
    public WebElement nameYazisi;

    @FindBy(xpath = "//th[@class='sorting_disabled'][1]")
    public WebElement emailYazisi;

    @FindBy(xpath = "//th[@class='sorting_disabled'][2]")
    public WebElement locationYazisi;

    @FindBy(xpath = "//th[@class='sorting_disabled'][5]")
    public WebElement moneySpentYazisi;

    @FindBy(xpath = "//th[@class='sorting_disabled'][6]")
    public WebElement lastOrderYazisi;

    @FindBy(xpath = "//a[@class='dt-button buttons-pdf buttons-html5']")
    public WebElement pdfButonu;


    @FindBy(xpath = "//a[@class='dt-button buttons-excel buttons-html5']")
    public WebElement excelButonu;

    @FindBy(xpath = "//a[@class='dt-button buttons-csv buttons-html5']")
    public WebElement csvButonu;

    @FindBy(xpath = "//span[@class='wcfmfa fa-user-plus']")
    public WebElement yeniEkleButonu;

    @FindBy(xpath = "//p[@class='user_name wcfm_ele wcfm_title']") ////p[@class='user_name wcfm_ele wcfm_title']
    public WebElement userNameButonu;

    @FindBy(xpath = "//*[text()='Edit Customer']")
    public WebElement editCostomerYazisi;

    @FindBy(xpath = "//*[text()='Customer Successfully Saved']")
    public WebElement customerSuccessfullySavedYazisi;

    @FindBy(xpath = "//input[@id='wcfm_customer_submit_button']")
    public WebElement submitButonu;

    @FindBy(xpath = "//input[@id='same_as_billing']")
    public WebElement sameAsBillingButonu;

    @FindBy(xpath = "//input[@id='sfirst_name']")
    public WebElement shippingFirstNameKutusu;

    @FindBy(xpath = "//input[@id='baddr_1']")
    public WebElement billingAdres1Kutusu;

    @FindBy(xpath = "//input[@id='baddr_2']")
    public WebElement billingAdres2Kutusu;

    @FindBy(xpath = "//input[@id='saddr_1']")
    public WebElement shippingAdres1Kutusu;

    @FindBy(xpath = "//input[@id='saddr_2']")
    public WebElement shippingAdres2Kutusu;
    @FindBy(xpath = "//a[@class='wcfm_menu_item']")
    public WebElement logOUt;

    @FindBy(xpath = "  //input[@id='username'][1]")
    public WebElement logOUtSonrasıUsername;

}
