package ch.ch68;

public class ch75_1 {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5};
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}
