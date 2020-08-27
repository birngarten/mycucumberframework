package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.FhcRegisterPage;

import pages.FhcTripLoginPage;
import utilities.Driver;

public class FhcRegisterStepDefinitions {

    FhcRegisterPage fhcRegisterPage = new FhcRegisterPage();
    FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage();

    @Given("user on the fhctrip homepage")
    public void user_on_the_fhctrip_homepage() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");

    }

    @Given("user clicks {string} button")
    public void user_clicks_button(String string) {
        fhcTripLoginPage.createButton.click();

    }

    @Given("user enters username")
    public void user_enters_username() {
        fhcRegisterPage.username.sendKeys("Resit");

    }

    @Given("user enters password")
    public void user_enters_password() {
        fhcRegisterPage.password.sendKeys("Ada1213");

    }

    @Given("user enters email")
    public void user_enters_email() {
        fhcRegisterPage.mail.sendKeys("abced@gmail.com");

    }

    @Given("user enters fullname")
    public void user_enters_fullname() {
        fhcRegisterPage.fullname.sendKeys("Resit Insan");

    }

    @Given("user enters phone")
    public void user_enters_phone() {
        fhcRegisterPage.phone.sendKeys("012353647");

    }

    @Given("user enters SSN")
    public void user_enters_SSN() {
        fhcRegisterPage.ssnumber.sendKeys("2345761");

    }

    @Given("user enters driving licence")
    public void user_enters_driving_licence() {
        fhcRegisterPage.drivingLicense.sendKeys("123");

    }

    @Given("user selects country from country dropdown")
    public void user_selects_country_from_country_dropdown() {
        Select select = new Select(fhcRegisterPage.Country);
        select.selectByIndex(12);

    }

    @Given("user selects state from country dropdown")
    public void user_selects_state_from_country_dropdown() {
        Select select = new Select(fhcRegisterPage.Country);
        select.selectByIndex(7);

    }

    @Given("user enters address")
    public void user_enters_address() {
        fhcRegisterPage.address.sendKeys("Almanya");

    }

    @Given("user enters working sectors")
    public void user_enters_working_sectors() {
        fhcRegisterPage.sector.sendKeys("IT_Edu");

    }

    @Given("user enters birthday")
    public void user_enters_birthday() {
        fhcRegisterPage.birthdate.sendKeys("12.10.1977");

    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        fhcRegisterPage.saveButton.click();

    }
}
