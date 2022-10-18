package entities;

public class productBank {
  public int number;
  public String name;
  public double balance;

  public productBank() {
  }

  public productBank(int number, String name) {
    this.number = number;
    this.name = name;
  }

  public productBank(int number, String name, double initialDeposit) {
    this.number = number;
    this.name = name;
    deposit(initialDeposit);
  }

  public int getnumber() {
    return number;
  }

  public String getname() {
    return name;
  }

  public void setname(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount + 5.0;
  }

  public String toString() {
    return "Account "
        + number
        + ", Holder: "
        + name
        + ", Balance: $ "
        + String.format("%.2f", balance);
  }
}
