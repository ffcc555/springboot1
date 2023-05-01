package String;

import java.util.Scanner;

public class ch103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money;
        while (true) {
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("请输入正确金额");
            }
        }

        String moneyStr = "";
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr =   capitalNumber + moneyStr;

            money = money / 10;
            if(money == 0){break;}
        }
        int count =7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);
        String result ="";
        String[] arr={"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < arr.length; i++) {
            result  = moneyStr.charAt(i)+ arr[i];
            System.out.print(result);
        }
    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }




}
