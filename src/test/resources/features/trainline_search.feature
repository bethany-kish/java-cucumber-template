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
        And I select Tomorrow and Next Day
        And I click to Get times and Tickets
        Then train times should be displayed

      @wip
    Scenario: EXERCISE 5 -  outdate in the future
       Given I am on TheTrainline.com
       When I select the journey from "London" to "Brighton"
       And I select the return option
       And I select an outdate 60 days in the future
       And I click to Get times and Tickets
       Then train times should be displayed