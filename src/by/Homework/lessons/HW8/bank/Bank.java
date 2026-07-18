package by.Homework.lessons.HW8.bank;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;
    private Account accountFrom = null;
    private Account accountTo = null;

    public Bank() {
        this.accounts = new HashSet<>();
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccountIsNumber (String accountNumber){
        for(Account account: this.accounts){
            if(account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount){
        accountFrom = getAccountIsNumber(accountNumberFrom);
        accountTo = getAccountIsNumber(accountNumberTo);
        if (accountFrom == null || accountTo == null) {
            accountFrom = null;
            accountTo = null;
            throw new AccountNotFoundException("not.found.account");
        }
        if (accountFrom.getAmount() < amount) {
            accountFrom = null;
            accountTo = null;
            throw new NotEnoughMoneyException("not.enough.money");
        }

        if (accountFrom.getCurrency().equals(accountTo.getCurrency())){
            this.accounts.forEach(account -> {
                if(account.equals(accountFrom)) account.setAmount(account.getAmount()-amount);
                if(account.equals(accountTo)) account.setAmount(account.getAmount()+amount);
            });
            accountFrom = null;
            accountTo = null;
        }
        //else логику для конвертации (п.9)
    }

    //Думаю, что передаю сумму amount в бел.руб
    //exchangeRate курс рубля к долл
    public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate){
        transferMoney(accountNumberFrom, accountNumberTo, amount);

        //если не валютные оказались то пустыми не будут
        if (accountFrom != null && accountTo != null) {
            double amountVal = new BigDecimal(amount/exchangeRate).setScale(2, RoundingMode.HALF_UP).doubleValue();     //загуглил такое. Проверял все дебагером
            if (accountFrom.getCurrency().equals("BYN") && accountTo.getCurrency().equals("USD")){
                this.accounts.forEach(account -> {
                    if(account.equals(accountFrom)) account.setAmount(account.getAmount()-amount);
                    if(account.equals(accountTo)) account.setAmount(account.getAmount()+amountVal);
                });
            } else if (accountTo.getCurrency().equals("BYN") && accountFrom.getCurrency().equals("USD")){
                this.accounts.forEach(account -> {
                    if(account.equals(accountFrom)) account.setAmount(account.getAmount()-amountVal);
                    if(account.equals(accountTo)) account.setAmount(account.getAmount()+amount);
                });
            }
        }
        accountFrom = null;
        accountTo = null;
    }
}