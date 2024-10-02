package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
    public static void main(String[] args) {

        //Invoke Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Maximize the Window for better visibility
        driver.manage().window().maximize();

        //Go to Amazon Website
        driver.get("https://www.amazon.in/");

        //Locate and Click on Sign In Button
        driver.findElement(By.id("nav-link-accountList")).click();

        //Locate and Click on Create Amazon account button
        driver.findElement(By.id("createAccountSubmit")).click();

        //Locate and Fill Your name field
        driver.findElement(By.id("ap_customer_name")).sendKeys("Simran Simran");

        //Locate and Fill Mobile Number field
        driver.findElement(By.id("ap_phone_number")).sendKeys("8360167723");

        //Locate and Fill Password Field
        driver.findElement(By.id("ap_password")).sendKeys("abcdef");

        //Locate and Click on the Verify Mobile Number Field
        driver.findElement(By.id("continue")).click();

        driver.close();
    }
}
