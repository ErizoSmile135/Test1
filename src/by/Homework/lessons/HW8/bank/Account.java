package by.Homework.lessons.HW8.bank;

import java.util.Objects;

public class Account {
    private long id;
    private String accountNumber;
    private String currency;
    private Double amount;

    public Account(long id, String accountNumber, String currency, Double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return id == account.id &&
                Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}