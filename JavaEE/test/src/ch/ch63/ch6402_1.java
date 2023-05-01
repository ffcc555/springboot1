package ch.ch63;

public class ch6402_1 {
    public static void main(String[] args) {
        System.out.println("a");
        methon01();
        System.out.println("b");
    }
    public static  void methon01(){
        methon02();
        System.out.println("c");
    }

    public static void methon02() {
        System.out.println("d");
        System.out.println("e");
    }
}
//a,d,e,c   ,b