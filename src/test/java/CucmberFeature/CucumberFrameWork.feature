@tag
Feature: Login to different Ecommerce website
  Background:
  Given Chrome should invoke
  @Regression_Cucumber
  Scenario Outline: Login to rahulshetty website
    Given user provide valid <userName> and valid <passWord>
    When <product> is displayed
    Then able to signout

    Examples:
      |  userName             | passWord    | product      |
      |  bonjour111@gmail.com | Bonjour111  | ZARA COAT 3  |


