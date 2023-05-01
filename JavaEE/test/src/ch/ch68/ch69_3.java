package ch.ch68;

public class ch69_3 {
    public static void main(String[] args) {
        int[] arr ={1,5,8,9,66,78,99};

        boolean flag =contains(arr,89);
        System.out.println(flag);

    }
    public static boolean contains(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }

}
