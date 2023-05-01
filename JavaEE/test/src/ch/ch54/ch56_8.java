package ch.ch54;

import java.util.Random;

public class ch56_8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random r =new Random();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int random_index = r.nextInt(arr.length);//索引
            temp = arr[i];
            arr[i] = arr[random_index];
            arr[random_index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
