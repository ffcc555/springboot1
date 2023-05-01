package Inherit.extends_05_ch128;

public class Test {
    public static void main(String[] args) {
        Manger m = new Manger("001","zhangsan",150000,8000);
        System.out.println(m.getId()+", "+m.getName()+", "+ m.getSalary()+", "+m.getBonus());

        Cook c = new Cook();
        c.setId("002");
        c.setName("lisi");
        c.setSalary(18000);
        System.out.println(c.getId()+", "+c.getName()+", "+ c.getSalary());


    }
}
