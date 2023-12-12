package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    Actions actions = new Actions(DriverManager.Driver());


    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.Driver().navigate().to("https://www.iyzico.com/");

    }


    @When("Go to the discover for myself section and see the open account button.")
    public void goToTheDiscoverForMyselfSectionAndSeeTheOpenAccountButton() {

        locators.click(locators.kesfet);
        locators.hesapAc.isDisplayed();

    }

    @Then("The user goes to the iyzico card section and sees the connection links")
    public void theUserGoesToTheIyzicoCardSectionAndSeesTheConnectionLinks() {
        locators.click(locators.iyzicoKart);
        for (int i = 0; i < locators.linkler.size(); i++) {
            locators.linkler.get(i).isDisplayed();

        }
    }

    @When("user goes to stores section and sees popular stores")
    public void userGoesToStoresSectionAndSeesPopularStores() {
        locators.click(locators.magazalar);
        locators.verifyContainsText(locators.populermagazatext,"Popüler Mağazalar");
    }

    @Then("user goes to campaigns section and sees active campaigns")
    public void userGoesToCampaignsSectionAndSeesActiveCampaigns() {
        locators.click(locators.kampanyalar);
        locators.aktifkampanyalar.isDisplayed();
    }

    @And("the user goes to the support section and sees the general information section")
    public void theUserGoesToTheSupportSectionAndSeesTheGeneralInformationSection() {
        locators.click(locators.destek);
        locators.verifyContainsText(locators.genelBilgiler,"Genel Bilgiler");

    }
}
