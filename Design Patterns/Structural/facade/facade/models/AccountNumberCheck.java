package facade.models;

public class AccountNumberCheck {
    private int accountNumber = 987;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean accountActive(int acctNumToChechk) {
        return this.accountNumber == acctNumToChechk;
    }
}
