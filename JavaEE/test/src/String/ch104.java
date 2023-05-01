package String;

public class ch104 {
    public static void main(String[] args) {
        String phonenumber = "17359039985";
        String start = phonenumber.substring(0, 3);
        String end = phonenumber.substring(7);
        String finsh = start + "****" +end;
        System.out.println(finsh);
    }
}
