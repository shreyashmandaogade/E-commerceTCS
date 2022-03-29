package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver ldriver;

	public RegisterPage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[text()='Users']")
	WebElement txtfirstName;

	@FindBy(xpath="//button[text()='Add User']")
	WebElement txtLastName;

	@FindBy(id="email")
	WebElement txtemail;

	@FindBy(id="password")
	WebElement txtpaswd;

	@FindBy(id="confpassword")
	WebElement txtconfpaswd;

	@FindBy(id="mobile")
	WebElement txtUserMoble;

	@FindBy(id="user")
	WebElement clkuser;

	@FindBy(id="userAddress")
	WebElement txtUserAddress;

	@FindBy(xpath = "//select")
	WebElement selectcls;

	@FindBy(id="State")
	WebElement txtState;

	@FindBy(id="City")
	WebElement txtCity;

	@FindBy(id="submit")
	WebElement clkSubmit;


	public void custUserName(String cfname) {
		txtfirstName.sendKeys(cfname);
	}

	public void custLastName(String clname) {
		txtLastName.sendKeys(clname);
	}

	public void custEmailId(String cemail) {
		txtemail.sendKeys(cemail);
	}

	public void custMobile(String cmob) {
		txtUserMoble.sendKeys(cmob);
	}

	public void custPassword(String pwd) {
		txtpaswd.sendKeys(pwd);
	}

	public void custConfPassword(String pwd) {
		txtconfpaswd.sendKeys(pwd);
	}

	public void custRole() {
		clkuser.click();
	}

	public void custAddress(String adrs) {
		txtUserAddress.sendKeys(adrs);
	}	

	public void custgender(String gender) {

		Select st = new Select(selectcls);
		st.selectByValue(gender);
	}

	public void custState(String state) {
		txtState.sendKeys(state);
	}

	public void custCity(String city) {
		txtCity.sendKeys(city);
	}

	public void clickSubt() {
		clkSubmit.click();
	}
}

