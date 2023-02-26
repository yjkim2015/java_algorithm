import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int lt = 0;
        int rt = chars.length-1;
        while(lt < rt) {
            if (Character.isLetter(chars[lt]))
            {
                if (Character.isLetter(chars[rt])) {
                    char tmp = chars[lt];
                    chars[lt] = chars[rt];
                    chars[rt] = tmp;
                    lt++;
                }
                rt--;
            }
            else {
                lt++;
            }
        }

        for(char ch : chars) {
            System.out.print(ch);
        }
    }
}
