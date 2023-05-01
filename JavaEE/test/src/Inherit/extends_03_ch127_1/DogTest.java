package Inherit.extends_03_ch127_1;

public class DogTest {
    public static void main(String[] args) {
        System.out.println("哈士奇");
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.breakHome();
        System.out.println();

        System.out.println("沙皮狗");
        SharPei sp = new SharPei();
        sp.eat();//？方法的重写
        sp.drink();
        sp.lookHome();
        System.out.println();

        System.out.println("中华田园犬");
        ChineseDog cd = new ChineseDog();
        cd.eat();//？方法的重写
        cd.drink();
        cd.lookHome();


    }
}
