package string;

public class Section2_3 {
    public static void main(String[] args) {
        String str = "it is time to study";

        String maxStr = "";
        int maxLen = 0;
        for (String s : str.split(" ")) {

            if (s.length() > maxLen) {
                maxLen = s.length();
                maxStr = s;
            }
        }

        System.out.println(maxStr.charAt(0));
    }
}
