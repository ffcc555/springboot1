package ch.ch54;
//数组反转
public class ch56_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp;
        for (int i=0,j=arr.length-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
