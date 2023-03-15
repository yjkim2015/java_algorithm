import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String s = "";

        for(char ch: input.toCharArray()) {
            if(Character.isDigit(ch)) {
                if(ch == '0' && s.isEmpty()) {
                    continue;
                }
                s+=ch;
            }
        }

        System.out.println(Integer.parseInt(s.toString()));
    }
}
