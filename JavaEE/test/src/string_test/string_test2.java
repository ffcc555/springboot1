package string_test;

import java.util.Scanner;

public class string_test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串1");
        String strA = sc.next();
        System.out.println("请输入字符串2");
        String strB = sc.next();
        boolean flag = check(strA, strB);
        if(flag){
            System.out.println("strA是旋转字符");
        }else {
            System.out.println("strA不是旋转字符");
        }
    }
    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }

    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
