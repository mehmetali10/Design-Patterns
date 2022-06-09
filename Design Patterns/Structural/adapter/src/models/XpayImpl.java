package src.models;

import src.models.impl.Xpay;

public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private short cardCVVNo;
    private double amount;


    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public short getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;   
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
