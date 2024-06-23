
Feature: Build You Own Computer

  @author_JigarPatel @smoke @sanity @regression
  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When I click on computer tab
    Then I should see "Computers" text on Computer Page

  @author_JigarPatel @smoke @regression
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktop link
    Then I should see "Desktops" text on Desktop Page

  @author_JigarPatel @regression
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktops link
    And I click on product name build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART Button
    Then Verify message product added "The product has been added to your shopping cart" should displayed
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |