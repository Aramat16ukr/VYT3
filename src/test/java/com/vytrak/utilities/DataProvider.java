package com.vytrak.utilities;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "credentials")
    public static Object[][] credentials() {
        return new Object[][]{
                {ConfigReader.getProperty("username1"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username2"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username3"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username4"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username5"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username6"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username7"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username8"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username9"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username10"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username11"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username12"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username13"), ConfigReader.getProperty("password")},
                {ConfigReader.getProperty("username14"), ConfigReader.getProperty("password")}


        };
    }
}

/*
     How to use data provider with ConfigReader
    @Test(priority = 1, dataProvider = "credentials", dataProviderClass = DataProvider.class)
    public void shouldBeAbleToWriteAndSendMessage(String username, String password) {
    log.sendKeys(username);
    log.sendKeys(password);
    your test is here

    }




 */
