Feature: Booking search
  Scenario: Search booking page for Kemer
    Given Keyword for search is "Kemer"
    When User does search
    Then Booking page "DoubleTree By Hilton Antalya-Kemer" is on the first page

