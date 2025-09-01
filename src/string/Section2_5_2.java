package string;

public class Section2_5_2 {
    public static void main(String[] args) {
        String str = "a#b!GE*T@S";

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char c1 = charArray[left];
            char c2 = charArray[right];

            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                char tmp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = tmp;
                left++;
                right--;
            }
            else if (!Character.isLetter(c1)) {
                left++;
            }
            else if (!Character.isLetter(c2)) {
                right--;
            }
        }

        String result = String.valueOf(charArray);
        System.out.println(result);
    }
}
