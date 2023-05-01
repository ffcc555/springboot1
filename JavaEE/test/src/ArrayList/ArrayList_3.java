package ArrayList;

import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(i==list.size() - 1){
                System.out.print(str);
            }else{
                System.out.print(str+",");
            }
        }
        System.out.print("]");
    }
}
