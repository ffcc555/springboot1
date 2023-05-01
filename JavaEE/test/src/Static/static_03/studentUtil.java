package Static.static_03;

import java.util.ArrayList;

public class studentUtil {
    private studentUtil(){}

    public static int getMaxStu(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i).getAge();
            if(temp > max){
                max= temp;
            }
        }
        return max;
    }
}
