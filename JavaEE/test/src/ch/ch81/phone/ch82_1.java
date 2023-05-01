package ch.ch81.phone;

public class ch82_1 {
    public static void main(String[] args) {
        Phone p =new Phone();

        //给手机赋值
        p.brand = "iphone";
        p.price = 6666.666;

        System.out.println(p.brand);
        System.out.println(p.price);

        //调用方法
        p.call();
        p.playGame();


    }
}
