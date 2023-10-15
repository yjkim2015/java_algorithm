import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String result = "";
        int dupleCount = 1;

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(!result.isEmpty()){
                char c = result.charAt(result.length() - 1);
                if (c == ch) {
                    dupleCount++;
                    if (i == input.length() -1){
                        result+=dupleCount;
                    }
                }
                else {
                    if (dupleCount != 1) {
                        result+=dupleCount;
                    }
                    result+=ch;
                    dupleCount = 1;
                }
            }
            else {
                result+=ch;
            }
        }

        System.out.println(result);
    }
}
