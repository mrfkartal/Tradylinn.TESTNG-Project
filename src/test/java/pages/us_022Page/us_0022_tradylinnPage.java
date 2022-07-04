package pages.us_022Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class us_0022_tradylinnPage {

    public us_0022_tradylinnPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement girisYap;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdiVeyaMail;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement indirimliUrunlertumunuGorButonu;

    ////*[@id="main"]/div/div/div[1]/div/div/div/section/div/div[2]/div/div/div/h2/a
    // @FindBy(xpath = "(//h2[@class='elementor-heading-title elementor-size-default'])[3]")
    //public WebElement indirimliUrunlertumunuGorButonu;

    @FindBy (xpath = "//img[@alt='Tradylinn']")
    public WebElement anaSayfa;

    @FindBy (xpath= "//*[@id=\"main\"]/div/div/div[2]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement cokSatanlarTumunuGorButonu;

    @FindBy (xpath= "//*[@id=\"main\"]/div/div/div[3]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement yeniUrunlerTumunuGorButonu;

    @FindBy (xpath= "//*[@id=\"main\"]/div/div/div[4]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement evYasamTumunuGorButonu;

    @FindBy (xpath= "//*[@id=\"main\"]/div/div/div[5]/div/div/div/section/div/div[2]/div/div/div/h2/a")
    public WebElement takiAksesuarTumunuGorButonu;

    @FindBy (xpath = "//select[@name='orderby'] ")
    public WebElement siralaButonu;

    @FindBy (xpath = "//option[@value='menu_order']")
    public WebElement varsayilanSiralama;

    @FindBy (xpath = "//option[@value='popularity']")
    public WebElement enCokInceleneneGoreSirala;

    @FindBy (xpath = "//*[@id=\"main\"]/div/div/div/div[3]/div[1]/form/select/option[3]")
    public WebElement enCokOyAlanaGoreSirala;

    @FindBy (xpath = "//option[@value='date']")
    public WebElement enYeniyeGoreSirala;

    @FindBy (xpath = "//option[@value='price']")
    public WebElement dusukFiyattanYuksekFiyataGoreSirala;

    @FindBy (xpath = "//option[@value='price-desc']")
    public WebElement yuksekFiyattanDusukFiyataGoreSirala;

    @FindBy (xpath= "//select[@name='count']")
    public WebElement urunAdetFiltresi;

    @FindBy (xpath = "//option[@value='36']")
    public WebElement otuzAltiAdetSec;

    @FindBy (xpath = "//span[@class='price']")
    public List<WebElement> fiyatListesi;

    @FindBy(xpath = "//div[@class='main-content']//div[4]//span//ins//span[1]//bdi")
    public  List<WebElement> indirimliurunlerList;


    ////div[@class='main-content']//div[1]//span//ins//span[1]//bdi


}
