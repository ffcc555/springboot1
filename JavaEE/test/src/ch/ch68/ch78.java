package ch.ch68;

import java.util.Random;
//奖池抽奖


public class ch78 {
    public static void main(String[] args) {
        //定义奖池
        int[] arr = {1, 5, 8, 6, 7};
        //创建新数组用于存储抽奖结果
        int[] newarr = new int[arr.length];
        //抽奖
        Random r = new Random();
        //
        for (int i = 0; i < 5; ) {
            int randomindex = r.nextInt(arr.length);
            int prize = arr[randomindex];
            boolean flag = contain(newarr, prize);
            if (!flag) {
                newarr[i] = arr[randomindex];
                i++;
            }
        }
        //遍历新奖池
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
    //定义方法判断price是否在新数组中存在
    public static Boolean contain(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
