package ex_25_Exceptions;

public class Lab221_CustomException {
    public static void main(String[] args) {
        Bank sbi = new Bank(100,"INR");
        Bank icici = new Bank(200, "INR");
        Integer totalBal = sbi.add(icici);
        System.out.println(totalBal);
        Bank Jp_Chase = new Bank(300,"USD");
        Integer tot_bal_all = sbi.add(Jp_Chase);
        System.out.println(tot_bal_all);
    }
}
