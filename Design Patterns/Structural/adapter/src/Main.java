package src;

import src.models.XpayImpl;
import src.models.XpayToPayDAdapter;
import src.models.impl.PayD;
import src.models.impl.Xpay;

public class Main{

    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("12345678901");
        xpay.setCustomerName("Mehmet Ali");  
        xpay.setCardExpMonth("091");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23); 
        
        PayD payD = new XpayToPayDAdapter(xpay);
    }

}