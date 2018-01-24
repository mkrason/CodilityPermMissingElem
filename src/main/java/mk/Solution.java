package mk;

import java.util.Arrays;

public class Solution {

    public int solution(int[] a) {

        int counter = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] + 1 != a[i + 1]) {
                counter = a[i] + 1;
                break;
            }
        }
        return counter;
    }

}
