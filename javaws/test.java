package javaws;

import java.util.Arrays;

public class test {

    static double average1(String s) {
        String[] a = s.split("[, ]+");
        int sum = 0, count = 0;
        for (int i = 0; i < a.length; ++i) {
            int value = Integer.valueOf(a[i]);
            if (value > 0) {
                sum += value;
                ++count;
            }
        }
        return (double)sum / count;
    }

    static Double average2(String s) {
        return Arrays.stream(s.split("[, ]+"))
            .mapToInt(Integer::parseInt)
            .filter(e -> e > 0)
            .average()
            .getAsDouble();
    }


    public static void main(String[] args) {
        String s = "7, 13, -8, 6,9, 15, 0, -21,2,5";
        System.out.println(average1(s));
        System.out.println(average2(s));
    }
}
