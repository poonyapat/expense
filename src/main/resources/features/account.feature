Feature: account
  As a user
  I want to deposit and withdraw money with my account

Background:
  Given a user with initial balance 100 exists

Scenario: Deposit money to my account
  When I deposit 50 to my account
  Then my account balance is 150
  And my account income is 150

Scenario: Withdraw money from my account
  When I withdraw 50 from my account
  Then my account balance is 50
  And my account expense is 50

Scenario: Withdraw money over the balance
  When I withdraw 200 from my account
  Then my account balance is 100
  And my account expense is 0