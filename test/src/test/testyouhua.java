package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testyouhua {

    public static void main(String[] args) {

        launch();

    }

    private static void launch() {

        int[] a = {1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 0};

        Map<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (b.containsKey(a[i])) {
                b.put(a[i], b.get(a[i]) + 1);
            } else {
                b.put(a[i], 1);
            }
        }
        int max = 1;
        int currentKey = 0;
        for (Integer integer : b.keySet()) {
            if (b.get(integer) > max) {
                max = b.get(integer);
                currentKey = integer;

            }
        }
        System.out.println("数组 " + currentKey + " 最多，输出：" + currentKey);


    }

}
