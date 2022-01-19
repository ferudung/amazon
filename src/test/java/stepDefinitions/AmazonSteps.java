package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSteps {
AmazonPage amazonPage=new AmazonPage();

    @When("Go to url")
    public void goToUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @And("Search {string}")
    public void search(String object) {
        amazonPage.cookiesBtn.click();
        amazonPage.searchBox.sendKeys(object+ Keys.ENTER);    }

    @And("Check that the results are listed")
    public void checkThatTheResultsAreListed() {
        amazonPage.resultTextElement.isDisplayed();
    }

    @And("Click iphone13 at the top of the list")
    public void clickIphoneAtTheTopOfTheList()  {
        amazonPage.firstResultLink.click();    }

    @Then("Log the following values for each size.\\(Size information  .Price  .Color .Stock status)")
    public void logTheFollowingValuesForEachSizeSizeInformationPriceColorStockStatus() {
        System.out.println("iPhone 13 Size: "+amazonPage.sizeText.getText());
        System.out.print("Color: " + amazonPage.colorText.getText());
        System.out.println("  Price: " + amazonPage.priceText.getText().substring(0,6)+ "," +amazonPage.priceText.getText().substring(7));
        System.out.println( "Stock :" +amazonPage.stockText.getText());
    }

}
