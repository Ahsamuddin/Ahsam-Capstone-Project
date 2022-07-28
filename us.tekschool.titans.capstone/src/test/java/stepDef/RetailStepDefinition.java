package stepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {

	RetailPageObject retail = new RetailPageObject();

		
		@Given("User is on Retail website")
		public void user_is_on_Retail_website() {
		Assert.assertTrue(retail.isLogoPresent());
		Assert.assertEquals("TEK SCHOOL", retail.getTitle());
		logger.info("user is on Retail Website");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		}
		
		@And("User click  on MyAccount")
		public void user_click_on_MyAccount() {
			retail.clickOnMyAccount();
			logger.info("user clicked on MyAccount option");
			
		}
		@When("User click on Login")
		public void user_click_on_login() {
			retail.clickOnLoginOption();
			logger.info("user clicked on Login Option");
			WebDriverUtility.takeScreenShot();
		}
		@And("User enter username {string} and password {string}")
		public void user_enter_userName_and_password(String userName,String password) {
			retail.enterUserNameAndPassword(userName, password);
			logger.info("user entered " + userName + " and "+ password);
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
		}
		@And("User click on Login button")
		public void user_click_on_login_button() {
			retail.clickOnLoginButton();
			logger.info("user clicked on Login Button");
		}
		@Then("User should be logged in to MyAccount dashboard")
		public void user_should_be_logged_in_to_Myaccount_dashboard() {
			Assert.assertTrue(retail.successfulLogin());
			logger.info("user logged in to myAccount dashboard");
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
			
		}
		
		@When("User click on Register for an Affiliate Account link")
		public void user_click_on_register_for_an_affiliate_account_link() {
			retail.clickOnRegisterForAnAffiliateAccountLink();
			logger.info("user clicked on Register for an Affiliate Account link");
			WebDriverUtility.hardWait();

		}
		@When("User fill affiliate form with below information")
		public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
			List<Map<String,String>> affiliateInformation =dataTable.asMaps(String.class,String.class);
			retail.enterCompanyName(affiliateInformation.get(0).get("company"));
			retail.enterWebSite(affiliateInformation.get(0).get("website"));
			retail.taxIDField(affiliateInformation.get(0).get("taxID"));
			retail.selectpaymentMethod(affiliateInformation.get(0).get("paymentMethod"));
			retail.enterChequePayeeName(affiliateInformation.get(0).get("payeeName"));
			logger.info("user filled affiliate form");
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
		}
		@When("User check on About us check box")
		public void user_check_on_about_us_check_box() {
			retail.clickonAboutUs();
			logger.info("user checked on About us check box");

		}
		@When("User click on Continue button")
		public void user_click_on_continue_button() {
			retail.clickOnContinueButton();
			logger.info("user clicked on Continue button");
		   
		}
		@Then("User should see a success message")
		public void user_should_see_a_success_message() {
		   Assert.assertTrue(retail.isSuccessMessagePresent()); 
		   logger.info("success message is present");
		   WebDriverUtility.takeScreenShot();
		   WebDriverUtility.hardWait();
		}
		@Given("User click on MyAccount")
		public void user_click_on_my_account() {
			retail.clickedOnMyAccountOption();
		 logger.info("user clicked on MyAccount");
		}

		@When("User click on ‘Edit your affiliate informationlink")
		public void user_click_on_edit_your_affiliate_informationlink() {
			retail.clickOnEditAffiliateInformation();
		 logger.info("user clicked on edit your affiliate information");
		}

		@When("user click on Bank Transfer radio button")
		public void user_click_on_bank_transfer_radio_button() {
			retail.clickOnBankTransferRadioButton();
			logger.info("user clicked on Bank Transper radio button");
		  
		}

		@When("User fill Bank information with below information")
		public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
			List<Map<String,String>> bankInformation =dataTable.asMaps(String.class,String.class);
			retail.enterBankName(bankInformation.get(0).get("bankName"));
			retail.enterabaNumber(bankInformation.get(0).get("abaNumber"));
			retail.enterSwiftCode(bankInformation.get(0).get("swiftCode"));
			retail.enterAccountName(bankInformation.get(0).get("accountName"));
			retail.enterAccountNamber(bankInformation.get(0).get("accountNumber"));
			logger.info("user filled Bank informaiton");
			WebDriverUtility.takeScreenShot();
		   
		}

		@When("User click on continue button")
		public void userClickOnContinueButton() {
			retail.clickOnContenueBtn();
			logger.info("user clicked on continue button");
		  
		}

		@Then("User should see a messege ‘Success: Your account has been successfully updated.")
		public void user_should_see_a_messege_success_your_account_has_been_successfully_updated() {
			retail.isSuccessMessagePresent();
			Assert.assertTrue(retail.isSuccessMessagePresent());
			 logger.info("success message is present");
			 WebDriverUtility.takeScreenShot();
		}
		@When("User click on ‘Edit your account information’ link")
		public void user_click_on_edit_your_account_information_link(){
			retail.clickedOnEditYourAccountInformation();
			logger.info("user click on edit your acount information link");
		}
		@When("User modify below information")
		public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
			List<Map<String,String>> modifyInformation =dataTable.asMaps(String.class,String.class);
			retail.userEnterFirstName(modifyInformation.get(0).get("FirstName"));
			retail.userEnterLastName(modifyInformation.get(0).get("LastName"));
			retail.userEnterEmailAddress(modifyInformation.get(0).get("E-Mail"));
			retail.userEnterTelephoneNumber(modifyInformation.get(0).get("Telephone"));
			logger.info("user modified information filled");
			WebDriverUtility.takeScreenShot();
		}
		@And("User click on continue button ")
		public void user_click_on_continue_button1(){
			retail.clickedOnContinueButton();
			logger.info("user click on continue button");
		}
		@Then("User should see a messege ‘Success: Your account has been successfully updated1.")
		public void user_should_see_a_messege_success_your_account_has_been_successfully_updated1() {
			retail.isSuccessMessagePresent();
			logger.info("success update messege is present");
			WebDriverUtility.takeScreenShot();
		}
		
	}


