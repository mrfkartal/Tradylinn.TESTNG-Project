package pages.us_013_014_015Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(xpath = "(//span[@class='text'])[6]")
    public WebElement kuponlarButonu;

    @FindBy (xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement kuponlarYeniEkleButonu;

    @FindBy (xpath = "//input[@id='title']")
    public WebElement code;

    @FindBy (xpath = "//input[@name='submit-data']")
    public WebElement submitButonu;

    @FindBy (xpath = "//*[text()='Coupon Successfully Published.']")
    public WebElement submitOnayYazisi;

    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement description;

    @FindBy (xpath = "//select[@name='discount_type']")
    public WebElement discountType;

    @FindBy (xpath = "//input[@id='coupon_amount']")
    public WebElement couponAmount;

    @FindBy (xpath = "//input[@name='free_shipping']")
    public WebElement freeShipping;

    @FindBy (xpath = "//input[@name='show_on_store']")
    public WebElement showOnStore;

    @FindBy (xpath = "//input[@id='minimum_amount']")
    public WebElement minimumSpend;

    @FindBy (xpath = "//input[@id='maximum_amount']")
    public WebElement maximumSpend;

    @FindBy (xpath = "//input[@id='individual_use']")
    public WebElement individualUseOnly;

    @FindBy (xpath = "//input[@id='exclude_sale_items']")
    public WebElement excludeSaleItems;

    @FindBy (xpath = "//select[@id='exclude_product_categories']")
    public WebElement excludeCategories;

    @FindBy (xpath = "//div[@id='coupons_manage_limit']")
    public WebElement limitButon;

    @FindBy (xpath = "//input[@id='usage_limit']")
    public WebElement usageLimitPerCoupon;

    @FindBy (xpath = "//input[@id='limit_usage_to_x_items']")
    public WebElement limitUsageToXItems;

    @FindBy (xpath = "//input[@id='usage_limit_per_user']")
    public WebElement usageLimitPerUser;













}