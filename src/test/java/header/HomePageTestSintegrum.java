package header;

import utils.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static core.TestStepLogger.logStep;

public class HomePageTestSintegrum extends BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void goToHomePage() {
        open();

    }

    @Test
    @Description("Check header menu")
    public void checkLogoAndHeader() {
        logStep(1, "Open home page and check logo");
        headerPageSintegrum.setCheckLogo();

        logStep(2, "Click on link about service");
        headerPageSintegrum.setClickOnButtonAboutServices();

        logStep(3, "Click on link advantages");
        headerPageSintegrum.setClickOnButtonAdvantages();

        logStep(4, "Click on link partners");
        headerPageSintegrum.setClickOnButtonPartners();

        logStep(5, "Click on link reviews");
        headerPageSintegrum.setClickOnButtonReviews();
    }

    @Test
    @Description("Click on button 'Request а test-drive'")
    public void checkInfoAboutCompany() {
        headerPageSintegrum.setClickOnButtonRequestATestDrive();
        headerPageSintegrum.checkHeaderMessageOnModalWindow();
    }

}


