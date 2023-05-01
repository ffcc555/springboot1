package ch.ch68;

public class ch70 {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8};

        int[] copyarr = copy(arr,3,6);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i]+" ");
        }
    }

    public static int[] copy(int[] arr,int from,int to) {
//        int[] arr =new int[]{1,2,3,4};
        int[] newarr =new int[to -from];

        int index = 0;
        for (int i = from; i < to; i++) {
            newarr[index] =arr[i];
            index++;
        }
        return newarr;
    }

}
