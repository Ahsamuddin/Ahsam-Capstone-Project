package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class LaptopsPageObject extends Base {
	public LaptopsPageObject(){
		PageFactory.initElements(driver,this);
		
	}	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement clickeOnTestEnvironment;
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
		private WebElement laptopAndNotebookOption;
		
	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
		private WebElement showAllLaptopAndNotebooks;

		@FindBy(xpath ="//a[text()='MacBook Pro']")
		private WebElement macBookPro;
		
		@FindBy(xpath ="//button[@id='button-cart']")
		private WebElement addToCart;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement macBookSuccessMessage;
		
		@FindBy(xpath ="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
		private WebElement shouldSeeOneItemInCart;
		
		@FindBy(xpath ="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
		private WebElement shoppingCartOption;
		
		@FindBy(xpath="//button[@class='btn btn-danger btn-xs']")
		private WebElement removeButton;
		
		@FindBy(xpath="//div[@class='btn-group btn-block']")
		private WebElement shoppingCart0Item;
		
		@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
		private WebElement macBookComperison;		
		
		@FindBy(xpath="//div[3]//div[1]//div[2]//div[2]//button[3]")
		private WebElement macBookAirComperison;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement comperisonSuccessMessage;
		
		@FindBy(xpath = "//a[text()='product comparison']")
		private WebElement clickOnproductComprison;

		
		@FindBy(xpath="//table[@class='table table-bordered']")
		private WebElement productComperisonChart;
		
		@FindBy(xpath="//button[@data-original-title='Add to Wish List']['5']")
		private WebElement wishListButton;
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement youMustLoginOrCreateAccountToAddSonyVaioInWishList;
		
		@FindBy(xpath="//a[text()='MacBook Pro']['2']")
		private WebElement userClickOnMacBookPro;
		
		@FindBy(xpath="//h2[text()='$2,000.00']")
		private WebElement macBookProPriceTag;
		
		public void clickeOnTestEnvironment() {
			clickeOnTestEnvironment.click();
		}

		
		public void clickOnLaptopAndNotebookOption(){
			laptopAndNotebookOption.click();
		}
		public void clickOnShowAllLaptopAndNotebooks(){
			showAllLaptopAndNotebooks.click();
		}
		public void clickOnMacBookPro(){
			macBookPro.click();
			
		}
		public void clickedOnAddToCartOption(){
			addToCart.click();
		}
		public boolean successMessageForMacBook(){
			if(macBookSuccessMessage.isDisplayed())
				return true;
			else
				return false;
		}
		public boolean userShouldSeeOneItemInTheCart(){
			if(shouldSeeOneItemInCart.isDisplayed())
				return true;
				else
					return false;
	}
		public void userClickedOnCartOption(){
			shoppingCartOption.click();
		}
		public void userClickOnRedXToRemoveItem(){
			removeButton.click();
		}
		public boolean itemShouldBeRemovedAndCartShouldShowZeroItem(){
			if(shoppingCart0Item.isDisplayed())
				return true;
			else
				return false;
			
		}
		public void userClickOnMacBookComperisonButton(){
			macBookComperison.click();
		}
		public void userClickOnMacBookAirCompersionButton(){
			macBookAirComperison.click();
		}
		public void userShouldSeeSuccessMessageOnComparisonProducts(){
			comperisonSuccessMessage.isDisplayed();
		}
		public void clickOnproductComprison() {
			clickOnproductComprison.click();
		}
		public boolean userShouldSeeProductComperisonChart(){
			if(productComperisonChart.isDisplayed())
				return true;
			else
				return false;
		}
		public void userClickOnSonyVaioWishButton(){
			wishListButton.click();
		}
		public boolean userShouldloginOrRegisterAddSonyVaioToWishList(){
			if(youMustLoginOrCreateAccountToAddSonyVaioInWishList.isDisplayed())
				return true;
			else
				return false;
}
		public void userClickOnMacBookProItem(){
			userClickOnMacBookPro.click();
		}
		public boolean userShouldSeeMacBookProPriceTag(){
			if(macBookProPriceTag.isDisplayed())
			return true;
			else
				return false;
			
		}
}
