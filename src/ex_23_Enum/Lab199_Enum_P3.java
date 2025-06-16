package ex_23_Enum;

public class Lab199_Enum_P3 {
    public static void main(String[] args) {
        System.out.println(Colours.RED.getHexCode());
    }
}
enum Colours{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    Colours(String hexCode){
        this.hexCode = hexCode;
    }
    String getHexCode(){
        return this.hexCode;
    }
}
