package ArrayList;

import java.util.ArrayList;

//        list.add("aaa");
//        list.remove("bbb");
//        list.remove(0,"bbb");
//        list.set("ccc");
//        list.get(0);
public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();

        boolean flagAdd = list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        System.out.println("flagAdd: "+flagAdd);
        System.out.println(list);

//        boolean flagRemove1 = list.remove("aaa");
//        boolean flagRemove2 = list.remove("ddd");
//        System.out.println("flagRemove1: "+flagRemove1);
//        System.out.println("flagRemove2: "+flagRemove2);//删除失败的时候
//        System.out.println(list);
//
//        String str = list.remove(0);//根据索引删除
//        System.out.println(str);
//        System.out.println(list);

//        修改元素
//        String revise = list.set(0, "ddd");
//        System.out.println(revise);//将被覆盖的元素返回
//        System.out.println(list);

//        查询元素
//        String get = list.get(2);
//        System.out.println(get);


//        遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }





    }
}
