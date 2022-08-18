package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationClass extends BaseClass {

	@Given("user has to launch the chrome browser and pass the url")
	public void user_has_to_launch_the_chrome_browser_and_pass_the_url() {

		launchBrowser();
		passUrl("https://www.instagram.com/accounts/login/");
		maxBrowser();
	}

	@When("user has to enter the values in username and password field")
	public void user_has_to_enter_the_values_in_username_and_password_field(io.cucumber.datatable.DataTable d) {

		List<Map<String, String>> list = d.asMaps();

		Map<String, String> map = list.get(1);

		String user = map.get("email");

		String pass = map.get("password");

		Pojo p = new Pojo();

		toInput(p.getTxtuser(), user);

		toInput(p.getTxtpass(), pass);
	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {

		Pojo p = new Pojo();

		btnClick(p.getClkbtn());
	}

	@Then("user has to navigate the error page")
	public void user_has_to_navigate_the_error_page() {

		System.out.println("done");

	}
}