package com.utilitiesf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclassf.BaseClassf;

public class Commonutilityf extends BaseClassf {
    public static WebElement getExplicitwait(WebElement elem, long time) {
        WebDriverWait wait=new WebDriverWait(driver,time);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elem));
        return element;
    }
    

}
