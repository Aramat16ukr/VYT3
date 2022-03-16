package com.vytrak.tests.US6_Eugene;

import com.vytrak.tests.US6_Eugene.POM.LandingPage;
import com.vytrak.tests.US6_Eugene.POM.LoginPage;
import com.vytrak.utilities.BrowserUtilities;
import com.vytrak.utilities.Driver;


import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class VYT_6_Test {

    @Test
    public void car_edited_options_driver(){

        LandingPage landingPage = new LandingPage(Driver.getDriver());
        LoginPage.loginAsTruckDriver();
        BrowserUtilities.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(landingPage.fleetTabDriver).perform();
        landingPage.vehicles.click();
        BrowserUtilities.sleep(2);
        actions.moveToElement(landingPage.threeDots).doubleClick().perform();

        landingPage.viewOptionTab.isDisplayed();

        actions.moveToElement(landingPage.threeDots).perform();

        landingPage.editOptionTab.isDisplayed();

       actions.moveToElement(landingPage.threeDots).perform();

       landingPage.deleteOptionTab.isDisplayed();

       Driver.closeDriver();


    }

    @Test
    public void car_edited_options_sales(){

        LandingPage landingPage = new LandingPage(Driver.getDriver());
        LoginPage.loginAsStoreManager();
        BrowserUtilities.sleep(2);
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(landingPage.fleetTabSales).perform();
        landingPage.vehicles.click();
        BrowserUtilities.sleep(2);
        actions.moveToElement(landingPage.threeDots).doubleClick().perform();

        landingPage.viewOptionTab.isDisplayed();

        actions.moveToElement(landingPage.threeDots).perform();

        landingPage.editOptionTab.isDisplayed();

        actions.moveToElement(landingPage.threeDots).perform();

        landingPage.deleteOptionTab.isDisplayed();

        Driver.closeDriver();

    }

    @Test
    public void car_edited_options_store(){

        LandingPage landingPage = new LandingPage(Driver.getDriver());
        LoginPage.loginAsSalesManager();
        BrowserUtilities.sleep(2);
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(landingPage.fleetTabSales).perform();
        landingPage.vehicles.click();
        BrowserUtilities.sleep(2);
        actions.moveToElement(landingPage.threeDots).doubleClick().perform();

        landingPage.viewOptionTab.isDisplayed();

        actions.moveToElement(landingPage.threeDots).perform();

        landingPage.editOptionTab.isDisplayed();

        actions.moveToElement(landingPage.threeDots).perform();

        landingPage.deleteOptionTab.isDisplayed();

        Driver.closeDriver();

    }
}
