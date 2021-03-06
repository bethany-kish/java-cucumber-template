Feature: Plan Journey


    Scenario: EXERCISE 1+2 - Plan Journey - list times and prices
        Given I am on TheTrainline.com
        When I select the journey from "Brighton" to "London"
        And I click to Get times and Tickets
        Then train times should be displayed


    Scenario: EXERCISE 3- Plan a return journey departing tomorrow and returning next day
        Given I am on TheTrainline.com
        When I select the journey from "London" to "Brighton"
        And I select the return option
        And I select Tomorrow
        And I select Next Day
        And I click to Get times and Tickets
        Then train times should be displayed


    Scenario: EXERCISE 5 -  outdate in the future
       Given I am on TheTrainline.com
       When I select the journey from "London" to "Brighton"
       And I select the return option
       And I select an outdate 58 days in the future
       And I select Next Day
       And I click to Get times and Tickets
       Then train times should be displayed



    Scenario: EXERCISE 6 - plan journey for 2 adults and 2 children
        Given I am on TheTrainline.com
        When I select the journey from "Leeds" to "London"
        And I select Tomorrow
        And I select 2 Adults
        And I select 2 Children
        And I click to Get times and Tickets
        Then train times should be displayed for "2 adults" and "2 children"
