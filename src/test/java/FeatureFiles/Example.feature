Feature: Explore section control


  @Smoke @Regression
  Scenario: payment discovery for user
    Given Navigate to website
    When Go to the discover for myself section and see the open account button.
    Then The user goes to the iyzico card section and sees the connection links

    When user goes to stores section and sees popular stores
    Then user goes to campaigns section and sees active campaigns

    And the user goes to the support section and sees the general information section

