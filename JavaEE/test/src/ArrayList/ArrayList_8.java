package ArrayList;

import java.util.ArrayList;

public class ArrayList_8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1= new Phone("xiaomi",1000);
        Phone p2= new Phone("iphone",8000);
        Phone p3= new Phone("chuiz",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneinfo = getInformation(list, 3000);
        for (int i = 0; i < phoneinfo.size(); i++) {
            Phone phone = phoneinfo.get(i);
            System.out.println(phone.getBrand()+", "+phone.getPrice());
        }


    }
    public static ArrayList<Phone> getInformation(ArrayList<Phone> list,int price){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            if(list.get(i).getPrice() <=price){
                resultList.add(p);
            }
        }
        return resultList;
    }


}
