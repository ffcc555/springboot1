package z135_abstract.abstract_01;

public class Test {
    public static void main(String[] args) {
        Frog f  = new Frog("aa",1);
        System.out.println(f.getName()+","+f.getAge());
        f.eat();
        f.drink();

    }
}
