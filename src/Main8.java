import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String result = "YES";
        input = input.trim();

        for(int i = 0 ; i < input.length() / 2; i++) {
            char ch = input.charAt(i);
            char reverseCh = input.charAt(input.length() - 1 - i);
            if (Character.isLetter(ch)
            || Character.isLetter(reverseCh)) {
                if (Character.toLowerCase(ch) != Character.toLowerCase(reverseCh)) {
                    result = "NO";
                }
            }
        }

        /*
            String answer="NO";
            s=s.toUpperCase().replaceAll("[^A-Z]", "");
            String tmp=new StringBuilder(s).reverse().toString();
            if(s.equals(tmp)) answer="YES";
         */

        System.out.println(result);
    }
}
