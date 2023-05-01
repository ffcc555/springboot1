package ch.ch81.ch_private;

public class ch83_1 {
    public static void main(String[] args) {
        Fridendtest f =new Fridendtest();
        f.setName("li");
        f.setAge(18);
        f.setGender("nv");

//
        String name = f.getName();
        System.out.println(name+" 123");
        //
        System.out.println(f.getName());
        System.out.println(f.getAge());
        System.out.println(f.getGender());

    }
}
