package ex_20_Oops_Poly.methodoverriding;

public class RealExample {
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.openBrowser();
    }

}

class commonToAll{
    void openBrowser(){
        System.out.println("Open the Browser!");
    }
}
class TC_Chrome extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting a chrome");
        // new ChromeDriver();
    }
}
