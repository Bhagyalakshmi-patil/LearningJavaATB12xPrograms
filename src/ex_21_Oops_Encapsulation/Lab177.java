package ex_21_Oops_Encapsulation;

public class Lab177 {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("Amit",1100);
        System.out.println(iciciBank.getBal());

        boolean isCashier = true;
        iciciBank.setBal(2000,isCashier);
        System.out.println(iciciBank.getBal());
        System.out.println(iciciBank.bank_name);
    }

}

class ICICIBank{
    private String name;
    private  long bal;
    public String bank_name = "ICICI";

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier){
            this.bal = bal;
        }else{
            System.out.println("Not allowed to change the balance");
        }
    }
}
