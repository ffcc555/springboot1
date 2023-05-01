package ch.ch81.friend;

public class ch82_2 {
    public static void main(String[] args) {
        Friend  f1 = new Friend();
        f1.name = "xiaoming";
        f1.age = 22;
        f1.gender = "nan";

        System.out.println(f1.name);
        System.out.println(f1.age);
        System.out.println(f1.gender);


        //调用
        f1.eat();
        f1.sleep();

        System.out.println(" ==========================");

        Friend  f2 = new Friend();
        f2.name = "xm";
        f2.age = 18;
        f2.gender = "nv";

        System.out.println(f2.name);
        System.out.println(f2.age);
        System.out.println(f2.gender);


        //调用
        f2.eat();
        f2.sleep();


    }
}
