package zadanie12;

public class BankAccount {
    private String accountNumber;
    private double currentMoney;

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getCurrentMoney() {
        return currentMoney;
    }
    public void addMoney(double Money) {
        this.currentMoney += Money;
    }
    public void subtractMoney(double Money) {
        this.currentMoney -= Money;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
