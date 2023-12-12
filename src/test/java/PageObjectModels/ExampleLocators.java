package PageObjectModels;

import Utilities.DriverManager;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExampleLocators extends Methods {
    public ExampleLocators() {
        PageFactory.initElements(DriverManager.Driver(), this);
    }
    @FindBy(linkText = "Keşfet")
    public WebElement kesfet;
    @FindBy(linkText = "iyzico Hesabını Aç")
    public WebElement hesapAc;
    @FindBy(linkText = "iyzico Kart")
    public WebElement iyzicoKart;
    @FindBy(xpath = "//div[@class='buttonGroup']/div/a")
    public List<WebElement> linkler;
    @FindBy(linkText = "Mağazalar")
    public WebElement magazalar;
    @FindBy(xpath = "//div/h3[text()='Popüler Mağazalar']")
    public WebElement populermagazatext;
    @FindBy(linkText = "Kampanyalar")
    public WebElement kampanyalar;

    @FindBy(xpath = "//li[@class='active']/a")
    public WebElement aktifkampanyalar;

    @FindBy(linkText = "Destek")
    public WebElement destek;

    @FindBy(linkText = "Genel Bilgiler")
    public WebElement genelBilgiler;

}
