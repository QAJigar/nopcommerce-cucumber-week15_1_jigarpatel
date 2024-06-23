Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @author_JigarPatel @sanity @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should see the Welcom Message "Welcome, Please Sign In!"

  @author_JigarPatel @smoke @regression
  Scenario: verify The Error Message With InValid Credentials
    Given I am on homepage
    When I click on login link
    And I enter email "abcd@gmail.com"
    And I enter password "xyz123"
    And I click on login button
    Then I should see the error Message <ErrorMessage>
      | Login was unsuccessful. Please correct the errors and try again.
      | No customer account found                                        |

  @author_JigarPatel @smoke @regression
  Scenario: verify That User Should Log In Success Fully With Valid Credentials
    Given I am on homepage
    When I click on login link
    And I enter email "prime1041@gmail.com"
    And I enter password "Prime1414"
    And I click on login button
    Then I should see the logOut link is display

  @author_JigarPatel @smoke @regression
  Scenario: Verify That User Should Log Out Success Fully
    Given I am on homepage
    When I click on login link
    And I enter email "prime1041@gmail.com"
    And I enter password "Prime1414"
    And I click on login button
    And I click on logout link
    Then I should see the LogIn Link Display