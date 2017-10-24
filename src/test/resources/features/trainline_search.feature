Feature: Plan Journey

    Scenario: Plan Journey - list times and prices
        Given I am on TheTrainline.com
        When I select the journey from "Brighton" to "London"
        And I click to Get times and Tickets
        Then train times should be displayed