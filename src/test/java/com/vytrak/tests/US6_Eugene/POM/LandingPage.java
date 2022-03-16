package com.vytrak.tests.US6_Eugene.POM;

import com.vytrak.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleetTabDriver;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetTabSales;

    @FindBy(xpath = "//a[@href='entity/Extend_Entity_Carreservation']")
    public WebElement vehicles;

    @FindBy(xpath = "//table//tr/td/div/div")
    public WebElement threeDots;

  //  @FindBy(xpath = "//div/ul/li//ul/li/a[@href='/entity/view/Extend_Entity_Carreservation/item/17']")
    @FindBy(css = "a[title='View']")
    public WebElement viewOptionTab;

  @FindBy(css = "a[title='Edit']")
   // @FindBy(xpath = "//li/ul/li/a[@href='/entity/update/Extend_Entity_Carreservation/item/17']")
    public WebElement editOptionTab;

   @FindBy(css = "a[title='Delete']")
   // @FindBy(xpath = "//div/table/tbody/tr[1]/td[20]/div/div/ul/li/ul/li[3]/a")
    public WebElement deleteOptionTab;

//    @FindBy (xpath = "//table//tr[1]/td[20]/div/div/ul/li/ul")
//    public WebElement listOfViewDriver;
//
//    @FindBy(xpath = "//table//tr[2]/td[21]/div/div/ul/li/ul")
//    public WebElement listOFViewSalesStore;




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
