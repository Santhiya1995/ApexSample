package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
@FindBy(id="email")
WebElement mail;

@FindBy(id="password")
WebElement pwd;

}
