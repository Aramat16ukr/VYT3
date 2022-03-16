package com.vytrak.tests.US3_Tamara;


import com.vytrak.tests.US3_Tamara.POM.LandingPage;
import com.vytrak.utilities.BrowserUtilities;
import com.vytrak.utilities.Driver;
import com.vytrak.utilities.VyTrackUtilities;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VYT_3_Test {


    @Test
    public void learnHowTo() {
        VyTrackUtilities.loginAsTruckDriver();

        BrowserUtilities.sleep(2);
        LandingPage landingPage = new LandingPage(Driver.getDriver());

        String expectedNamePinBar = "Learn how to use this space";
        String actualLearnHowTo = landingPage.learnHowToUse.getText();

        Assert.assertEquals(actualLearnHowTo,expectedNamePinBar);
        System.out.println(actualLearnHowTo + " : "+ expectedNamePinBar);

        landingPage.learnHowToUse.click();


        String expectedHeader = "How To Use Pinbar";
        String actualHeader = landingPage.actualHeader.getText();

        Assert.assertEquals(actualHeader,expectedHeader);
        System.out.println(actualHeader +" : "+ expectedHeader);



        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actualText = landingPage.actualSubHeaderText.getText();

        Assert.assertEquals(actualText,expectedText);
        System.out.println(actualText+ " : "+ expectedText);


        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";

       boolean actualImage = landingPage.imageSourceLearHowTo.isDisplayed();

        Assert.assertTrue(actualImage,expectedImageSource);
        System.out.println(actualImage+ " : "+expectedImageSource);




Driver.closeDriver();

    }


    @Test
    public void learnHowTo2() {

        VyTrackUtilities.loginAsSalesManager();

        BrowserUtilities.sleep(2);
        LandingPage landingPage = new LandingPage(Driver.getDriver());

        String expectedNamePinBar = "Learn how to use this space";
        String actualLearnHowTo = landingPage.learnHowToUse.getText();

        Assert.assertEquals(actualLearnHowTo,expectedNamePinBar);
        System.out.println(actualLearnHowTo + " : "+ expectedNamePinBar);

        landingPage.learnHowToUse.click();


        String expectedHeader = "How To Use Pinbar";
        String actualHeader = landingPage.actualHeader.getText();

        Assert.assertEquals(actualHeader,expectedHeader);
        System.out.println(actualHeader +" : "+ expectedHeader);



        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actualText = landingPage.actualSubHeaderText.getText();

        Assert.assertEquals(actualText,expectedText);
        System.out.println(actualText+ " : "+ expectedText);


        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";

        boolean actualImage = landingPage.imageSourceLearHowTo.isDisplayed();

        Assert.assertTrue(actualImage,expectedImageSource);
        System.out.println(actualImage+ " : "+expectedImageSource);



        Driver.closeDriver();

    }
    @Test
    public void learnHowTo3() {
        VyTrackUtilities.loginAsStoreManager();

        BrowserUtilities.sleep(2);
        LandingPage landingPage = new LandingPage(Driver.getDriver());

        String expectedNamePinBar = "Learn how to use this space";
        String actualLearnHowTo = landingPage.learnHowToUse.getText();

        Assert.assertEquals(actualLearnHowTo,expectedNamePinBar);
        System.out.println(actualLearnHowTo + " : "+ expectedNamePinBar);

        landingPage.learnHowToUse.click();


        String expectedHeader = "How To Use Pinbar";
        String actualHeader = landingPage.actualHeader.getText();

        Assert.assertEquals(actualHeader,expectedHeader);
        System.out.println(actualHeader +" : "+ expectedHeader);



        String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        String actualText = landingPage.actualSubHeaderText.getText();

        Assert.assertEquals(actualText,expectedText);
        System.out.println(actualText+ " : "+ expectedText);

        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";

        boolean actualImage = landingPage.imageSourceLearHowTo.isDisplayed();

        Assert.assertTrue(actualImage,expectedImageSource);
        System.out.println(actualImage+ " : "+expectedImageSource);



        Driver.closeDriver();

    }
}



//        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";