package string_test.stringbuilder;
//链式编程
public class springbuilder_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aa").append("bb");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);



    }




}
