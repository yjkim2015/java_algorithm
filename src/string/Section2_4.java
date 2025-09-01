package string;

public class Section2_4 {
    public static void main(String[] args) {
        String[] arr = {"god", "time", "Big"};

        for (String s : arr) {

            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
