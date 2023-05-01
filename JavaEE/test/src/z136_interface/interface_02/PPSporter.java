package z136_interface.interface_02;

public class PPSporter extends Sporter implements English{
    public PPSporter() {
    }

    public PPSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("pps,speak english");
    }

    @Override
    public void study() {
        System.out.println("pps, study");
    }
}
