package br.com.frovas;

public class Account {

    private String number;
    private int ballance;

    public Account(String number, int ballance) {
        this.number = number;
        this.ballance = ballance;
    }

    public String getNumber() {
        return number;
    }

    public int getBallance() {
        return ballance;
    }

    public void postCredit(int value) {
        this.ballance += value;
    }

    public void postDebit(int value) {
        this.ballance -= value;
    }
}
