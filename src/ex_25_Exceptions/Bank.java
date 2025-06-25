package ex_25_Exceptions;

public class Bank {
    private String currency;
    private int amount;

    public Bank(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public   Integer add(Bank bankname){
        if(bankname.currency.equalsIgnoreCase("INR")){
            return bankname.getAmount()+ this.amount;
        } else{
            try {
                throw new CustomException("Currency Mismatch, Can't proceed");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
