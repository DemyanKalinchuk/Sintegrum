package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import pages.HeaderPageSintegrum;
import steps.HeaderPageSteps;

import java.time.Duration;

public class BaseTest {

    private final WebDriver driver = createDriver();
    private final BasePage basePage = new BasePage(driver);
    protected HeaderPageSteps headerPageSteps = new HeaderPageSteps(driver);
    protected HeaderPageSintegrum headerPageSintegrum = new HeaderPageSintegrum(driver);

    public WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public void open() {
        basePage.show("https://sintegrum.com/");
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        driver.quit();
    }

}
