package Polymorphism_ch129.ch132;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王",30);
        Dog d =new Dog(2,"黑色");
        p.keepPet(d,"骨头");

        Person p1 = new Person("老李",25);
        Cat c = new Cat(3,"灰");
        p1.keepPet(c,"鱼");
    }
}
