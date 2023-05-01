package ch.ch63;

public class ch66 {
    public static void main(String[] args) {
//        直接调用
//        getSum(10,20,30);
//        赋值调用
//        int sum =getSum(10,20,30);
//        System.out.println(sum);
//        输出调用
//        System.out.println(getSum(10,20,10));

        int sum1 =getSum(10,20,30);
        int sum2 =getSum(30,20,40);
        int sum3 =getSum(20,20,40);
        int sum4 =getSum(10,20,60);

        int sum =sum1+sum2+sum3+sum4;
        System.out.println(sum);


    }
    public static int getSum(int num1,int num2,int num3){
        int result =num1+num2+num3;
        return result;
    }
}
