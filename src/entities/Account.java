package entities;

public class Account {
    private Integer numbem;
    private String holder;
    private Double balance;

    public Account(){
    }

    public Account(Integer numbem, String holder, Double balance) {
        this.numbem = numbem;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumbem() {
        return numbem;
    }

    public void setNumbem(Integer numbem) {
        this.numbem = numbem;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }

}
