package com.nhsbsa.pages;

import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class NhsSbaPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private String country;

   //*******************************************

    @FindBy(id = "next-button")
    private WebElement nextButton;

    @FindBy(xpath = "//input[@value=\"Start now\"]")
    private WebElement stratNowButton;

    @FindBy(id = "radio-wales")
    private WebElement countryWales;

    @FindBy(id = "radio-england")
    private WebElement countryEngland;

    @FindBy(id = "radio-scotland")
    private WebElement countryScotland;

    @FindBy(id = "radio-nire")
    private WebElement countryNIreland;

    @FindBy(id = "radio-yes")
    private WebElement radioYes;

    @FindBy(id = "radio-no")
    private WebElement radioNo;

    @FindBy(name = "dentalPracticeCountry")
    private WebElement notRegisteredDentalPractice;

    @FindBy(id = "dob-day")
    private WebElement dobDay;

    @FindBy(id = "dob-month")
    private WebElement dobMonth;

    @FindBy(id = "dob-year")
    private WebElement dobYear;

    @FindBy(id = "yes-universal")
    private WebElement universal_credit_yes_radioBtn;

    @FindBy(id = "not-yet   ")
    private WebElement universal_credit_notYet_radioBtn;

    @FindBy(id = "different-benefit")
    private WebElement universal_credit_different_Benefit_radioBtn;

    @FindBy(xpath = "//*//h2[@class='heading-large']")  // /text()
    private WebElement nhsbsa_eligibility_checker_result;

    @FindBy(id = "nhsuk-cookie-banner__link_accept")
    private WebElement cookie_banner_reject;
    private Scenario scenario;


    public NhsSbaPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url){
        driver.get(url);
        //Assert page title
        Assert.assertEquals("Check what help you could get to pay for NHS costs - NHSBSA", driver.getTitle());
    }

    public void startEligibilityCheckProcess()
    {
        Assert.assertEquals("Check what help you could get to pay for NHS costs - NHSBSA", driver.getTitle());
        wait.until(ExpectedConditions.visibilityOf(this.stratNowButton));
        stratNowButton.click();
    }

    public void selectLivingCountry(String countryValue)
    {
        country = countryValue.trim().toLowerCase();
        if(countryValue.equalsIgnoreCase("wales"))
        {
            countryWales.click();
        }
        else if(countryValue.equalsIgnoreCase("england"))
        {
            countryEngland.click();
        }
        else if(countryValue.equalsIgnoreCase("scotland"))
        {
            countryScotland.click();
        }
        else if(countryValue.equalsIgnoreCase("northern ireland"))
        {
            countryNIreland.click();
        }
        else
        {
            System.out.println("Invalid country value");
        }
        nextButton.click();
    }

    public void selectGPRegistered(String registered)
    {
        if(registered.trim().equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(registered.trim().equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid registered value");
        }
        nextButton.click();
    }

    public void countryDentalRegistered(String countryValue)
    {
        country = countryValue;
        if(countryValue.equalsIgnoreCase("Wales"))
        {
            countryWales.click();
        }
        else if(countryValue.equalsIgnoreCase("England"))
        {
            countryEngland.click();
        }
        else if(countryValue.equalsIgnoreCase("Scotland"))
        {
            countryScotland.click();
        }
        else if(countryValue.equalsIgnoreCase("Northern Ireland"))
        {
            countryNIreland.click();
        }
        else if(countryValue.equalsIgnoreCase("Not Registered")){
            notRegisteredDentalPractice.click();
        }
        else
        {
            System.out.println("Invalid country value");
        }
        nextButton.click();
    }

    public void selectDateOfBirth(String DOB)
    {
        String[] dob = DOB.split("-");
        dobDay.sendKeys(dob[0]);
        dobMonth.sendKeys(dob[1]);
        dobYear.sendKeys(dob[2]);
        nextButton.click();
    }


    public void selectLivingWithPartner(String livingwithpartner)
    {
        if(livingwithpartner.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(livingwithpartner.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid livingwithpartner value");
        }
        nextButton.click();
    }

    // Do you or your partner claim any benefits or tax credits?
    public void selectClaimBenefits(String claimbenefits)
    {
        if(claimbenefits.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(claimbenefits.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid claimbenefits value");
        }
        nextButton.click();
    }

    // Do you or your partner get paid Universal Credit?
    public void selectUniversalCredit(String universalcredit)
    {
        if(universalcredit.equalsIgnoreCase("Yes Universal"))
        {
            universal_credit_yes_radioBtn.click();
        }
        else if(universalcredit.equalsIgnoreCase("Not Yet"))
        {
            universal_credit_notYet_radioBtn.click();
        }
        else if(universalcredit.equalsIgnoreCase("Different Benefit"))
        {
            universal_credit_different_Benefit_radioBtn.click();
        }
        else
        {
            System.out.println("Invalid universalcredit value");
        }
        nextButton.click();
    }


    // As part of your joint Universal Credit, do you have any of these?
    public void jointUniversalResponsibility(String jointuniversalresponsibility)
    {
        if(jointuniversalresponsibility.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(jointuniversalresponsibility.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid jointuniversalresponsibility value");
        }
        nextButton.click();
    }

    // Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?
    public void selectCombinedTakeHomePay(String combinedtakehomepay)
    {
        if(combinedtakehomepay.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(combinedtakehomepay.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid combinedtakehomepay value");
        }
        nextButton.click();
    }

    // Verify the result
    public boolean verifyResult(String result)
    {
        String final_result = nhsbsa_eligibility_checker_result.getText().trim();
        System.out.println("final_result = " + final_result);
        if (final_result.contains(result))
        {return true;}
        else
        {return false;        }
    }

  /*  public void universalcreditbenefits(String universalcreditbenefits)
    {
        if(universalcreditbenefits.equalsIgnoreCase("Child Tax Credit"))
        {
            child_tax_credit_radioBtn.click();
        }
        else if(universalcreditbenefits.equalsIgnoreCase("Working Tax Credit"))
        {
            working_tax_credit_radioBtn.click();
        }
        else if(universalcreditbenefits.equalsIgnoreCase("Income Support"))
        {
            income_support_radioBtn.click();
        }
        else if(universalcreditbenefits.equalsIgnoreCase("Income-based Jobseeker's Allowance"))
        {
            income_based_jobseekers_allowance_radioBtn.click();
        }
        else if(universalcreditbenefits.equalsIgnoreCase("Income-related Employment and Support Allowance"))
        {
            income_related_employment_support_allowance_radioBtn.click();
        }
        else if(universalcreditbenefits.equalsIgnoreCase("Pension Credit"))
        {
            pension_credit_radioBtn.click();
        }
        else if(universalcreditbenefits.equalsIgnoreCase("Universal Credit"))
        {
            universal_credit_radioBtn.click();
        }
        else
        {
            System.out.println("Invalid universalcreditbenefits value");
        }
        nextButton.click();
    }*/


    public void selectRegisteredDentalPractice(String registeredDentalPractice)
    {
        if(registeredDentalPractice.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(registeredDentalPractice.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid country value");
        }
        nextButton.click();
    }


public void areYouPregnant(String areyoupregnant)
    {
        if(areyoupregnant.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(areyoupregnant.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid areyoupregnant value");
        }
        nextButton.click();
    }

    public void selectSmoker(String smoker)
    {
        if(smoker.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(smoker.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid smoker value");
        }
        nextButton.click();
    }



    public void selectPregnantPartner(String pregnantpartner) {
        if (pregnantpartner.equalsIgnoreCase("Yes")) {
            radioYes.click();
        } else if (pregnantpartner.equalsIgnoreCase("No")) {
            radioNo.click();
        } else {
            System.out.println("Invalid pregnantpartner value");
        }
        nextButton.click();
    }

    public void servingInjury(String seringinjury)
    {
        if(seringinjury.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(seringinjury.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid seringinjury value");
        }
        nextButton.click();
    }

    public void isDiabetic(String isDiabetic)
    {
        if(isDiabetic.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(isDiabetic.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid isDiabetic value");
        }
        nextButton.click();
    }

    public void isGlucoTested(String isGlucoTested)
    {
        if(isGlucoTested.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(isGlucoTested.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid isGlucoTested value");
        }
        nextButton.click();
    }

    public void isCareHome(String isCareHome)
    {
        if(isCareHome.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(isCareHome.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid isCareHome value");
        }
        nextButton.click();
    }

    public void savingInvestment(String savingInvestment)
    {
        if(savingInvestment.equalsIgnoreCase("Yes"))
        {
            radioYes.click();
        }
        else if(savingInvestment.equalsIgnoreCase("No"))
        {
            radioNo.click();
        }
        else
        {
            System.out.println("Invalid savingInvestment value");
        }
        nextButton.click();
    }

    public byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

    }

    //function to take screenshot and embed in scenario
    public void embedScreenshot(Scenario scenario) {
            try {
                this.scenario.embed(takeScreenshot(), "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", nhsbsa_eligibility_checker_result);
/*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/
    }
}