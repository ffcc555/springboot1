package Polymorphism_ch129.ch129;

public class Test {
    public static void main(String[] args) {
        Student s  =new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("陈老师");
        t.setAge(18);

        Administrator ad = new Administrator();
        ad.setName("管理员");
        ad.setAge(55);

        register(s);
        register(t);
        register(ad);
    }


    public static void register(Person p){
        p.show();
    }
}
