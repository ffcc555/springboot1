package z136_interface.interface_02;

public class Test {
    public static void main(String[] args) {
        PPSporter pps = new PPSporter("zhnagsan",18);
        System.out.println(pps.getName()+","+pps.getAge());
        pps.speakEnglish();
        pps.study();
    }
}
