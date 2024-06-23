@Register
Feature: Registration function

  @author_JigarPatel @smoke @sanity @regression
    Scenario: User Should Navigate To Register Page Successfully
    Given I am on homepage
    When I click on register link
    Then I should see the "Register" Message ondispleyd

  @author_JigarPatel @smoke @regression
  Scenario: verify That FirstName LastName Email Password And Confirm Password Fields Are Mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then "First name is required." errorMessage should display FirstName mandatory field
    And "Last name is required." errorMessage should display LastName mandatory field
    And "Email is required." errorMessage should display Email mandatory field
    And "Password is required." errorMessage should display Password mandatory field

  @author_JigarPatel @regression
  Scenario: verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on register link
    When I select 'Female' from gender option
    And I enter firstname "Laxmi"
    And I enter lastname "Devi"
    And I select day "02" from day dropdowm field
    And I select month "March" from month dropdown field
    And I select year "1999" from year dropdown field
    And I enter email "prime1041@gmail.com" to email field
    And I enter password "Prime1414" to password field
    And I enter confirm password "Prime1414" to confirm password field
    And I click on register button
    Then I see the message "Your registration completed"