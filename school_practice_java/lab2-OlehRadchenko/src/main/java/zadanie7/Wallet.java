package zadanie7;

public class Wallet {
    private double money;

    public double getAmount() {
        return money;
    }

    public void addMoney(double amount){
        this.money+=amount;
    }
    public void removeMoney(double amount){
        this.money-=amount;
    }

    public Wallet() {
        this.money = 3000;
    }
}
