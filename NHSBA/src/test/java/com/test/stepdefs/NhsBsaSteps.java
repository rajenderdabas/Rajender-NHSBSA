package com.test.stepdefs;

import com.nhsbsa.pages.NhsSbaPage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class NhsBsaSteps {

    private NhsSbaPage nhsSbaPage;
    private WebDriver driver;
    Scenario scenario = null;

    //####################################

    @Given("^I am a person from \"([^\"]*)\"$")
    public void i_am_a_person_from(String countryApply) {
        System.out.println("I am a person from :: " + countryApply);
        nhsSbaPage = new NhsSbaPage(Hooks.driver);
        nhsSbaPage.startEligibilityCheckProcess();
        nhsSbaPage.selectLivingCountry(countryApply);
    }
    @When("^I check my eligibility for NHSBSA$")
    public void i_check_my_eligibility_for_nhsbsa(DataTable dataTable) {
        List<Map<String, String>> nhsbsa_data = dataTable.asMaps(String.class, String.class);

        System.out.println("I check my eligibility for NHSBSA");
        nhsSbaPage.selectGPRegistered(nhsbsa_data.get(0).get("GP_Practice"));
        nhsSbaPage.countryDentalRegistered(nhsbsa_data.get(0).get("Dental_Practice"));
        nhsSbaPage.selectDateOfBirth(nhsbsa_data.get(0).get("DOB"));
        nhsSbaPage.selectLivingWithPartner(nhsbsa_data.get(0).get("Partner"));
        nhsSbaPage.selectClaimBenefits(nhsbsa_data.get(0).get("Partner_Benefit_Claim"));
        nhsSbaPage.selectUniversalCredit(nhsbsa_data.get(0).get("Universal_Credit"));
        nhsSbaPage.jointUniversalResponsibility(nhsbsa_data.get(0).get("Universal_Credit_Benefit"));
        nhsSbaPage.selectCombinedTakeHomePay(nhsbsa_data.get(0).get("Take_Home_Pay_Criteria_Meet"));
        if(nhsbsa_data.get(0).get("Take_Home_Pay_Criteria_Meet").equalsIgnoreCase("No")){
            nhsSbaPage.selectPregnantPartner("Yes");
            nhsSbaPage.servingInjury("No");
            nhsSbaPage.isDiabetic("No");
            nhsSbaPage.isGlucoTested("No");
            nhsSbaPage.isCareHome("No");
            nhsSbaPage.savingInvestment("No");
        }

    }
    @Then("^I should see the NHSBSA eligibility checker as \"([^\"]*)\"$")
    public void i_should_see_the_nhsbsa_eligibility_checker(String isEligible) throws InterruptedException {
        System.out.println("I should see the NHSBSA eligibility checker");
        boolean f = Boolean.parseBoolean(isEligible.toLowerCase());
        boolean returnesult = nhsSbaPage.verifyResult("You get help with NHS costs");
        Hooks.scenario.write("Actual Result :: " + returnesult + ", Expected Result :: "+ f);
        nhsSbaPage.scrollDown();
        Hooks.scenario.embed(nhsSbaPage.takeScreenshot(), "image/png");
        Assert.assertEquals(f, returnesult);
    }

}