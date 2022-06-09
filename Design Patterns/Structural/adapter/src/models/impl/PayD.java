package src.models.impl;

public interface PayD {
    public String getCustCardNo();
    public String getCardOwnerName();
    public String getCardExpMonthDate();
    public short getCVVNo();
    public double getTotalAmount();
    public void setCustCardNo(String  custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthDate(String expMonthDate);
    public void setCVVNo(short cVVNo);
    public void setTotalAmount(double totalAmount);
}
