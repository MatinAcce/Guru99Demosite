package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	String CI;
	//Add customer

	@FindBy(xpath = "(//a[contains(text(),'Add Customer')])[1]")  private WebElement AddCustomer;
	@FindBy(id = "dismiss-button")  private WebElement POpup;
	@FindBy(xpath = "(//input[@id='fname'])[1]")  private WebElement Firstname;
	@FindBy(xpath = "(//input[@id='lname'])[1]")   private WebElement Lastname;
	@FindBy(xpath = "(//input[@id='email'])[1]")   private WebElement Email;
	@FindBy(xpath = "(//textarea[@id='message'])[1]")  private WebElement Address;
	@FindBy(xpath = "//input[@id='telephoneno']")  private WebElement Mobilenumber;
	@FindBy(xpath = "//input[@value='Submit']")  private WebElement submit;
	@FindBy(xpath = "//tbody/tr[1]/td[2]")  private WebElement customerId;
	@FindBy(xpath = "//a[@class='button']")  private WebElement Homepagebtn;
	@FindBy(xpath = "//a[normalize-space()='Add Tariff Plan']") private WebElement clickTarfplan;
	@FindBy(xpath = "//input[@id='rental1']")  private WebElement MonthlyRental;
	@FindBy(xpath = "//input[@id='local_minutes']") private WebElement Freelocalminut;
	@FindBy(xpath = "//*[@id=\"inter_minutes\"]") private WebElement FreeinternationalMinut;
	@FindBy(xpath = "//input[@id='sms_pack']") private WebElement FreesmsPack;
	@FindBy(xpath = "//input[@id='minutes_charges']") private WebElement LocalperMinutcharge;
	@FindBy(xpath = "//input[@id='inter_charges']") private WebElement internationalperMinutCharge;
	@FindBy(xpath = "//input[@id='sms_charges']") private WebElement smspercharges;
	@FindBy(xpath = "//input[@name='submit']") private WebElement submitaddtotarif;
	@FindBy(xpath = "//h2[text()='Congratulation you add Tariff Plan']") private WebElement congrateTitle;
	@FindBy(xpath = "//a[@class='button']") private WebElement clickhomebtn;
	@FindBy(xpath = "(//a[text()='Add Tariff Plan to Customer'])[1]") private WebElement AddtarifplantoCustomer;
	@FindBy(xpath = "/html/body/section/div/form/div/div[3]/input") private WebElement addIDintotarifplantoCustomer;
	@FindBy(xpath = "//*[@id=\"main\"]/div/form/div/div[6]/input") private WebElement SubmitbtnonIdPage;
	@FindBy(xpath = "//input[@value='Add Tariff Plan to Customer']") private WebElement clickonaddtarifplancustomer;
	@FindBy(xpath = "//h2[contains(text(),'Congratulation Tariff Plan assigned')]") private WebElement DisplayCongrutulation;
	@FindBy(xpath = "//*[@id=\"one\"]/div/div[3]/div[2]/h3/a")private WebElement clickonPayBill;
	@FindBy(xpath = "//input[@id='customer_id']") private WebElement enterID;
	@FindBy(xpath = "//input[@value='submit']") private WebElement clickonsubmit;
	@FindBy(xpath = "//h1[contains(text(),'Pay Billing')]") private WebElement Displaypay;
	public Pom (WebDriver driver){

		this.driver=driver;
		PageFactory.initElements(driver, this);	

		wait =new WebDriverWait(driver, Duration.ofSeconds(50));
		js = (JavascriptExecutor)driver;

	}

	//Navigate to add_customer
	public void clickaddcustomer() throws InterruptedException {

		AddCustomer.click();
		//wait.until(ExpectedConditions.visibilityOfAllElements(POpup));
		Thread.sleep(2000);

	}

	public void enterfirstname(String firstname) throws InterruptedException {
		driver.navigate().refresh();
		AddCustomer.click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfAllElements(Firstname));
		Firstname.click();
		Firstname.sendKeys(firstname);
	}

	public void enterLastname(String lastname) {
		Lastname.sendKeys(lastname);

	}

	public void enteremail(String email) throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView(true)", Email);
		Thread.sleep(2000);
		Email.sendKeys(email);
	}

	public void enterAddress(String address) throws InterruptedException {
		Thread.sleep(2000);
		Address.click();
		Address.sendKeys(address);
	}

	public void entermob(String mobilenumber ) {

		Mobilenumber.sendKeys(mobilenumber);
	}

	public void clicksubmit() {


		submit.click();

	}

	public String foundId() {

		CI = customerId.getText();

		return CI;


	}
	public void clickhomepage() throws InterruptedException {

		Thread.sleep(3000);
		Homepagebtn.click();
	}



	public void clickTarifplan() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOf(clickTarfplan));
		Thread.sleep(3000);
		clickTarfplan.click();

	}

	public void entermonthly_rental(String monthly_rental) {
		wait.until(ExpectedConditions.visibilityOf(MonthlyRental));
		MonthlyRental.sendKeys(monthly_rental);
	}
	public void enter_freeLocalMinut(String freeLocalMinut ) {

		Freelocalminut.sendKeys(freeLocalMinut);

	}

	public void enter_freeinternationalMinut(String freeinternationalMinut ) {

		wait.until(ExpectedConditions.visibilityOf(FreeinternationalMinut));
		FreeinternationalMinut.sendKeys(freeinternationalMinut);

	}

	public void enter_free_smsPack(String freesmsPack) {

		FreesmsPack.sendKeys(freesmsPack);

	}

	public void enter_Localperminutcharges(String Localperminutcharges) {

		LocalperMinutcharge.sendKeys(Localperminutcharges);
	}

	public void enter_internationalperMinutcharge(String internationalperMinutcharge) {
		internationalperMinutCharge.sendKeys(internationalperMinutcharge);

	}

	public  void enter_smsperCharges(String smsperCharges) {
		smspercharges.sendKeys(smsperCharges);

	}
	public void clickontarifsubmit() {
		submitaddtotarif.click();
	}
	public boolean verifycongtitle() {
		wait.until(ExpectedConditions.visibilityOf(congrateTitle));
		boolean title = congrateTitle.isDisplayed();
		return title;
	}

	public void clickhomebtnAddtarifPlan() {

		clickhomebtn.click();
	}
	public void clickAddtarifplantoCustomer() {
		wait.until(ExpectedConditions.visibilityOf(AddtarifplantoCustomer));
		AddtarifplantoCustomer.click();
	}

	public void putID(String id) throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(addIDintotarifplantoCustomer));
		addIDintotarifplantoCustomer.click();
		addIDintotarifplantoCustomer.sendKeys(id);
		//System.out.println();

	}


	public void clicksubmitbtn() {

		SubmitbtnonIdPage.click();

	}

	public void clickontarifbtn() {
		wait.until(ExpectedConditions.visibilityOf(clickonaddtarifplancustomer));
		clickonaddtarifplancustomer.click();

	}

	public boolean DisplayCong() {
		wait.until(ExpectedConditions.visibilityOf(DisplayCongrutulation));
		boolean displaycong = DisplayCongrutulation.isDisplayed();

		return displaycong;
	}

	public void clickonPay() throws InterruptedException {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(clickonPayBill));
		clickonPayBill.click();

	}
	public void enterpayID(String enteriD) {

		enterID.sendKeys(enteriD);;
	}
	public void clickonsubmitpay() {
		clickonsubmit.click();

	}
	public boolean DisplaypayBilling() {

		boolean payDisplay = Displaypay.isDisplayed();

		return payDisplay;
	}
}