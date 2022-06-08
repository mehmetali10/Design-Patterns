package facade.models;
public class FundsCheck {
    private double cahsInAccount = 1905;

    public double getCahsInAccount() {
        return cahsInAccount;
    }

    public void decraseCashInAccount(double cashWithdrawn) {
        cahsInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        this.cahsInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashWithdrawal) {
        if(cahsInAccount > cashWithdrawal){
            decraseCashInAccount(cashWithdrawal);
            System.out.println("Withdraw completed. current fund: " + getCahsInAccount());
            return true;
        }
        System.out.println("Withdraw failed. current fund: " + getCahsInAccount());
        return false;
    }

    public void makeDeposit(double cashDeposit) {
        increaseCashInAccount(cashDeposit);
        System.out.println("Deposit completed. current fund: " + getCahsInAccount());
    }
}
