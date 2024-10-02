package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class AddToCart {
    public static void main(String[] args){

        //Initialize the Browser
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //Maximize the Window for better visibility
        driver.manage().window().maximize();

        //Go to Amazon Website
        driver.get("https://www.amazon.in/");

        //Locate and Click on Sign In Button
        driver.findElement(By.id("nav-link-accountList")).click();

        //Locate and Enter Email/Phone Number
        driver.findElement(By.id("ap_email")).sendKeys("8360167723");

        //Locate and Click on Continue Field
        driver.findElement(By.id("continue")).click();

        //Locate and Enter the Password
        driver.findElement(By.id("ap_password")).sendKeys("*EcBP5iWtPS/@VZ");

        //Locate and Click Continue Button
        driver.findElement(By.id("signInSubmit")).click();

        //Locate the Search bar and Search for a product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dairy Milk Chocolate");

        //Locate and Click on Search button
        driver.findElement(By.id("nav-search-submit-button")).click();

        //Locate and Click on the First Search Result
        driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]")).click();

        //Switch to the newly opened tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));  // Switching to the second tab

        //Locate the Add to Cart button and click
        driver.findElement(By.id("add-to-cart-button")).click();

        //Wait for the Cart Confirmation
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //Locate and Go to cart
        driver.findElement(By.linkText("Go to Cart")).click();

        //Locate and Click on Proceed to Buy
        driver.findElement(By.id("sc-buy-box-ptc-button")).click();

        //Locate and Continue with Already Selected Address
        driver.findElement(By.id("shipToThisAddressButton")).click();

        //Webdriver Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Locate and Click on Use the default Selected Payment Option
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent"))).click();

        //Locate and Click on Place Order
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("placeYourOrder1"))).click();

        //Close the Chrome Window
        driver.quit();






    }
}
