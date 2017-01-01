/**
 * Created by Timothy on 1/1/2017.
 */
public class CrapsPlayer {
    public CrapsPlayer(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addToBalance(int num) {
        this.balance += num;
    }

    public void subFromBalance(int num){
        this.balance -= num;
    }

    private int balance;
}
