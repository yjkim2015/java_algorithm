package string;

public class Section2_12 {
    public static void main(String[] args) {
        String str = "#****###**#####**#####**##**";

        int i = 0;
        String answer = "";

        while (i < str.length()) {
            String tmp = str.substring(i, i + 7);
            int num = Integer.parseInt(tmp.replace('#', '1').replace('*', '0'), 2);
            answer += (char) num;
            i += 7;
        }

        System.out.println(answer);

    }
}
