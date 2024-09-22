package Test;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Baseclass;
import pages.Pom;

public class Stepdefination {

	Pom pm =new Pom(Baseclass.getdriver());
	WebDriver driver ;
	static String CustomeID;

	@Given("user should be at home page")
	public void user_should_be_at_home_page() {

		driver = Baseclass.getdriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
	}

	@When("user click on add_customer")
	public void user_click_on_add_customer() throws InterruptedException {

		pm.clickaddcustomer();

	}

	@When("user enter first_name {string}")
	public void user_enter_first_name(String FirstName) throws InterruptedException {

		pm.enterfirstname(FirstName);

	}

	@When("user enter last_name {string}")
	public void user_enter_last_name(String LastName) {

		pm.enterLastname(LastName);

	}

	@When("user enter mail {string}")
	public void user_enter_email(String email) throws InterruptedException {

		pm.enteremail(email);

	}

	@When("user enter  address {string}")
	public void user_enter_address(String Address) throws InterruptedException {

		pm.enterAddress(Address);

	}

	@When("user enter mobile_number {string}")
	public void user_enter_mobile_number(String Mobileno) {

		pm.entermob(Mobileno);
	}

	@When("user enter click on submit button")
	public void user_enter_click_on_submit_button() {

		pm.clicksubmit();

	}

	@Then("should get display customer_ID")
	public void should_get_display_customer_id() {

		CustomeID = pm.foundId();
		System.out.println(CustomeID);
		// ArrayList<String> ar2=new ArrayList<String>();


	}
	@Then("user click on home tab")
	public void user_click_on_home_tab() throws InterruptedException {
		pm.clickhomepage();

	}

	@When("user click on Add_Tariff_Plan")
	public void user_click_on_add_tariff_plan() throws InterruptedException {

		pm.clickTarifplan();

	}

	@When("user enter Monthly_Rental {string}")
	public void user_enter_monthly_rental(String MonthlyRental) {
		pm.entermonthly_rental(MonthlyRental);
	}
	@When("user enter Free_Local_Minutes {string}")
	public void user_enter_free_local_minutes(String freelocalminutes) {

		pm.enter_freeLocalMinut(freelocalminutes);
	}

	@When("user enter Free_International_Minutes {string}")
	public void user_enter_free_international_minutes(String InternationalMinutes) {

		pm.enter_freeinternationalMinut(InternationalMinutes);
	}

	@When("user enter Free_sms_pack {string}")
	public void user_enter_free_sms_pack(String Freesmspack) {
		pm.enter_free_smsPack(Freesmspack);
	}

	@When("user enter Local_Per_Minutes_Charges {string}")
	public void user_enter_local_per_minutes_charges(String localperminutescharges) {

		pm.enter_Localperminutcharges(localperminutescharges);
	}

	@When("user enter International_Per_Minutes_Charges {string}")
	public void user_enter_international_per_minutes_charges(String International_Per_Minutes_Charges) {

		pm.enter_internationalperMinutcharge(International_Per_Minutes_Charges);
	}

	@When("user enter SMS_Per_Charges {string}")
	public void user_enter_sms_per_charges(String SMSPerCharges) {
		pm.enter_smsperCharges(SMSPerCharges);
	}

	@When("user click on submit btn")
	public void user_click_on_submit_btn() {
		pm.clickontarifsubmit();
	}

	@Then("user should see {string}")
	public void user_should_see(String string) {
		boolean title = pm.verifycongtitle();

	}
	@When("user click on clickHomebtn")
	public void user_click_on_clickHomebtn() {

		pm.clickhomebtnAddtarifPlan();

	}

	@When("user click on Add Tariff Plan to CustomerAdd Tariff Plan to Customer")
	public void user_click_on_add_tariff_plan_to_customer_add_tariff_plan_to_customer() {

		pm.clickAddtarifplantoCustomer();
	}

	@When("user enter customer_id")
	public void user_enter_customer_id() throws InterruptedException {




		pm.putID(Stepdefination.CustomeID); 

	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {

		pm.clicksubmitbtn();
	}

	@When("user add Tariff Plan to customer")
	public void user_add_tariff_plan_to_customer() {
		pm.clickontarifbtn();

	}

	@Then("should get display Congratulation Tariff Plan assigned")
	public void should_get_display_congratulation_tariff_plan_assigned() {
		boolean displays = pm.DisplayCong();
		Assert.assertTrue(displays);
	}
	@When("user click on Pay Billing")
	public void user_click_on_pay_billing() throws InterruptedException {

		pm.clickonPay();
	}
	@When("user enter payBilling Customer id")
	public void user_payBilling_enter_customer_id() {

		pm.enterpayID(Stepdefination.CustomeID);
	}
	@When("user click on submit")
	public void user_click_on_submit() {
		pm.clickonsubmitpay();
	}

	@Then("should get display Pay Billing")
	public boolean should_get_display_pay_billing() {

		boolean displayPay = pm.DisplaypayBilling();
		return displayPay;
	}


}
