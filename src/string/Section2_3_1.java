package string;

public class Section2_3_1
{
    public static void main(String[] args) {

        String str = "it is time to study";

        String answer = "";

        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(' ')) != -1)
        {
            String s = str.substring(0, pos);
            if (s.length() > m)
            {
                m = s.length();
                answer = s;
            }

            str = str.substring(pos + 1);

            if (str.length() > m)
            {
                answer = str;
            }
        }
        System.out.println(answer);
    }
}
