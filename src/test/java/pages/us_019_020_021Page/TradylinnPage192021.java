package pages.us_019_020_021Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage192021 {
    public TradylinnPage192021() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //===============ortak locatorlar=================

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisButonu;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@value='Giriş Yap'])[1]")
    public WebElement girisYap;

    @FindBy (xpath = "(//a[@href='https://tradylinn.com/my-account-2/'])[1]")
    public WebElement hesabim;
    @FindBy (xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storeManager;
    //=======================================================

    //==============store manager butonlari===============

    @FindBy (xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-followers']")
    public WebElement takipciler;

    @FindBy (xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-reviews']")
    public WebElement incelemeler;

    @FindBy (xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-reports']")
    public WebElement raporlar;
    //=====================================================


    //=================== detay locatorlar=====================
        //=======TC2001=======
    @FindBy(xpath = "//th[@aria-label='Author']")
    public WebElement kullanicibilgi;
    @FindBy(xpath = "//th[@aria-label='Comment']")
    public WebElement yorum;
    @FindBy(xpath = "//th[@aria-label='Rating']")
    public WebElement puan;
    @FindBy(xpath = "//th[@aria-label='Dated']")
    public WebElement tarih;
    @FindBy(xpath = "//th[@aria-label='Actions']")
    public WebElement eylem;

        //======TC1901======
    @FindBy (xpath = "//th[@aria-label='Name']")
    public WebElement name;
    @FindBy (xpath = "//th[@aria-label='E-posta']")
    public WebElement email;
    @FindBy (xpath = "//th[@aria-label='İşlem']")
    public WebElement islem;

        //======TC2101=====

    @FindBy (xpath = "//*[text()='Year']")
    public WebElement year;
    @FindBy (xpath = "//*[text()='Last Month']")
    public WebElement lastmonth;
    @FindBy (xpath = "//*[text()='This Month']")
    public WebElement thismonth;
    @FindBy (xpath = "//*[text()='Last 7 Days']")
    public WebElement sevendays;
    @FindBy (xpath = "//input[@class='wcfm-date-range']")
    public WebElement choosedate;
    @FindBy (xpath = "(//*[text()='9'])[2]")
    public WebElement startdate;
    @FindBy (xpath = "(//*[text()='9'])[3]")
    public WebElement enddate;
    @FindBy (xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement reportyear;
    @FindBy (xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement reportlastmonth;
    @FindBy (xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement reportthismonth;
    @FindBy (xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement reportsevendays;












}

