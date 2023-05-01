package Static.static_02;

public class ArrraryTest {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7};
        String s = ArraryUtil.printArr(arr1);
        System.out.println(s);

        double[] arr2 = {25.6,26.8,45.5,12.5};
        double average = ArraryUtil.getAverage(arr2);
        System.out.println(average);
    }
}
