package Task31st_May;

import java.util.Scanner;

public class Count_num_words_ReplaceAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        if (scanner.hasNextInt()) {
            System.out.println("Enter the sentence only");
            return;
        }
        String str = scanner.nextLine();

//        String [] w = str.split(" ");
//        System.out.println(w.length);

        //or

//        str = str.replaceAll("//s"," ");
//        String[] words = str.split(" ");
//        System.out.println(words.length);
    }
}
