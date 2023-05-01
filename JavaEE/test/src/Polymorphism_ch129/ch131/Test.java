package Polymorphism_ch129.ch131;


public class Test {
    public static void main(String[] args) {
//        Fu f = new Zi();
//        调用成员变量：编译看左边，运行也看左边
        Animal a = new Dog();
        a.eat();

//        将左边的父类强转成右边一样的子类
//        Dog d = (Dog) a;
//        d.lookHome();

//        Dog d = (Cat) a;  狗子类不能被强转成猫类
//        d.catchMouse();
//
//        判断
        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.lookHome();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        }else{
            System.out.println("没有这个类型，无法转换");
        }

//        JDK14 后的新特性
//        if(a instanceof Dog d){
//            d.lookHome();
//        } else if (a instanceof Cat c) {
//            c.catchMouse();
//        }else{
//            System.out.println("没有这个类型，无法转换");
//        }


    }
}

class Animal{
    public void eat(){
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
