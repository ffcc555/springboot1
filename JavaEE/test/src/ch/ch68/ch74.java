package ch.ch68;

import java.util.Scanner;

public class ch74 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入票价：");
        int ticket = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入仓位：0-头等舱，1-经济舱");
        int seat = sc.nextInt();


        if(month>=5&&month<=10){
            //旺季
            ticket = GetPrice(ticket,seat,0.9,8.5);
        }else if((month>=1&&month<=4)||(month>=11&&month<=12)){
            //淡季
            ticket = GetPrice(ticket,seat,0.7,0.65);
        }else{
            System.out.println("请输入正确的月份！");
        }

        System.out.println(ticket);

    }

    public static int GetPrice(int ticket,int seat,double v1,double v2) {
        if(seat == 0){
            ticket =(int) (ticket * v1);
        }else if(seat == 1){
            ticket =(int) (ticket * v2);
        }else{
            System.out.println("请输入正确的仓位！");
        }
        return ticket;
    }










}
