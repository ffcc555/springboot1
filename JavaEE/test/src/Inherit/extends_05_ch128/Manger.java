package Inherit.extends_05_ch128;

public class Manger extends Employee{
    private int bonus;

    public Manger() {}

    public Manger(String id, String name, int salary, int bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
