package z136_interface.interface_02;

public class BasketballSporter extends Sporter{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("basketball , study");
    }
}
