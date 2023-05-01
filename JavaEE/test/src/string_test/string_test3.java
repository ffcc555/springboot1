package string_test;

import java.util.Random;
import java.util.Scanner;

public class string_test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要打乱的字符串");
        String str = sc.next();
        char[] arr = str.toCharArray();
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static char[] change(char[] arr) {
        Random r = new Random();
        int number = r.nextInt(arr.length);
        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        return arr;
    }
}
