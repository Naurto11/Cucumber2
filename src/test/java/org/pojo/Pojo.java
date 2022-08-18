package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {

	public Pojo() {

		PageFactory.initElements(driver, this);
	}

	@FindAll({

			@FindBy(name = "username"),
			@FindBy(xpath = "//input[@type='text']"),
			@FindBy(xpath="//input[@aria-label='Phone number, username, or email']")
			
	}

	)
	private WebElement txtuser;
	
	@FindAll({
		
		
		@FindBy(name="password"),
		@FindBy(xpath="(//input[@autocorrect='off'])[2]"),
		@FindBy(xpath="//span[text()='Password']")
	})

	private  WebElement txtpass;
	
	@FindAll({
		
		@FindBy(xpath="//button[@type='submit']"),
		@FindBy(xpath="//button[@class='sqdOP  L3NKy   y3zKF     ']"),
		@FindBy(xpath=" //div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ']")
	})
	
	private WebElement clkbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClkbtn() {
		return clkbtn;
	}
}
