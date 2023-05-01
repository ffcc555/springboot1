package string_test.stringbuilder;

public class stringbuilder_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String str = arrToString(arr);
        System.out.println(str);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr.length) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
