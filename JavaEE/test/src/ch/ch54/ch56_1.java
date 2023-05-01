package ch.ch54;

public class ch56_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3 == 0){
                index++;
            }
        }
        System.out.println(index);
    }
}
