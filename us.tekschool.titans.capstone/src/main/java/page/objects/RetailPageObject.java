package page.objects;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class RetailPageObject extends Base {

		public RetailPageObject() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
		public WebElement testEnvironmentLogo;

		@FindBy(xpath = "//span[text()='My Account']")
		private WebElement myAccountOption;

		@FindBy(xpath = "//a[text()='Login']")
		private WebElement loginOption;

		@FindBy(id = "input-email")
		private WebElement emailField;

		@FindBy(id = "input-password")
		private WebElement passWordField;

		@FindBy(xpath = "//input[@class='btn btn-primary']")
		private WebElement loginButton;

		@FindBy(xpath = "//h2[text()='My Account']")
		private WebElement myAccountDashboard;

		@FindBy(xpath = "//a[text()='Register for an affiliate account']")
		private WebElement registerForAnAffiliateAccount;

		@FindBy(id = "input-company")
		private WebElement companyField;

		@FindBy(id = "input-website")
		private WebElement webSiteField;

		@FindBy(id = "input-tax")
		private WebElement taxField;

		@FindBy(xpath = "//input[@value='cheque']")
		private WebElement chequeButton;

		@FindBy(xpath = "//input[@value='paypal']")
		private WebElement paypalButton;

		@FindBy(xpath = "//input[@value='bank']")
		private WebElement bankButton;

		@FindBy(id = "input-cheque")
		private WebElement chequePayeeNameField;

		@FindBy(xpath = "//input[@value='1']")
		private WebElement aboutUsCheckBox;

		@FindBy(xpath = "//input[@value='Continue']")
		private WebElement continueButton;

		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessageOnAffiliatePage;
		
		@FindBy(xpath = "//span[text()='My Account']")
		private WebElement MyAccountOption;
		
		@FindBy(xpath="//a[text()='Edit your affiliate information']")
		private WebElement editYourAffiliateInformation;
		
		@FindBy(xpath ="//input[@value='bank']")
		private WebElement bankTransferRadioButton;
		
		@FindBy(id="input-bank-name")
		private WebElement bankNameField;

		@FindBy(id="input-bank-branch-number")
		private WebElement abaNumberField;

		@FindBy(id="input-bank-swift-code")
		private WebElement swiftCodeField;

		@FindBy(xpath = "//input[@name='bank_account_name']")
		private WebElement accountNameField;

		@FindBy(xpath = "//input[@name='bank_account_number']")
		private WebElement accountNumberField;
		
		@FindBy(xpath = "//input[@class='btn btn-primary']")
		private WebElement countenueBtn;
		
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successfullyMessage;
		
		@FindBy(xpath = "//a[text()='Edit your account information']")
		private WebElement editYourAccountInformation;
		
		@FindBy(id="input-firstname")
		private WebElement fNameField;
		
		@FindBy(id="input-lastname")
		private WebElement lNameField;
		
		@FindBy(id="input-email")
		private WebElement emailAddField;
		
		@FindBy(id="input-telephone")
		private WebElement telephoneNumField;
		
		@FindBy(xpath ="//input[@class='btn btn-primary']")
		private WebElement continueButtonField;
		
		@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
		private WebElement accountSuccessUpdateMessege;

		public void clickOnMyAccount() {
			myAccountOption.click();
		}

		public void clickOnLoginOption() {
			loginOption.click();
		}

		public boolean isLogoPresent() {
			if (testEnvironmentLogo.isDisplayed())
				return true;
			else
				return false;
		}

		public String getTitle() {
			return driver.getTitle();
		}

		public void enterUserNameAndPassword(String userNameValue, String passValue) {
			emailField.sendKeys(userNameValue);
			passWordField.sendKeys(passValue);
		}

		public void clickOnLoginButton() {
			loginButton.click();
		}

		public boolean successfulLogin() {
			if (myAccountDashboard.isDisplayed())
				return true;
			else
				return false;
		}

		public void clickOnRegisterForAnAffiliateAccountLink() {
			registerForAnAffiliateAccount.click();
		}

		public void enterCompanyName(String companyNameValue) {
			companyField.sendKeys(companyNameValue);
		}

		public void enterWebSite(String webSiteValue) {
			webSiteField.sendKeys(webSiteValue);
		}

		public void taxIDField(String taxIDValue) {
			taxField.sendKeys(taxIDValue);
		}

		public void selectpaymentMethod(String paymentType) {
			if (paymentType.trim().equalsIgnoreCase("cheque")) {
				if (!chequeButton.isSelected()) {
					chequeButton.click();
				}
			} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
				paypalButton.click();
			} else
				bankButton.click();
		}

		public void enterChequePayeeName(String chequePayeeNameValue) {
			chequePayeeNameField.sendKeys(chequePayeeNameValue);
		}

		public void clickOnContinueButton() {
			continueButton.click();
		}

		public boolean isSuccessMessagePresent() {
			if(successMessageOnAffiliatePage.isDisplayed()) 
				return true;
				else 
				return false;
			
		}
		
		public void clickonAboutUs() {
			aboutUsCheckBox.click();
		}
		public void clickedOnMyAccountOption(){
			MyAccountOption.click();
		}
		public void clickOnEditAffiliateInformation(){
			editYourAffiliateInformation.click();
		}
		
		public void clickOnBankTransferRadioButton(){
			bankTransferRadioButton.click();
		}


public void enterBankName(String bankNameValue) {
	bankNameField.sendKeys(bankNameValue);
}

public void enterabaNumber(String abaNumberValue) {
	abaNumberField.sendKeys(abaNumberValue);
}

public void enterSwiftCode(String swiftCodeValue) {
	swiftCodeField.sendKeys(swiftCodeValue);

	}
public void enterAccountName(String accountNameValue){
	accountNameField.sendKeys(accountNameValue);
	
}
public void enterAccountNamber(String accountNumberValue){
	accountNumberField.sendKeys(accountNumberValue);
}

public void clickOnContenueBtn(){
	countenueBtn.click();
}
public boolean yourAccountHasBeenSuccessfullyUpdated(){
	if(successfullyMessage.isDisplayed()) 
	return true;
	else
		return false;
}
public void clickedOnEditYourAccountInformation(){
	editYourAccountInformation.click();
}

public void userEnterFirstName(String firstNameValue){
	fNameField.sendKeys(firstNameValue);
}
public void userEnterLastName(String lastNameValue){
	lNameField.sendKeys(lastNameValue);
}

public void userEnterEmailAddress(String emailAddValue){
	emailAddField.sendKeys(emailAddValue);
}
public void userEnterTelephoneNumber(String telephoneNumberValue){
	telephoneNumField.sendKeys(telephoneNumberValue);
}

public void clickedOnContinueButton(){
	continueButtonField.click();
}

public boolean yourAccountHasBeenSuccessfullyUpdatedMessege(){
	if( accountSuccessUpdateMessege.isDisplayed())
		return true;
	else
		return false;
}

}



	
		
	


