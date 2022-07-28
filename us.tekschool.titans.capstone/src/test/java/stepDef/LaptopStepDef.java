package stepDef;

import Core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.objects.DesktopsPageObject;
import page.objects.LaptopsPageObject;
import utilities.WebDriverUtility;

public class LaptopStepDef extends Base {
	LaptopsPageObject laptopPage = new LaptopsPageObject();
	
	@Given("User is on Retail website {string}")
	public void user_is_on_retail_website(String string) {
		laptopPage.clickeOnTestEnvironment();
		logger.info("user clicked on Retail website");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab(){
	   laptopPage.clickOnLaptopAndNotebookOption();
		logger.info("user click on laptop and notebook tab");
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option()  {
		laptopPage.clickOnShowAllLaptopAndNotebooks();
		logger.info("user click on show all laptop and notebook option");
	}

	@And("User click on MacBook item")
	public void user_click_on_macbook_item(){
		laptopPage.clickOnMacBookPro();
		logger.info("user click on macbook item");
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		laptopPage.successMessageForMacBook();
		logger.info("user should see a message success you have added macbook to your shopping cart");
		WebDriverUtility.takeScreenShot();
	}
	 @Then("User should see {int} tem\\(s){double} showed to the cart")
	 public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		laptopPage.userShouldSeeOneItemInTheCart();
		logger.info("user should see 1 item showed to the cart");
		WebDriverUtility.takeScreenShot();
	}
	@And("User click on cart option")
	public void user_click_on_cart_option(){
		laptopPage.userClickedOnCartOption();
		logger.info("user click on cart option");
	}
	 @And("user click on red X button to remove the item from cart")
	 public void user_click_on_red_x_button_to_remove_item_from_cart(){
		 laptopPage.userClickOnRedXToRemoveItem();
		 logger.info("user click on red x button to remove the item from cart");
		 
	 }
	 @Then("item should be removed and cart should show {int} item\\(s)")
	 public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		 laptopPage.itemShouldBeRemovedAndCartShouldShowZeroItem();
		 logger.info("item should be removed and cart should show 0 itmes");
		 WebDriverUtility.takeScreenShot();
	 }
	 
		@When("User click on product comparison icon on ‘MacBook’")
		public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		laptopPage.userClickOnMacBookComperisonButton();
		logger.info("user click on product comperison icon on macbook");
		Thread.sleep(2000);
	}
	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_on_macbook_Air() throws InterruptedException{
		laptopPage.userClickOnMacBookAirCompersionButton();
		logger.info("user click on product comperison icon on macbook");
		Thread.sleep(2000);
	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_macbook_air_to_your_product_comparison(){
		laptopPage.userShouldSeeSuccessMessageOnComparisonProducts();
		logger.info("user should see a message success you have added macbook air to your product comperison");
		WebDriverUtility.takeScreenShot();
	}
	//@When("User click on product comparison icon on ‘MacBook Air")
	//public void user_click_on_product_comparison_icon_on_mac_book_air(){

	//	laptopPage.userClickOnProductCompareLink();
	//	logger.info("user click on product comparison link");
		
	//}
	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopPage.clickOnproductComprison();
		logger.info("user can click on product comparison");
		Thread.sleep(2000);
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comperison_chart(){
		laptopPage.userShouldSeeProductComperisonChart();
		logger.info("user should see product comparison chart");
		
	}
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_vaio_laptop_to_wish_list(){
		laptopPage.userClickOnSonyVaioWishButton();
		logger.info("user click on heart icon to add sony vaio laptop to wish list");
	}
	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_void_to_your_wish_list(){
		laptopPage.userShouldloginOrRegisterAddSonyVaioToWishList();
		logger.info("user should get a message you must login or create on account to save sony vaio to your wish list");
		WebDriverUtility.takeScreenShot();
	}
	 @And("User click on ‘MacBook Pro’ item")
	 public void user_click_on_macbook_pro_item(){
		laptopPage.userClickOnMacBookProItem();
		logger.info("user click on macbook pro item");
	 }
	 @Then("User should see ‘${double}’ price tag is present on UI")
	 public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		 laptopPage.userShouldSeeMacBookProPriceTag();
		 logger.info("user should see ‘${double}’ price tag is present on UI ");
		 WebDriverUtility.takeScreenShot();
	 }
}



