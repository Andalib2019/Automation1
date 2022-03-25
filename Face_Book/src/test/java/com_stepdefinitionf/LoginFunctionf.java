package com_stepdefinitionf;


import org.openqa.selenium.support.PageFactory;

import com.baseclassf.BaseClassf;
import com.pagefactoryf.PageFactoryElementsf;
import com.utilitiesf.Commonutilityf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionf extends BaseClassf {
    
    PageFactoryElementsf pf;
    @Given("User can open any browser")
    public void user_can_open_any_browser() {
        
        pf=PageFactory.initElements(driver, PageFactoryElementsf.class);
    }
    
    @Given("User can able to enter {string} url")
    public void user_can_able_to_enter_url(String url) {
        driver.get(url);
    }
    @When("User enters email {string}")
    public void user_enters_email(String email) {
        Commonutilityf.getExplicitwait(pf.getEmail(), 12);
        pf.getEmail().sendKeys(email);
    }
    @When("User enters password {string}")
    public void user_enters_password(String password) {
        Commonutilityf.getExplicitwait(pf.getPassword(), 5);
        pf.getPassword().sendKeys(password);
    }
   /* @When("User clicks on Log in  button ")
    public void user_clicks_on_log_in_button() {
        
        
        pf.getLogin().click();
        
    }*/
    @When("User clicks on Log in button")
    public void user_clicks_on_log_in_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    
    
    @Then("User can able to successifully verify  login and page title")
    public void user_can_able_to_successifully_verify_login_and_page_title() {
        System.out.println("The title of the website is : "+driver.getTitle());
    }

            
    
    

}
