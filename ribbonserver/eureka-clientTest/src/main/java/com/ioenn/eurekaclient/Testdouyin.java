package com.ioenn.eurekaclient;

public class Testdouyin {

    public static void main(String[] args) {

        new Testdouyin().aaa();
        new Testdouyin().bbb();

    }

    public void aaa(){

        int[] niuniu = new int[]{0,1,2};
        int[] abab = new int[]{2,1,3};
        for (int i : niuniu){
            System.out.println(abab[i]);
        }

    }

    public void bbb(){

        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel = "";
        for (int i:index){
            System.out.println(i+" ：看看都是啥 ： "+index[i]);
            tel += arr[i];
            System.out.println(i+" ：循环输出的是啥 ： "+tel);
        }
        System.out.println("联系方式： "+tel);

    }

}
