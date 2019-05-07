package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Usinglist {
public static WebDriver driver;	

@Given("The user should launch addtarrif plan page url")
public void the_user_should_launch_addtarrif_plan_page_url() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\demo\\tarrif\\src\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
}

@When("The user fill in the form and click submit")
public void the_user_fill_in_the_form_and_click_submit(io.cucumber.datatable.DataTable cst) {
   List<String> clist=cst.asList(String.class);
   driver.findElement(By.id("rental1")).sendKeys(clist.get(0));
   driver.findElement(By.id("local_minutes")).sendKeys(clist.get(1));
   driver.findElement(By.id("inter_minutes")).sendKeys(clist.get(2));
   driver.findElement(By.id("sms_pack")).sendKeys(clist.get(3));
   driver.findElement(By.id("minutes_charges")).sendKeys(clist.get(4));
   driver.findElement(By.id("inter_charges")).sendKeys(clist.get(5));
   driver.findElement(By.id("sms_charges")).sendKeys(clist.get(6));
   driver.findElement(By.xpath("//input[@name='submit']")).click();
}

@Then("The user should see the congratulation message")
public void the_user_should_see_the_congratulation_message() {
	   Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).getText(),driver.getPageSource().contains("Congratulation"));
}

}
