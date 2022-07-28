package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class HomePage extends Base {
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}	
		@FindBy(xpath = "//span[text()='Currency']")
		private WebElement currencyOption;
		
		@FindBy(xpath = "//button[@type='button']")
		private WebElement euroCurrency;
		
		@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
		private WebElement changeCurrencyValue;
		
		@FindBy(xpath = "//button[@class = 'btn btn-inverse btn-block btn-lg dropdown-toggle']")
		private WebElement shoppingCartOption;
		
		@FindBy(xpath = "//p[@class = 'text-center']")
		private WebElement shoppingCardMessage;
	
	
public void clickOnCurrencyOption(){
	currencyOption.click();	
}
public void clickOnEuroCurrency(){
	euroCurrency.click();
}
public void euroCurrency() {
	changeCurrencyValue.isDisplayed();
}
public void clickedOnShoppingCard(){
	shoppingCartOption.click();
}
public boolean shoppingCardMessageEmpty(){
	if(shoppingCardMessage.isDisplayed())
		return true;
	else
		return false;
}
}


