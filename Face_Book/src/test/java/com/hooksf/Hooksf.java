package com.hooksf;

import com.baseclassf.BaseClassf;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooksf extends BaseClassf {
    @Before
    public void initialization() {
       // setUp();//for cross browser need comment out
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    

}
