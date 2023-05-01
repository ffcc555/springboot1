package string_test.stringbuilder;

public class springbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("bbb");   //添加
        System.out.println(sb);

        sb.reverse();  //反转
        String str = sb.toString();  //变回字符串
        System.out.println(str);

        int len = sb.length();  // 求字符串长度
        System.out.println(len);

    }
}
