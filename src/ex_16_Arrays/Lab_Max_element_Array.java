package ex_16_Arrays;

public class Lab_Max_element_Array {
    public static void main(String[] args) {
        int[]  array = {25, 14, 56, 78, 89, 49,60}; //Practice do this in online compiler
        int max = array[0];
        int min = array[0];
        for(int i = 0; i <= array.length - 1; i++ ){
            if(array[i] > max){
                max = array[i];
            }
        }
        for(int i = 0; i <= array.length - 1; i++ ){
            if(array[i] < min){
                min = array[i];
            }

        }
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
    }
}
