package Static.static_02;

public class ArraryUtil {
    private ArraryUtil(){}

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr.length ){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum / arr.length;
    }

}
