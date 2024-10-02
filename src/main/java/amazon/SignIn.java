package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
    public static void main(String[] args){

        //Initilaize the chrome Browser
        WebDriver driver = new ChromeDriver();

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

        driver.close();

    }
}
