package stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Tarriftask {
	static WebDriver driver;
	static String msg;
	
	@Given("The user should be in addtarrif plan page")
	public void the_user_should_be_in_addtarrif_plan_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\demo\\tarrif\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("The user fill in the form {string},{string},{string},{string},{string},{string},{string} and click submit")
	public void the_user_fill_in_the_form_and_click_submit(String mr, String flm, String fim, String fsms, String lmc, String imc, String smsc) {
		//|Monthly Rent|Free L/Min|Free Intl/Min|Free SMS|Local/min Charges|Intl/min Charges|SMS/Charges|
	    driver.findElement(By.id("rental1")).sendKeys(mr);
	    driver.findElement(By.id("local_minutes")).sendKeys(flm);
	    driver.findElement(By.id("inter_minutes")).sendKeys(fim);
	    driver.findElement(By.id("sms_pack")).sendKeys(fsms);
	    driver.findElement(By.id("minutes_charges")).sendKeys(lmc);
	    driver.findElement(By.id("inter_charges")).sendKeys(imc);
	    driver.findElement(By.id("sms_charges")).sendKeys(smsc);
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    	    
	}

	@Then("The user should see the congrats message")
	public void the_user_should_see_the_congrats_message() {
	   Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).getText(),driver.getPageSource().contains("Congratulation"));
	}



}
