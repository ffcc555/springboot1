package ch.ch68;

public class ch69_2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 788, 9};
        int max = getMax(arr);

        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max =arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

}
