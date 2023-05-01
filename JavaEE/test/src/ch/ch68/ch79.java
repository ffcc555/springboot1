package ch.ch68;

import java.util.Random;
import java.util.Scanner;

public class ch79 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.print("中奖号码为："+" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("======================");
        int[] userNumberArr = getuserNumber();
        System.out.println("用户输入的所有号码为" );
        for (int i = 0; i < userNumberArr.length; i++) {
            System.out.print(userNumberArr[i] + " ");
        }

        int redCOUNT =0;
        int blueCOUNT =0;
        //判断红球中奖个数
        for (int i = 0; i < userNumberArr.length -1; i++) {
//            int rednumber = userNumberArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if(userNumberArr[i] == arr[j]){
                    redCOUNT++;
                    break;
                }
            }
        }
        //判断蓝球中奖个数
        int bluenumber =userNumberArr[userNumberArr.length-1];
        if(bluenumber == arr[arr.length -1]){
            blueCOUNT++;
        }

        System.out.println();
        System.out.println("红球中奖个数：" + redCOUNT +"个");
        System.out.println("蓝球中奖个数 "+blueCOUNT+"个");



        if(redCOUNT == 6 ){
            if(blueCOUNT ==1){
                System.out.println("一等奖");
            }
            else if(blueCOUNT == 0){
                System.out.println("一等奖");
            }
        }else if(redCOUNT == 5&& blueCOUNT == 1){
            System.out.println("三等奖");
        }else if((redCOUNT == 5&& blueCOUNT == 0)||(redCOUNT == 4&& blueCOUNT == 1)){
            System.out.println("四等奖");
        }else if((redCOUNT == 4&& blueCOUNT == 0)||(redCOUNT == 3&& blueCOUNT == 1)){
            System.out.println("五等奖");
        }else if((redCOUNT == 2&& blueCOUNT == 1)||(redCOUNT == 1&& blueCOUNT == 1)||(redCOUNT == 0&& blueCOUNT == 1)){
            System.out.println("六等奖");
        }else {
            System.out.println("未中奖");
        }



    }


    public static int[] createNumber() {

        int[] arr = new int[7];
        Random r = new Random();
        //获取红球号码
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33) + 1 ;
            boolean flag = contain(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //获取蓝球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length -1] = blueNumber;
        return arr;
    }

    //判断数是否在数组中存在
    public static boolean contain(int[] arr , int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }

        }
        return false;
    }

    public static int[] getuserNumber() {
        int[] arr =new int[7];
        //
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.print("请输入第"+(i+1)+"个红球号码：");
            int redNumber = sc.nextInt();
            if(redNumber>=1&&redNumber<=33){
                boolean flag = contain(arr,redNumber);
                if(!flag){
                    //不存在 是有效的号码
                    arr[i] = redNumber;
                    i++;
                }else {
                    System.out.println("当前输入的红球号码无效，请重新输入！");
                }

            }else {
                System.out.println("当前红球号码超出范围！");
            }

        }
        while (true){
            System.out.print("请输入蓝球号码：");//1-16
            int blueNumber = sc.nextInt() ;
            if(blueNumber>=1&&blueNumber<=16){
                arr[arr.length -1] = blueNumber;
                break;
            }else {
                System.out.println("输入的蓝球号码无效，请重新输入：");
            }

        }
        return arr;
    }









}
