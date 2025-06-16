package ex_21_Oops_Encapsulation.Access_modifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop Jrcop = new Cop(10);
        System.out.println(Jrcop.gun);
        Jrcop.canIShoot();
    }
}
