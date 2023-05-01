package z140.demo02;

public class Test {
    public static void main(String[] args) {

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头（匿名内部类重写）");
                    }
                }
        );

    }



    public static void method(Animal a ){
        a.eat();
    }

}

