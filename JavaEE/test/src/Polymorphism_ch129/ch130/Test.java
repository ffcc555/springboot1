package Polymorphism_ch129.ch130;

public class Test {
    public static void main(String[] args) {
//        Fu f = new Zi();
//        调用成员变量：编译看左边，运行也看左边
        Animal a = new Dog();
        System.out.println(a.name);

//        调用成员方法：编译看左边，运行也看右边
        a.show();
    }
}
class Animal{
    String name = "Animal";

    public void show(){
        System.out.println("Animal______show");
    }
}

class Cat extends Animal{
    String name = "Cat";

    public void show(){
        System.out.println("Cat______show");
    }
}class Dog extends Animal{
    String name = "Dog";

    public void show(){
        System.out.println("Dog______show");
    }
}