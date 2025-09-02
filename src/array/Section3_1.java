package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Section3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> answer = new ArrayList<>();
        answer.add(list.get(0));
        for (int i = 1; i < n; i++) {
            if (list.get(i) > list.get(i-1)) {
                answer.add(list.get(i));
            }
        }

        System.out.println(answer);
    }
}
