package pages.us_018Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_18_TradylinnPage {

    public US_18_TradylinnPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdiVeyaEmail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//*[@id=\"menu-item-1074\"]/a")
    public WebElement hesabim;
    //a[text()='Hesabım'])[1]

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerButonu;


    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[9]/a")
    public WebElement geriOdemeButonu;

    @FindBy(xpath = "//span[@class='wcfm_dashboard_item_title']")
    public List<WebElement> requestIdListesi;
    //tbody//tr//td[2]
    @FindBy(xpath = "//tbody//tr//td[3]")
    public List<WebElement> orderIdListesi;


    @FindBy(xpath = "//tbody//tr//td[4]")
    public List<WebElement> amountListesi;


    @FindBy(xpath = "//tbody//tr//td[5]")
    public List<WebElement> typeListesi;

    @FindBy(xpath = "//tbody//tr//td[6]")
    public List<WebElement> reasonListesi;










}
