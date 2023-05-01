package string_test;

import java.util.Scanner;
import java.util.StringJoiner;

public class string_test1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入字符串 ");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                 break;
            }else{
                System.out.println("请重新输入字符串");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner(",");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeRoMa(number);
//             sb.append(s);
            sj.add(s);
        }
        System.out.println(sj);
    }
    public static String changeRoMa(int number){
        String[] arr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }
    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '9' || c <= '0'){
                return false;
            }
        }
        return true;
    }
}
