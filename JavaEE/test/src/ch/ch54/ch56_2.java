package ch.ch54;

public class ch56_2 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                arr[i] = arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
