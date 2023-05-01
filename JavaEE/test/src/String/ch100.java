package String;

//用户登录
import java.util.Scanner;


public class ch100 {
    public static void main(String[] args) {
        //定义两个变量记录用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            //键盘输入用户名账户和密码
            System.out.println("请输入用户名 ： ");
            String username = sc.next();
            System.out.println("请输入密码 ： ");
            String userPassword = sc.next();

            if (username.equals(rightUsername) && userPassword.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号登录失败,请先解锁");
                } else {
                    System.out.println("账户登录失败,还剩下" + (2 - i) + "次机会");
                }

            }


        }


    }
}
