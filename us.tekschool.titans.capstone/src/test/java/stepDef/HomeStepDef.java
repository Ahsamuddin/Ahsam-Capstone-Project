package stepDef;



import Core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopsPageObject;
import page.objects.HomePage;
import utilities.WebDriverUtility;


public class HomeStepDef extends Base {
	HomePage homePage = new HomePage();


	@When ("User click on Currency") 
	public void user_click_on_currency(){
		homePage.clickOnCurrencyOption();
    	logger.info("User click on Currency");
    	WebDriverUtility.takeScreenShot();
	}
	@And ("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown(){
		homePage.clickOnEuroCurrency();
		logger.info("User Chose Euro From DropDown");
		
	}
	@Then ("currency value should change to Euro")
	public void currency_value_should_change_to_euro(){
		homePage.euroCurrency();
		logger.info("currency value should change to Euro");
		WebDriverUtility.screenShotName();
		WebDriverUtility.hardWait();
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickedOnShoppingCard();
		logger.info("User click on shopping car");
	   
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		logger.info("Your shopping cart is empty!” message should display");
		WebDriverUtility.screenShotName();
		WebDriverUtility.hardWait();
	  
	}
	
		
}
	
	
