package com.vytrak.utilities;



import org.openqa.selenium.By;

public class VyTrackUtilities {


    public static void loginWithInvalidData(String username, String password) {
        //go to website
        Driver.getDriver().get(ConfigReader.getProperty("env2"));
        //pass username
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(ConfigReader.getProperty(username));
        //pass password
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfigReader.getProperty(password));
        //click login
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();
    }

    public static void loginAsTruckDriver() {
        //go to website
        Driver.getDriver().get(ConfigReader.getProperty("env2"));
        //pass username
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(ConfigReader.getProperty("username2"));
        //pass password
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfigReader.getProperty("password"));
        //click login
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

    }

    public static void loginAsStoreManager() {
        //go to website
        Driver.getDriver().get(ConfigReader.getProperty("env2"));
        //pass username
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(ConfigReader.getProperty("username9"));
        //pass password
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfigReader.getProperty("password"));
        //click login
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

    }

    public static void loginAsSalesManager() {
        //go to website
        Driver.getDriver().get(ConfigReader.getProperty("env2"));
        //pass username
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(ConfigReader.getProperty("username13"));
        //pass password
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(ConfigReader.getProperty("password"));
        //click login
        Driver.getDriver().findElement(By.xpath("//button[@id='_submit']")).click();

    }



}
