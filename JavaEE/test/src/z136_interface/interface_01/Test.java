package z136_interface.interface_01;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("001",1);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.swim();


        Rabbit r = new Rabbit("002",2);
        System.out.println(r.getName()+","+r.getAge());
        r.eat();
    }
}
