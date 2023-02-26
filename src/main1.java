import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.next();

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        int count = 0;
        for (char ch : input1.toCharArray()) {
            if(ch == input2.charAt(0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}