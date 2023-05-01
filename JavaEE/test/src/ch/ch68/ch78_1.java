package ch.ch68;

import java.util.Random;

//奖池抽奖优化
public class ch78_1 {
    public static void main(String[] args) {
        int[] arr ={1,5,9,7,6,3};
        Random r = new Random();
        int randomindex =r.nextInt(arr.length) + 1;
        for (int i = 0; i < arr.length; i++) {
            int temp ;
            temp = arr[i];
            arr[i] =arr[randomindex];
            arr[randomindex] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }





    }













}
