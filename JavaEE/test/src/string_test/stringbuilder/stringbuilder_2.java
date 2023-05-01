package string_test.stringbuilder;

import java.util.Scanner;

public class stringbuilder_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        if(str.equals(result)){
            System.out.println("该字符串是对称的");
        }else {
            System.out.println("不对称的");
        }

    }




}
