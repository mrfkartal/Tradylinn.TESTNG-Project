package pages.us_012Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class TradylinnPage {
    public TradylinnPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement mailKutusu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifreKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButonu;

   @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    public WebElement siparislerButonu;
    @FindBy(xpath = " //span[@class='nobr']")
    public List<WebElement> siparislerBaslikListesi;


    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[1]")
    public WebElement siparislerButonu2;

   @FindBy(xpath = "//tr[@class='woocommerce-orders-table__row woocommerce-orders-table__row--status-completed order']")
    public List<WebElement> tamamlanmisSiparislerListesi;

    @FindBy(xpath = " //tr[@class='woocommerce-orders-table__row woocommerce-orders-table__row--status-on-hold order']")
    public List<WebElement> odeniyorSiparislerListesi;





    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads']")
    public WebElement indirmelerButonu;
    @FindBy(xpath = " //span[@class='nobr']")
    public List<WebElement> indirmelerBaslikListesi;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[2]")
    public WebElement indirmelerButonu2;

    @FindBy(xpath = " //tbody//tr")
    public List<WebElement> indirmelerListesi;

   @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement adreslerButonu;
    @FindBy(xpath = "(//div[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[3]")
    public WebElement adreslerButonu2;

    @FindBy(xpath = "(//table[@class='address-table'])[1]//tbody//tr")
    public List<WebElement> faturaAdresiListesi;

    @FindBy(xpath = "(//table[@class='address-table'])[2]//tbody//tr")
    public List<WebElement> gonderimAdresiListesi;


   @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
    public WebElement hesapDetaylarButonu;
    @FindBy(xpath ="(//div[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])[4]")
    public WebElement hesapDetaylarButonu2;

    @FindBy(xpath = "//p[@class='woocommerce-form-row woocommerce-form-row--first form-row form-row-first']")
    public WebElement  hesapDetaylariAdBolumu;
    @FindBy(xpath = "//p[@class='woocommerce-form-row woocommerce-form-row--last form-row form-row-last']")
    public WebElement  hesapDetaylariSoyAdBolumu;
    @FindBy(xpath = "//p[@class='woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide']")
    public List<WebElement>  hesapDetaylariEmailBiografiParolaBolumu;

    @FindBy(xpath = "//button[@class='woocommerce-Button button btn btn-dark btn-rounded btn-sm']")
    public WebElement  hesapDetaylariDegisiklikButonu;

      @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement  hesapDetaylariDegistiMesaji;
    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[1]")
    public WebElement hesapDetaylariAdInputu;
    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]")
    public WebElement hesapDetaylariSoyAdInputu;
    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[3]")
    public WebElement hesapDetaylariGorunenAdInputu;

}
