package com.pagefactoryf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclassf.BaseClassf;

public class PageFactoryElementsf extends BaseClassf {
    
    
    public PageFactoryElementsf() {
        PageFactory.initElements(driver,this);
        
        
    }
    
    @FindBy(xpath="//*[@class='inputtext _55r1 _6luy']")
    @CacheLookup
    private WebElement email;

    public WebElement getEmail() {
        return email;
    }
    @FindBy(xpath="//*[@class='inputtext _55r1 _6luy _9npi']")
    @CacheLookup
    private WebElement password;

    public WebElement getPassword() {
        return password;
    }
    @FindBy(xpath="//*[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")
    @CacheLookup
    private WebElement login;

    public WebElement getLogin() {
        return login;
    }

}
