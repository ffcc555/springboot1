package ch.ch68;

import java.util.Random;

public class ch75 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }

        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int random_index = r.nextInt(chs.length);//随机索引
//            System.out.println(chs[random_index]);
            result = result + chs[random_index];
        }
        int number = r.nextInt(10);
        result =result+number;
        System.out.print(result);



//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]);
//        }


    }
}
