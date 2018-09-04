package ku.cs.models;

public class Account {

    private float income = 0, expense = 0, balance = 0;

    public Account(float initialBalance) {
        this.balance = initialBalance;
        this.income = initialBalance;
    }

    public float getBalance() {
        return balance;
    }

    public float getIncome() {
        return income;
    }

    public float getExpense() {
        return expense;
    }

    public void deposit(float income){
        this.income += income;
        balance += income;
    }

    public void withdraw(float expense) {
        if (expense > balance){
            return;
        }
        this.expense += expense;
        balance -= expense;
    }
}
