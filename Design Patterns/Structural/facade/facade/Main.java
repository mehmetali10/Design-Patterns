package facade;

import facade.models.BankAccountFacade;

public class Main{

    public static void main(String[] args) {
        BankAccountFacade baf = new BankAccountFacade(987, 0000);
        baf.depositCash(78);
        baf.withdrawCash(999999); 
        baf.withdrawCash(32);       
    }

}