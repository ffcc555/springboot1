package ArrayList;

import java.util.ArrayList;

public class ArrayList_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if(i==list.size() - 1){
                System.out.print(integer);
            }else{
                System.out.print(integer+",");
            }
        }
        System.out.print("]");
    }
}
