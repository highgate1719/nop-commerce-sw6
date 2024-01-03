@regression
Feature: ComputerPage Feature
  In Order to add product in a cart successfully
  As a User
  I have to add product in a cart successfully

  Background: User is on Homepage
    Given I am on homepage
    When I click on computer tab
    And I should navigate to computer page successfully

  @sanity @smoke
  Scenario: User should navigate to computer page successfully
    Then I should get computer text "Computers"

  @smoke
  Scenario: User should navigate to desktops page successfully
    And I click on desktop tab
    Then I should get a desktop text "Desktops"

  Scenario Outline: User should build you own computer and add them to cart successfully
    And I click on desktop tab
    And I should navigate to desktop page successfully
    And I click on product name "Build your own computer"
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select  OS "<os>"
    And I select  Software "<software>"
    And I click on ADD TO CART Button
    Then I should get message "The product has been added to your shopping cart"

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |
