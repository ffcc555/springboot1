package Inherit.extends_03_ch127_1;

public class SharPei extends Dog{
    @Override
    public void eat() {
        super.eat();
        System.out.println("沙皮狗在吃骨头");
    }
}
