package string;

public class Section2_2 {
    public static void main(String[] args) {

        String str = "StuDY";

        String result = "";
        for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122) {
                result = result + (char) (c - 32);
            }
            else {
                result = result + (char) (c + 32);
            }
        }

    }
}
