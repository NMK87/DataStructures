package org.neha.basic_programs;

import java.util.Arrays;

public class LcmAndGcd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(lcmAndGcd3(5L, 10L)));
    }
    public static Long[] lcmAndGcd3(Long A , Long B) {
        Long[] result = new Long[2];
        long max = Math.max(A, B);
        long min = Math.min(A, B);

        while (min != 0 && max !=0) {
            long x = max-min;
            long y = min;
            max = Math.max(x, y);
            min = Math.min(x, y);
        }

        result[1] = max;
        result[0] = (A*B)/result[1];
        return result;
    }
}
