package ch.OOP.test5_Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("xiaomi",1777,"blue");
        Phone p2 = new Phone("huawei",6666,"yellow");
        Phone p3 = new Phone("iphone",9999,"black");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }

        int avg1 = sum/arr.length;
        double avg2 = sum *1.0/arr.length;
        System.out.println(avg1);
        System.out.println(avg2);

    }
}
