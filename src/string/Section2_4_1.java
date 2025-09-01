package string;

public class Section2_4_1 {
    public static void main(String[] args) {
        String[] arr = {"god", "time", "Big"};

        for (String s : arr) {
            StringBuffer sb = new StringBuffer(s);
            sb.reverse();
            System.out.println(sb);
        }
    }
}
