package RepeatedWord;

import java.util.HashMap;
import java.util.Scanner;

public class RepeatedWord {

//    https://www.geeksforgeeks.org/find-first-repeated-word-string/
//    https://javaconceptoftheday.com/first-repeated-and-non-repeated-character-in-a-string/
//    https://stackoverflow.com/questions/7552253/how-to-remove-special-characters-from-a-string

    public static void firstRepeatedWord(String input) {
        HashMap<String, Integer> stringMap = new HashMap<String, Integer>();
        String[] words = input.split("\\s+");

        for(String s: words) {
            s=s.replaceAll("[-+.^:,]","");
            s=s.toLowerCase();
            if(stringMap.containsKey(s)){
                stringMap.put(s,stringMap.get(s)+1);
            } else {
                stringMap.put(s,1);
            }
        }

        for(String s: words) {
            s=s.replaceAll("[-+.^:,]","");
            s=s.toLowerCase();
            if(stringMap.get(s) > 1) {
                System.out.print(s);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.next();
        input += sc.nextLine();
        firstRepeatedWord(input);
    }
}
