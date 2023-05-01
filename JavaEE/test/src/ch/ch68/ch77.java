package ch.ch68;

public class ch77 {
    public static void main(String[] args) {
        int number =1983;
        int temp =number;
        int count =0;
        while (temp!=0){
            temp =temp/10;
            count++;
        }
        int[] farr=new int[count];
        for (int i = 0; i < farr.length; i++) {
            farr[i] =number%10;
            number =number/10;
        }
//        for (int i = 0; i < farr.length; i++) {
//            System.out.print(farr[i]+" ");
//        }
//        System.out.println();
        for (int i = 0 ,j=farr.length-1; i < j; i++,j--) {
            int temp1;
            temp1 = farr[i];
            farr[i] = farr[j];
            farr[j] = temp1;
        }
//        for (int i = 0; i < farr.length; i++) {
//            System.out.print(farr[i]+" ");
//        }
        int[] arr =new int[farr.length];
        for (int i = 0; i < farr.length; i++) {
            arr[i] =farr[i];
        }
















//        int[]arr ={1,9,8,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]%10;
        }
        for (int i = 0 ,j=arr.length-1; i < j; i++,j--) {
            int temp3;
            temp3 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp3;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }





    }









}
