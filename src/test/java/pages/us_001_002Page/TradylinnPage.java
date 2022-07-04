package pages.us_001_002Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[text()='Üye Ol']")
            public WebElement uyeOlButonu;

    @FindBy(xpath = "//a[text()='Satıcı Ol']")
          public WebElement becomeVendorButonu;

    @FindBy(xpath = "//input[@id='user_email']")
          public WebElement registerEmail;

    @FindBy(xpath = "//input[@id='passoword']")
          public WebElement registerPassword;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
          public WebElement confirmRegisterPassword;

    @FindBy(xpath = "//input[@id='wcfm_membership_register_button']")
          public WebElement registerButton;

    @FindBy(xpath = "//div[@class='wcfm_membership_thankyou_content']")
         public WebElement greenBlock;

    @FindBy(xpath = "//*[text()='This Email already exists. Please login to the site and apply as vendor.']")
         public WebElement errorMesajı;

    @FindBy(xpath = "//a[@class='login inline-type']")
        public WebElement signinButton;

    @FindBy(xpath = "//input[@id='username']")
        public WebElement mailBox;

    @FindBy(xpath = "//input[@id='password']")
        public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
        public WebElement loginButton;

    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
        public WebElement myAccountButton;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
        public WebElement storeManager;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
        public WebElement dbOrders;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads']")
    public WebElement dbDownloads;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
    public WebElement dbAdress;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
    public WebElement dbAccountDetails;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--appointments']")
    public WebElement dbAppointments;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wishlist']")
    public WebElement dbWishlist;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--support-tickets']")
    public WebElement dbSupportTickets;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--followings']")
    public WebElement dbFollowing;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
    public WebElement dbLogout;

    @FindBy(xpath = "//p[text()='Siparişler']")
    public WebElement orders;

    @FindBy(xpath = "//p[text()='İndirmeler']")
    public WebElement downloads;

    @FindBy(xpath = "//p[text()='Adresler']")
    public WebElement adresses;

    @FindBy(xpath = "//p[text()='Hesap Detayları']")
    public WebElement accountDetails;

    @FindBy(xpath = "//p[text()='Favorilerim']")
    public WebElement wishlist;

    @FindBy(xpath = "//p[text()='Çıkış']")
    public WebElement logout;













}


