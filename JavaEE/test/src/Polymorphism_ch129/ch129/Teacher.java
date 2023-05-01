package Polymorphism_ch129.ch129;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师的信息为："+getName()+","+getAge());
    }
}
