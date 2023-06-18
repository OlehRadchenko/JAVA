package zadanie11;

import java.time.LocalDateTime;

public class BankAccountOperation {
    private BankAccount sourceBankAccount, targetBankAccount;
    private double money;
    private BankOperationType type;
    private LocalDateTime date;

    public BankAccount getSourceBankAccount() {
        return sourceBankAccount;
    }

    public BankAccount getTargetBankAccount() {
        return targetBankAccount;
    }

    public double getMoney() {
        return money;
    }

    public BankOperationType getType() {
        return type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setSourceBankAccount(BankAccount sourceBankAccount) {
        this.sourceBankAccount = sourceBankAccount;
    }

    public void setTargetBankAccount(BankAccount targetBankAccount) {
        this.targetBankAccount = targetBankAccount;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BankAccountOperation(BankOperationType type) {
        this.type = type;
    }
}
