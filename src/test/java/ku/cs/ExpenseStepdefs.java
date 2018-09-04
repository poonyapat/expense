package ku.cs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ku.cs.models.Account;
import org.junit.jupiter.api.Assertions;

public class ExpenseStepdefs {
    Account account;

    @Given("^a user with initial balance (\\d+) exists$")
    public void aUserWithInitialBalanceExists(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        account = new Account(arg0);
    }

    @When("^I deposit (\\d+) to my account$")
    public void iDepositToMyAccount(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        account.deposit(arg0);
    }

    @Then("^my account balance is (\\d+)$")
    public void myAccountBalanceIs(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(arg0, account.getBalance());
    }

    @And("^my account income is (\\d+)$")
    public void myAccountIncomeIs(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(arg0, account.getIncome());
    }

    @When("^I withdraw (\\d+) from my account$")
    public void iWithdrawFromMyAccount(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        account.withdraw(arg0);
    }

    @And("^my account expense is (\\d+)$")
    public void myAccountExpenseIs(int arg0) {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(arg0, account.getExpense());
    }


}
