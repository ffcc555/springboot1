package String;

import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class ch102_1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("请输入需要反转的字符串：");
        String s = sc.next();
        String result = reverser(s);
        System.out.println(result);

    }

    public static String reverser(String str){
        String result = "";
        for (int i = str.length() -1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}
