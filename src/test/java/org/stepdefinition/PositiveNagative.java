package org.stepdefinition;
import io.cucumber.datatable.*;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveNagative extends BaseClass{
	
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch url of bisto bite")
	public void to_launch_url_of_bisto_bite() {
		launchUrl("https://bistrobitesdc.com/");
	    
	}

	@When("To click ourstory option")
	public void to_click_ourstory_option() {
		WebElement o = driver.findElement(By.id("menu-item-3557"));
		o.click();
	   
	}

	@Then("To close browser")
	public void to_close_browser() {
		closeENtireBrowser();
	    
	}


	    
	


}
