
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username "cali.titans@tekschool.us" and password "cali123"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID  | paymentMethod | payeeName |
      | TEK     | tekschool.us | 123456 | Cheque        | TEK User  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | USA Bank |   1234567 |     00832 | Tek         |   00011122233 |
    And User click on Continue button
    Then User should see a success message

  
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email                   | telephone  |
      | John      | Smith    | john.smith@tekschool.us | 7026563232 |
    And User click on continue button
    Then User should see a messege ‘Success: Your account has been successfully updated.
