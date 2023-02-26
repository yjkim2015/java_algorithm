import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputSplit = input.split(" ");

        String theLongestWord = inputSplit[0];
        for(String word : inputSplit) {
            theLongestWord = theLongestWord.length() >= word.length() ? theLongestWord : word;
        }

        System.out.println(theLongestWord);
    }
}
