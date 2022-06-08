package facade.models;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;
    public WelcomeToBank bankWelcome;
    public AccountNumberCheck acctChecker;
    public SecurityCodeCheck codeChecker;
    public FundsCheck fundChecker;
    
    public BankAccountFacade(int newAcctNum, int newSecCode) {
        this.accountNumber = newAcctNum;
        this.securityCode = newSecCode;
        bankWelcome = new WelcomeToBank();
        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if(acctChecker.accountActive(accountNumber) && codeChecker.ısCodeCorrect(securityCode) && fundChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction complited succesfuly\n");
        } else{
            System.out.println("Transaction failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if(acctChecker.accountActive(accountNumber) && codeChecker.ısCodeCorrect(securityCode)) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction completed succesfuly\n");
        } else {
            System.out.println("Transaction failed\n");
        }
    }
}
