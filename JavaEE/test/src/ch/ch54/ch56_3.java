package ch.ch54;


import java.util.Random;

public class ch56_3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number =r.nextInt(100) + 1;
            arr[i] = number;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("总和为：" + sum);
        int avg = sum / arr.length ;
        System.out.println("平均数为："+avg);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("比平均数小的数有几个：" + count);
    }

}
