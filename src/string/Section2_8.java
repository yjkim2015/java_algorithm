package string;

public class Section2_8 {
    public static void main(String[] args) {

        String str = "g0en2T0s8eSoft";

        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                //문자 0~9까지의 아스키코드 값 48~57
                answer = answer * 10 + (x- 48);
            }
        }

        System.out.println(answer);

    }
}
