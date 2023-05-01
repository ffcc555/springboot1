package Permissions.demo_1;

public class Animal_01 {
    private String name;//01,可用
    protected  String id;//本类中都可用，其他类中的子类也可以01,02,03都可用
    public String address;//任何地方都可用
    public void show(){
        System.out.println(name);
    }
}
