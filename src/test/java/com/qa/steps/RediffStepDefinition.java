package com.qa.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RediffStepDefinition {

	WebDriver driver;
	 
	 @Given("I am on RediffPage")
	 public void I_am_on_RediffPage()
	 {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://mypage.rediff.com/login/dologin");
	 }
	 
	 @When("I enter EmailID {string} & Password {string}")
	 public void i_enter_EmailID_sonal04_gmail_com_Password_abc(String id, String pwd) {
	  
	  driver.findElement(By.id("txtlogin")).sendKeys(id);
	  driver.findElement(By.id("pass_box")).sendKeys(pwd);
	 
	     
	 }


	 @When("click on Login")
	 public void click_on_Login() throws InterruptedException {
	   
	  driver.findElement(By.xpath("//*[@id=\"pass_div\"]/input[3]")).click();
	  Thread.sleep(2000);
	  driver.close();
	 }

}
