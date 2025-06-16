package ex_21_Oops_Encapsulation.super_keyword;

public class Lab180 {

}

class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Changing browser is not allowed");
        }
    }

        void openBrowser(){
            System.out.println("Open Browser!!");
        }
        void openBrowser(String browserName){
            System.out.println("Open Browser!! -> "+browserName);
        }
        void closeBrowser(){
            System.out.println("Close Browser!!");
        }
    }

    class TestCase1 extends BaseClass{

     public void tc(){}

    public TestCase1(String browser){
        super(browser);
        super.openBrowser();
        this.tc();
    }
    }

