package ex_23_Enum;

public class Lab200_Enum {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
    }
}
enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String locator;

    Locators(String locator){
        this.locator = locator;
    }
    String getLocator(){
        return this.locator;
    }
}
