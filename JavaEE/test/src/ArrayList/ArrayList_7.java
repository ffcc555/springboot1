package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_7 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Object o1 = new Object("1", "zhangsan", "123");
        Object o2 = new Object("2", "lisi", "qwe");
        Object o3 = new Object("3", "wangwu", "dfa");

        list.add(o1);
        list.add(o2);
        list.add(o3);

//        Scanner sc = new Scanner(System.in);
//        String id = sc.next();
//        System.out.println("请输入查询id");
//        boolean flag = contains(list, id);
//        System.out.println(flag);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查询id");
        String id = sc.next();
        int index = getIndex(list, id);
        System.out.println(index);
    }

    //根据id找用户的信息
    public static boolean contains(ArrayList<Object> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }


    public static int getIndex(ArrayList<Object> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }


}




