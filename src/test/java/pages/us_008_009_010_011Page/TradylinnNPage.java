package pages.us_008_009_010_011Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnNPage {
    public TradylinnNPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdiVeyaMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabim;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButonu;

    @FindBy(xpath = "(//span[@class='wcfmfa fa-cube'])[1]")
    public WebElement urunlerButonu;

    @FindBy(xpath = "(//span[@class='wcfmfa fa-cube'])[3]")
    public WebElement yeniEkleButonu;


    @FindBy(xpath = "//*[text()='Add Product']")
    public WebElement addProductTexti;

    @FindBy(xpath = "//label[@class='wcfmfa fa-database']")
    public WebElement inventoryButonu;

    @FindBy(id = "manage_stock")
    public WebElement manageStockButonu;

    @FindBy(xpath = "//input[@id='stock_qty']")
    public WebElement stockMiktari;

    @FindBy(xpath = "//select[@id='backorders']")
    public WebElement vendorAllowBackordersButonu;


    @FindBy(xpath = "//label[@class='wcfmfa fa-truck']")
    public WebElement shippingButonu;

    @FindBy(xpath = "//input[@id='weight']")
    public WebElement weight;

    @FindBy(xpath = "//input[@id='length']")
    public WebElement length;

    @FindBy(xpath = "//input[@id='width']")
    public WebElement width;

    @FindBy(xpath = "//input[@id='height']")
    public WebElement height;


    @FindBy(xpath = "//select[@class='wcfm-select']")
    public WebElement teslimatZamani;

    @FindBy(xpath = "//label[@class='wcfmfa fa-server']")
    public WebElement attributesButonu;

    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorButonu;

    @FindBy(xpath = "//select[@id='attributes_value_1']")
    public WebElement colorSecme;


    @FindBy(xpath = "//input[@id='attributes_is_active_2']")
    public WebElement sizeButonu;


    @FindBy(xpath = "//select[@id='attributes_value_2']")
    public WebElement sizeBelirleme;

    @FindBy(xpath = "//label[@class='wcfmfa fa-certificate']")
    public WebElement toptanUrunSecme;

    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement pieceType;

    @FindBy(xpath = "//input[@id='unitpercart']")
    public WebElement unitsPerPiece;

    @FindBy(xpath = "//input[@id='minorderqtytr']")
    public WebElement minOrderQuantity;
}
