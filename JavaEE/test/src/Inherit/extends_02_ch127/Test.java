package Inherit.extends_02_ch127;

public class Test {
    public static void main(String[] args) {
        OverseaStudents s = new OverseaStudents();
        s.lunch();



    }

}

class Person{
    public void eat(){
        System.out.println("吃米饭");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}


//留学生
class OverseaStudents extends Person{
    public void lunch(){
        this.eat();
        this.drink();


        super.eat();
        super.drink();
    }
    @Override  //重写父类的方法
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}





class Student extends Person{
    public void lunch(){
        eat();
        drink();
    }
}
