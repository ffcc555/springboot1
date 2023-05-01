package ch.ch68;

import java.util.Scanner;

public class ch76 {
    public static void main(String[] args) {
        int[] scorearr = getscore();
        for (int i = 0; i < scorearr.length; i++) {
            System.out.print(scorearr[i]+" ");
        }
        System.out.println();
        int max =getmax(scorearr);
        int min =getmin(scorearr);
        int sum =getsum(scorearr);
        int avg = (sum-max-min) /(scorearr.length-2);
        System.out.println("avg="+avg);

    }

    public static int[] getscore() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委打分："+"("+i+")");
            int score =sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("你输入的数据超出了范围，请重新输入");
            }
        }
        return scores;
    }

    public static int getmax(int[] scorearr) {
        int max =scorearr[0];
        for (int i = 0; i < scorearr.length; i++) {
            if(scorearr[i]>max){
                max=scorearr[i];
            }
        }
        return max;
    }

    public static int getmin(int[] scorearr) {
        int min =scorearr[0];
        for (int i = 0; i < scorearr.length; i++) {
            if(scorearr[i]<min){
                min=scorearr[i];
            }
        }
        return min;
    }

    public static int getsum(int[] scorearr) {
        int sum =0;
        for (int i = 0; i < scorearr.length; i++) {
            sum=sum+scorearr[i];
        }
        return sum;
    }

}
