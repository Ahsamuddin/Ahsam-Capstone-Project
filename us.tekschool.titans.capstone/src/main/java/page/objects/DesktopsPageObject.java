package page.objects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;
import utilities.WebDriverUtility;
public class DesktopsPageObject extends Base {
	public DesktopsPageObject(){
		PageFactory.initElements(driver,this);
		
		
	}
	//Syntax from storing UI Element in POM class using PageFactory implementation 
	//@FindBy(locatorType="Locator")
	//AccessModifier WebElement NameOfElement
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	 
	@FindBy(xpath= "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	
	@FindBy(tagName="img")
	private List<WebElement> items; 
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityInput;
	
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewLink;
	
	@FindBy(id="input-name")
	private WebElement yourNameField;
	
	@FindBy(id="input-review")
	private WebElement yourReviewField;
	
	@FindBy(xpath="//input[@type='radio']")
	private List <WebElement> rating;
	
	@FindBy(id = "button-review")
	private WebElement ReviewContenueButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div/div[3]/form/div[2]/text()")
	private String reviewSubmissionMessage;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement canonAddToCartButton;
	
	@FindBy(xpath = "//select[@id='input-option226']//child::option[@value='15']")
	private WebElement dropdownRed;
	
	
	
	public void clickOnDesktopsTab(){
	Actions action = new Actions(driver);
	
	action.moveToElement(desktops).build().perform();
		
	}
	
	public void clickOnShowAllDesktops(){
		showAllDesktops.click();
		
	}
	public List<WebElement> desktopsItems(){
		List<WebElement> itemsDesk = items;
		return itemsDesk;	
	}
	public void clickOnHLP3065Item(){
		hpLP3065.click();
	}
	public void selecctQantity(String quantityValue){
		quantityInput.click();
		quantityInput.sendKeys(quantityValue);
	}
	public void clickOnAddToCartButton(){
		addToCartButton.click();	
	}
//	public String successMessage(){
//		String actualResult = "Success: you have add"+HPLPsuccessmessage.getText()+ "to your shop cart!";
//				return actualResult;
//	}
	
	public boolean validateSucessMessage() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnCanonEOS5DCamera(){
		canonEOS5DCamera.click();
	}
	public void clickOnReviewLink(){
		writeReviewLink.click();
	}
	
	public void selectRating(String ratingValue){
		List<WebElement> ratringElements  =rating;
		for(WebElement element:ratringElements ){
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())){
				element.click();
				break;
			}
		}
	}
	
	public void clickOnContenueButton(){
		ReviewContenueButton.click();
	}
	public void enterYourName(String nameValue){
		yourNameField.sendKeys("nameValue");
	}
	public void enterYourReview(String reviewValue){
		yourReviewField.sendKeys("reviewValue");
	}
	public String reviewText(){
	return reviewSubmissionMessage;
	}
	
	public void clickOnAddToCartBtn(){
		canonAddToCartButton.click();
	}
	
	public void selectColor() {
		dropdownRed.click();
	}


}