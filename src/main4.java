import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String lines[] = new String[num];
        for (int i = 0; i < num; i++) {
            lines[i] = sc.nextLine();
        }

        for(int i = 0; i < lines.length; i++) {
            char[] chars = lines[i].toCharArray();
            for (int j = chars.length-1; j >= 0; j--) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }


    }
}
