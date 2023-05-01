package z136_interface.interface_02;

public class ppCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("ppCoach,teach");

    }

    @Override
    public void speakEnglish() {
        System.out.println("ppCoach, speak english");
    }
}
