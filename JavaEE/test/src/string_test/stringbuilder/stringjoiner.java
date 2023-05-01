package string_test.stringbuilder;

import java.util.StringJoiner;

public class stringjoiner {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");

        sj.add("aa").add("bb");
        System.out.println(sj);
    }
}
