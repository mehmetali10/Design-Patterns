package src.models.impl;

public interface Xpay {
    public String getCreditCardNo();
    public String getCustomerName();
    public String getCardExpMonth();
    public String getCardExpYear();
    public short getCardCVVNo();
    public double getAmount();
    public void setCreditCardNo(String  creditCardNo);
    public void setCustomerName(String customerName);
    public void setCardExpMonth(String cardExpMonth);
    public void setCardExpYear(String cardExpYear);
    public void setCardCVVNo(short cardCVVNo);
    public void setAmount(double amount);
}
