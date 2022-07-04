package pages.us_003_004Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UsPage {
    public UsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public static WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdiVeyaMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy(xpath = "(//a[text()='Hesabım'])[1]")
    public WebElement hesabimButonu;

    @FindBy(xpath = " //a[@href=\"https://tradylinn.com/my-account-2/\"])[1]")
    // (//a[text()='Hesabım'])[1] //a[@href="https://tradylinn.com/my-account-2/"])[1]
    public WebElement hesabim;

    @FindBy(xpath = "(//i[@class=‘w-icon-long-arrow-right’])[2] ")
    public WebElement siparişlerButonu;

    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[1]")
    public WebElement siparisler;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
    public WebElement siparislerButton;


    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
    //(//i[@class='w-icon-long-arrow-right'])[1]
    public WebElement alisveriseDevamButonu;

    @FindBy(xpath = "//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'][1]")
    public WebElement birinciUrun;
    //(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[1]//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'][1]

    @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[2]")
    public WebElement ikinciUrun;


    @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[3]")
    public WebElement ucuncuUrun;

    @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[4]")
    public WebElement dorduncuUrun;

    @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[5]")
    public WebElement besinciUrun;
    ////a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'][5]

    @FindBy(xpath = "(//a[@href='https://tradylinn.com/cart/'])[1]")
    public WebElement sepet;
    @FindBy(xpath = "//a[text()='Sepeti görüntüle']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//a[text()='Ödeme']")
    public WebElement odemeButonu;

    @FindBy(xpath = "(//input[@class='input-text '])[1]")
    public WebElement adBtn;

    @FindBy(xpath = "(//input[@class='input-text '])[2]")
    public WebElement sydBtn;

    @FindBy(xpath = "(//input[@class='input-text '])[4]")
    public WebElement sokakAdresi;

    @FindBy(xpath = "(//input[@class='input-text '])[5]")
    public WebElement sokakAdresi2;
    @FindBy(xpath = "(//input[@class='input-text '])[6]")
    public WebElement postaKodu;
    @FindBy(xpath = "(//input[@class='input-text '])[7]")
    public WebElement ilçsemt;

    @FindBy(xpath = "(//input[@class='input-text '])[6]")
    public WebElement telefon;

    @FindBy(xpath = "(//input[@class='input-text '])[9]")
    public WebElement mail;

    @FindBy(xpath = "//input[@class='input-text pac-target-input']")
    public WebElement teslimatAdresi;

    @FindBy(xpath = "//input[@id='payment_method_bacs']")
    public WebElement odemeSecimi;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement onayButonu;

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement siparisAlindiYazisi;
    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement siparisinizAlinmistirYazisi;

    @FindBy(xpath = "//span[text()='Sipariş Numarası']")
    public WebElement siparisNo;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement ddm;

    @FindBy(xpath = "//th[@class='product-price']")
    public WebElement fiyat;

    @FindBy(xpath = "//th[@class='product-quantity']")
    public WebElement miktar;

    @FindBy(xpath = "//tr[@class='cart-subtotal']")  //tr[@class='order-total']
    public WebElement araToplam;

    @FindBy(xpath = "(//span[@class=\"woocommerce-Price-amount amount\"])[17]")
    public WebElement araToplamFiyat;

    @FindBy(xpath = "//button[@title='Artı'][1]")
    public WebElement artı;

    @FindBy(xpath = "//button[@title='Eksi'][1]")
    public WebElement eksi;

    @FindBy(xpath = "//input[@id='quantity_62b894af031cc']")
    public WebElement artmadanÖncekiSayı;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[12]")
    public WebElement aratoplamilk;
    //(//span[@class='woocommerce-Price-amount amount'])[13]

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[18]")
    public WebElement araToplamGüncel;

    @FindBy(xpath = "//button[@name='clear_cart']")
    public WebElement temizleButton;

    @FindBy(xpath = "//p[@class='cart-empty woocommerce-info']")
    public WebElement sepetBosYazisi;

    @FindBy(xpath = "//a[@class='button wc-backward btn btn-rounded btn-dark']")
    public WebElement magazayaGeriDn;

    @FindBy(xpath = "//tr[@class='cart-subtotal']")
    public WebElement artıncaAraToplam1;

    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[17]")
    public WebElement azalıncaToplam;

    @FindBy(xpath = "//button[@title='Artı'][1]")
    public WebElement artıButton;

    @FindBy(xpath = "//button[@title='Eksi'][1]")
    public WebElement eksiButton;

    @FindBy(xpath = "//button[@name='update_cart']")
    public WebElement sepetiYenile;

    @FindBy(xpath = "//button[@name='calc_shipping']")
    public WebElement fiyatıGüncelle;

    @FindBy(xpath = "(//input[@title='Miktar'])[1]")
    public WebElement birMiktar;

    @FindBy(xpath = "(//input[@title='Miktar'])[1]")
    public WebElement ikiMiktar;

    @FindBy(xpath = "//input[@id='coupon_code']")
    public WebElement kuponKullan;

    @FindBy(xpath = "//tr[@class='order-total']")
    public WebElement populateToplamRakam;

    @FindBy(xpath = "(//img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[15]")
    public WebElement surahi;

    @FindBy(xpath = "//input[@title='Miktar']")
    public WebElement SayılacakürünMinMaxMktr;

    @FindBy(xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[6]")
    public WebElement SayılacakürünEkleButton;

    @FindBy(xpath = "//link[text()='https://tradylinn.com/checkout-2/2]")
    public WebElement linkText;

    @FindBy(xpath = "//div[@class='woocommerce-info alert alert-simple alert-icon alert-close-top alert-info']")
    public  WebElement fiyatGüncellendiYazısı;

    @FindBy(xpath = "//li[@class=' alert alert-simple alert-icon alert-close-top alert-danger']")
    public WebElement stoktanFazlaUrunEklenemezText;

    @FindBy(xpath = "//a[@class='next page-numbers']")
    public WebElement ikinciSyfa;

    @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement alısveriseDevamEt;

    @FindBy(xpath = "") //i[@class='w-icon-long-arrow-left']  //a[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']
    public WebElement getAlısveriseDevamEt2;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement odemeSayfasınaGit;




}

