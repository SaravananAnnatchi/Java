Feature: Behaviour tool automation

  Scenario Outline: Behaviour tool automation scenario

    Given User on find current token
    When User click on Generate new token button
    Then Enters new <sessionkey> and <customerkey>
    Then click on sign token button
    Then Click on behaviour tool
    Then User enters <Products>
    Then enters  <SearchTerm> and select <Country>
    Then Click on customer behaviour buttons and enter <Products> and <SearchTerm>


    Examples:
    |sessionkey|customerkey|Products|SearchTerm|Country|
   |saravananmycustomertest|saravananmycustomertest|61971-H,11602-B,11602-A,83457-H,12968-B,78092-A,90496-A,06536-B,92186-A,93176-A,61971-B,61971-E,61971-D,70745-D83457-N,83457-I,70745-B,70745-F,83457-M,70745-J,83457-D,95620-C,08772-A,00278-B,01328-A,02564-A,03585-A,07271-F,07271-D,07271-E,07271-A,07271-B,07463-E,07463-C,07463-E,07463-B,07463-A,08652-A,08772-B,40111-N,40111-M,47613-B,47613-H,47613-J,48763-B,48673-G,60591-C,60591-L60591-B,60591-K,72625-A,72625-C,75078-A,79801-B,81210-B,83136-B,83136-A,83139-H,83139-F,83139-B,92516-A,92409-A,93678-A,94475-D,95198-A,95620-F,01806-A,01837-A,01837-B,03605-A,03605-E,03605-F,03605-B,04064-C,04509-A,04509-C,04509-B,05770-A,06024-A,06177-A,06177-C,07082-C,07082-D,07082-A,07082-D,00595-D,00595-B,00595-E,00595-C,00840-A,01186-B,01750-A,02768-A,06748-A,06748-E,06748-B,06872-C,08156-B,08294-A,11181-B,13665-B,14527-A,41818-B,71141-D,08065-A,11642-B,12403-A,11961-D,93233-A,80400-A,11961-B,11961-E,11642-A|Jeans|de_DE|