package com.vytrak.tests.US3_Tamara.POM;

import com.vytrak.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //VYT-3 Pinbar
    //div[@class='pin-bar-empty']/a
    @FindBy(xpath = "//div/a[.='Learn how to use this space']")
    public WebElement learnHowToUse;

    @FindBy(xpath = "//h3[.='How To Use Pinbar']")
    public WebElement actualHeader;

    @FindBy(xpath = "//p[contains(text(),'Use pin icon')]")
    public WebElement actualSubHeaderText;


    public void verifyLearnHowToUse(Driver driver, String expectedText2 ){



    }

    public void verifyHeaderText(Driver driver, String expectedText) {
        System.out.println("Expected text of header is: " + expectedText);
        System.out.println("Actual text of header is: " + actualHeader.getText());
        Assert.assertEquals(actualHeader.getText(), expectedText, "HEADER TEXT DID NOT MATCH OR NOT DISPLAYED!");
        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void verifySubHeaderText(Driver driver, String expectedText) {
        System.out.println("Expected text of header is: " + expectedText);
        System.out.println("Actual text of subheader is: " + actualSubHeaderText.getText());
        //  Assert.assertEquals(actualSubHeaderText.getText(),expectedText,"SUBHEADER TEXT DID NOT MATCH OR NOT DISPLAYED!");
        // Assert.assertTrue(expectedText.contains(actualSubHeaderText.getText()));
        System.out.println("------------------------------------------------------------------------------------------");
    }

    @FindBy(xpath = "(//img)")
    public WebElement imageSourceLearHowTo;


    public static void waitTillLoaderMaskDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




