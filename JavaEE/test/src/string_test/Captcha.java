package string_test;

import java.util.Random;

public class Captcha {

    public static void main(String[] args) {
        String[] arrAlphabet = {"A","a","B","b","C","c","D","d","E","d","F","f", "G","g",
                "H","h","I","i","J","j","K","k","L","l","M","m","N","n","O","o","P","p","Q","q",
                "R","r","S","s","T","t","U","u","V","v","W","w","X","x","Y","y","Z","z"};
        String[] Captcha =  new String[5];
        for (int i = 0; i < 4; i++) {
            String alphabet = getAlphabet(arrAlphabet);
            Captcha[i]= alphabet;
            System.out.print(Captcha[i]);
        }
        System.out.println();
        int num = getNum();
        String number = Integer.toString(num);
        Captcha[Captcha.length -1] = number;
        changeArr(Captcha);
        for (int i = 0; i < Captcha.length; i++) {
            System.out.print(Captcha[i]);
        }


    }
    public static String getAlphabet(String[] arr){
        Random r = new Random();
        int index = r.nextInt(52);
        String s = arr[index];
        return s;
    }
    public static int getNum(){
        Random r =new Random();
        int num = r.nextInt(9);
        return num;
    }

    public static String[] changeArr(String[] arr){
        Random r = new Random();
        int index = r.nextInt(4);
        String temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] =temp;
        }
        return arr;
    }






}
