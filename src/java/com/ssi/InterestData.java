package com.ssi;

public class InterestData {
    private int amount;
    private int interest;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        interest=amount*5/100;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }
    
    
}
