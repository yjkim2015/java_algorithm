package string;

public class Section2_4_2 {
    public static void main(String[] args) {
        String[] arr = {"god", "time", "Big"};

        for (String x: arr) {
            char[] s = x.toCharArray();
            int left = 0;
            int right = s.length - 1;
            while (left < right) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
                left++;
                right--;
            }
            String tmp = String.valueOf(s);
            System.out.println(tmp);
        }
    }
}
