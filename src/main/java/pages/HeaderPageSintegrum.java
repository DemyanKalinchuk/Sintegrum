package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class HeaderPageSintegrum extends BasePage {


    public HeaderPageSintegrum(WebDriver driver) {
        super(driver);
    }

    private By checkLogo = (By.xpath("//header/div/div/div[1]/a/p"));
    private By clickOnButtonAboutServices = (By.xpath("//*[@href='#about']"));
    private By clickOnButtonAdvantages = (By.xpath("//*[@href='#advantage']"));
    private By clickOnButtonPartners = (By.xpath("//*[@href='#partners']"));
    private By clickOnButtonReviews = (By.xpath("//*[@href='#reviews']"));
    private By clickOnButtonRequestTestDrive = (By.xpath("//button[@class='btn btn-small btn-small--desktop popup-test-drive']"));
    private By headerTxt = (By.xpath("//div[@class='custom-model-wrap']/div/p[@class='form-subtitle']"));

    String loginErrorMessageString = "Заповніть форму, щоб наш менеджер зв'язався з вами для проведення тест-драйву";

    public void setCheckLogo(){
        driver.findElement(checkLogo);
    }

    public void setClickOnButtonAboutServices() {
        driver.findElement(clickOnButtonAboutServices).click();
    }

    public void setClickOnButtonAdvantages() {
        driver.findElement(clickOnButtonAdvantages).click();
    }

    public void setClickOnButtonPartners() {
        driver.findElement(clickOnButtonPartners).click();
    }

    public void setClickOnButtonReviews() {
        driver.findElement(clickOnButtonReviews).click();
    }

    public void setClickOnButtonRequestATestDrive() {
        driver.findElement(clickOnButtonRequestTestDrive).click();
    }

    public void checkHeaderMessageOnModalWindow() {
        String headerText = driver.findElement(headerTxt).getText();
        Assert.assertEquals(headerText, loginErrorMessageString);
    }

}
