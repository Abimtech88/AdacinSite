@tag
Feature: Generating order no

  Scenario: test
    Given Have to open adacin page

  Scenario Outline: Verify Username and Password matched
    Given Have to open adacin page
    When Enter "<user>"
    And Give "<pass>"
    And click login
    And Give all details in search page "<Location>","<Hotels>","<Room Type>","<No of Rooms>","<Check-in>","<Check-out>","<Adult -Room>","<Children - Room>"
    And click submit
    And Give details in booking "<firstname>","<lastname>","<address>","<credit>","<credittype>","<month>","<year>","<ccvv>"
    Then click search
   

    Examples: 
      | user       | pass    | Location | Hotels       | Room Type    | No of Rooms | Check-in   | Check-out  | Adult -Room | Children - Room | firstname | lastname | address    | credit           | credittype  | month | year |ccvv |
      | abiraghul6 | Abi3988 | London   | Hotel Hervey | Super Deluxe | 3 - Three   | 23/06/2022 | 27/06/2022 | 3 - Three   | 2 - Two         | Abinaya   | Rithu    | Karapakkam | 8765432197634521 | Master Card | March | 2022 | 345 | 
			| abiraghul6 | Abi3988 | London   | Hotel Hervey | Super Deluxe | 3 - Three   | 23/06/2022 | 27/06/2022 | 3 - Three   | 2 - Two         | Abinaya   | Rithu    | Karapakkam | 8765432197634521 | Master Card | March | 2022 | 345 | 
      | abiraghul6 | Abi3988 | London   | Hotel Hervey | Super Deluxe | 3 - Three   | 23/06/2022 | 27/06/2022 | 3 - Three   | 2 - Two         | Abinaya   | Rithu    | Karapakkam | 8765432197634521 | Master Card | March | 2022 | 345 | 
      | abiraghul6 | Abi3988 | London   | Hotel Hervey | Super Deluxe | 3 - Three   | 23/06/2022 | 27/06/2022 | 3 - Three   | 2 - Two         | Abinaya   | Rithu    | Karapakkam | 8765432197634521 | Master Card | March | 2022 | 345 | 
      | abiraghul6 | Abi3988 | London   | Hotel Hervey | Super Deluxe | 3 - Three   | 23/06/2022 | 27/06/2022 | 3 - Three   | 2 - Two         | Abinaya   | Rithu    | Karapakkam | 8765432197634521 | Master Card | March | 2022 | 345 | 
      