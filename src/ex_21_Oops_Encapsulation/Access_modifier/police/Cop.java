package ex_21_Oops_Encapsulation.Access_modifier.police;

public class Cop {
    protected int gun;
    String iCard;

   public Cop(int gun){
        this.gun = gun;
    }
  protected     void canIShoot(){
        System.out.println("Yes you can Shoot");
    }
}
