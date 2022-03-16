package com.vytrak.tests.US3_Tamara.POM;


import com.vytrak.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {
    @BeforeMethod
    public void setUp(){
     //   Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

        System.out.println("Test is started");

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
