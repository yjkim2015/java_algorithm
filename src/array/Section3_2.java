package array;

import java.util.ArrayList;
import java.util.List;

public class Section3_2 {
    public static void main(String[] args) {

        int n= 8;

        int[] arr = {130, 135, 148, 140, 145, 150, 150, 153};

        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer.add(arr[i]);
            }
        }

        System.out.println(answer);
    }
}
