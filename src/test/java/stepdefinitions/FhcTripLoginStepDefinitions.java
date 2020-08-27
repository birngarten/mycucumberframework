package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FhcTripLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcTripLoginStepDefinitions {
    FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage();

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));



    }

    @Given("user enters valid username")
    public void user_enters_valid_username() {
        fhcTripLoginPage.username.sendKeys(ConfigurationReader.getProperty("gecerli_username"));


    }

    @Given("user enters  valid password")
    public void user_enters_valid_password() {
        fhcTripLoginPage.password.sendKeys(ConfigurationReader.getProperty("gecerli_password"));


    }


    @Given("user clicks login button")
    public void user_clicks_login_button() throws InterruptedException {
        fhcTripLoginPage.loginButton.click();
        Thread.sleep(9000);

    }

    @Then("verify login is successfull")
    public void verify_login_is_successfull() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ListOfUsers"));

    }

    @Given("user enters invalid username")
    public void user_enters_invalid_username() {
        fhcTripLoginPage.username.sendKeys(ConfigurationReader.getProperty("gecersiz_username"));

    }

    @Given("user enters  invalid password")
    public void user_enters_invalid_password() {
        fhcTripLoginPage.password.sendKeys(ConfigurationReader.getProperty("gecersiz_password"));

    }

    @Then("verify login is not successfull")
    public void verify_login_is_not_successfull() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Log in"));

    }

    @Given("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
        fhcTripLoginPage.username.sendKeys(string);  // method parametresi string oldugu icin
                               // sendKeys'in icinede string yaziyoruz. Buna parametre 'le cagirma diyoruz.
                               // Cunku parametre_fhclogin.feature dosyasinda(file) username ve
                               // password String olarak verilmis

    }

    @Given("user enters  valid password {string}")
    public void user_enters_valid_password(String string) {
        fhcTripLoginPage.password.sendKeys(string);


    }
}
