import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] inputs = sc.nextLine().split(" ");

        String inputWord = inputs[0];
        String inputChar = inputs[1];

        for(int i = 0 ; i < inputWord.length(); i++) {

            int min = 999999999;
            for (int j = 0 ; j < inputWord.length(); j++) {

                if (inputWord.charAt(j) == inputChar.charAt(0)) {
                    min = Math.min(min,Math.abs(j-i));
                }
            }
            System.out.print(min+" ");
        }


    }
}
