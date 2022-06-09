package src.models;

import src.models.impl.PayD;
import src.models.impl.Xpay;

public class XpayToPayDAdapter implements PayD {
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private short cVVNo;
    private double totalAmount;
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
        setProp();
    }


    public String getCustCardNo() {
        return this.custCardNo;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    public String getCardOwnerName() {
        return this.cardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public String getCardExpMonthDate() {
        return this.cardExpMonthDate;
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    public short getCVVNo() {
        return this.cVVNo;
    }

    public void setCVVNo(short cVVNo) {
        this.cVVNo = cVVNo;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }


    public void setProp() {
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardOwnerName(this.xpay.getCustomerName());
        setCardExpMonthDate(this.xpay.getCardExpMonth());
        setCVVNo(this.xpay.getCardCVVNo());
        setTotalAmount(this.xpay.getAmount());
    }

    
}
