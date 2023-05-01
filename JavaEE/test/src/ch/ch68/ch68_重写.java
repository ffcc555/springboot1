package ch.ch68;

//方法的重写
public class ch68_重写 {
    public static void main(String[] args) {
        compare(30.0, 29.5);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println("byete");
        System.out.println(b1 == b2);
    }

    public static void compare(int i1, int i2) {
        System.out.println("int");
        System.out.println(i1 == i2);
    }

    public static void compare(long l1, long l2) {
        System.out.println("long");
        System.out.println(l1 == l2);
    }

    public static void compare(double d1, double d2) {
        System.out.println("double");
        System.out.println(d1 == d2);
    }


}
