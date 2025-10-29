Feature: Dynamic Product Purchase Flow

  @EndToEnd
  Scenario Outline: User purchases product via Product Details Page with dynamic data
    Given the user launches the browser and navigates to the Home Page
    When the user clicks on "<category>" link and navigates to the Product Page
    And the user sorts the products by "<sortOption>"
    And the user filters the products by price range "<minPrice>" to "<maxPrice>"
    And the user clicks on the product named "<productName>"
    Then the user should be navigated to the Product Details Page
    And the user verifies the product name and price
    When the user changes the quantity to "<quantity>"
    And the user clicks on the Add to Cart button
    Then the product should be added to the cart successfully

    Examples: 
      | category | sortOption         | minPrice | maxPrice | productName            | quantity |
      | Books    | Price: Low to High |       10 |       50 | Computing and Internet |        2 |
