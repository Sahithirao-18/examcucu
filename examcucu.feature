Feature: TestMeapp

  Background: Team Login

  Scenario Outline: Login functionality
    Given user navigated to login page
    When user entered the "<username>" and "<password>"
    Then login was success

    Examples: 
      | username | password    |
      | Lalitha  | Password123 |

  @Addcategory
  Scenario: Add the new category
    When Admin adds the newcategory
      | sports |

  @Addsubcategory
  Scenario: Adding the subcategory
    When Admin adds the subcategory
      | Basketball |
      | Volleyball |
