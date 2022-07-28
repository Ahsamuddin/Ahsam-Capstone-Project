package stepDef;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPageObject;
import utilities.WebDriverUtility;
public class DesktopsStepDef extends Base {
	DesktopsPageObject desktopPage = new DesktopsPageObject();
	
	//Syntax @Tag("exact words of step from scenario")
	// public void nameOfTheMethod(){}


    @When("User click on Desktops tab")
    public void user_click_on_desktops_tab() {
    	WebDriverUtility.hardWait();
    	desktopPage.clickOnDesktopsTab();
    	logger.info("User click on Desktops tab");
    	WebDriverUtility.takeScreenShot();
      
    }
    @And("User click on Show all desktops")
    public void user_click_on_show_all_desktops() {
    	WebDriverUtility.hardWait();
    desktopPage.clickOnShowAllDesktops();
    logger.info("User click on Show all desktops");
    }
    @Then("User should see all items are present in Desktop page")
    public void user_should_see_all_items_are_present_in_desktop_page() {
    	List<WebElement> desktopsElements = desktopPage.desktopsItems();
    	for(WebElement element:desktopsElements){
    		Assert.assertTrue(element.isDisplayed());
    		logger.info(element.getAttribute("title")+ " is present");
    		WebDriverUtility.takeScreenShot();
    		
    	}
     WebDriverUtility.takeScreenShot();
     WebDriverUtility.hardWait();
     /**
      * Step 1- We need to store the element in a list
      * 2- We need to iterate though the list
      * 3- We need to write an assertion to validate each element (index) is present.
      */
    }
    
     @When("User click  ADD TO CART option on HP LP3065item")
     public void user_click_add_to_cart_option_on_hp_lp3065item(){
    	 desktopPage.clickOnHLP3065Item();
    	 logger.info("user clicked add to Cart Option");
    	 	 
     }
     @When("User select quantity {string}")
     public void user_select_quantity(String string){
    	 desktopPage.selecctQantity(string);
    	logger.info("user selected quantity " +string); 
     }
     @When("User click add to Cart button")
     public void user_click_add_to_cart_button(){
    	 desktopPage.clickOnAddToCartButton();
    	 logger.info("user clicked add to cart button");
     }
 	@Then("User should see a message1 {string}")
 	public void user_should_see_a_message1(String expectedmessageValue) throws InterruptedException {

 		Assert.assertTrue(desktopPage.validateSucessMessage());
    	 WebDriverUtility.takeScreenShot();
    	// WebDriverUtility.hardWait();
 
     }
 	@When("User click ADD TO CART option on Conon EOS 5Ditem")
 	public void user_click_add_to_cart_option_on_conon_eos_5ditem() {
 		desktopPage.clickOnCanonEOS5DCamera();
 		logger.info("user click add to cart ootion on conon EOS 5d item");
 	}

 	@When("User select color from dropdown Red")
 	public void user_select_color_from_dropdown_red() {
   desktopPage.selectColor();
   logger.info("user select color from dropdown red");
 	}

 	@Then("User should see a message {string}")
 	public void user_should_see_a_message(String string) {
 		desktopPage.validateSucessMessage();
 	  logger.info("user should see a message" + string);
 	  WebDriverUtility.takeScreenShot();
 	}
    

     @When("User click on Canon EOS 5D item")
     public void user_click_on_canon_eos_5d_item() {
    	 desktopPage.clickOnCanonEOS5DCamera();
       logger.info("user click on conon EOS 5D item");
     }

     @When("User click on write a review link")
     public void user_click_on_write_a_review_link() {
    	 desktopPage.clickOnReviewLink();
    	 logger.info("user click on write a review");
     }

     @When("user fill the review information with below information")
     public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
    	 List<Map<String,String>> reviewInformation=dataTable.asMaps(String.class, String.class);
        desktopPage.enterYourName(reviewInformation.get(0).get("yourname"));
        desktopPage.enterYourReview(reviewInformation.get(0).get("yourReview"));
        desktopPage.selectRating(reviewInformation.get(0).get("Rating"));
        WebDriverUtility.hardWait();
     }

     @When("User click on Continue Button")
     public void user_click_on_continue_button() {
    	 desktopPage.clickOnContenueButton();
    logger.info("user click on continue botton");
     }

     @Then("User should see a message with {string}")
     public void user_should_see_a_message_with(String string) {
    	 System.out.println(desktopPage.reviewText()+ " from print");
       
     }}












	

