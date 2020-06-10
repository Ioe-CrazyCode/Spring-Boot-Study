package test;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 0};
        int weibiao = launch(a);
        System.out.println("位标：" + weibiao);
        System.out.println("数组 " + a[weibiao] + " 最多，输出：" + a[weibiao]);

    }

    private static int launch(int[] a) {
        List list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            String[] cishu = {};
            cishu = new String[a.length];
            int kk = 0;
            for (int u = 0; u < a.length; u++) {
                if (a[i] == a[u]) {
                    kk = kk + 1;
                    cishu[i] = String.valueOf(kk);
                }
            }
            list.add(cishu[i]);
        }
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = (String) list.get(i);
        }
        int zhi = Integer.parseInt(array[0]);
        int weibiao = 0;
        for (int y = 0; y < array.length; y++) {
            // 次数取最大值的位标 根据位标确定 原数组对应位置是哪个值
            int bi = Integer.parseInt(array[y]);
            if (zhi < bi) {
                zhi = bi;
                weibiao = y;
            }
        }
        return weibiao;
    }

}
