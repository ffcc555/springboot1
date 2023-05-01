package ch.OOP.GirlFriend;

public class GirlFriendsTest {
    public static void main(String[] args) {
        GirlFriends[] arr = new GirlFriends[4];

        GirlFriends gf1 = new GirlFriends("A",18,"女","a1");
        GirlFriends gf2 = new GirlFriends("B",20,"女","b2");
        GirlFriends gf3 = new GirlFriends("C",22,"女","c3");
        GirlFriends gf4 = new GirlFriends("D",17,"女","d4");

        int sum = 0;
        //把对象添加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        for (int i = 0; i < arr.length; i++) {
            GirlFriends gf = arr[i];
            sum  += gf.getAge();
        }

        int avg = sum /arr.length;
        System.out.println("avg="+avg);


        int count =0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriends gf = arr[i];
            if(gf.getAge()<avg){
                count ++;
                System.out.println("名字为"+gf.getName());
            }
        }

        System.out.println(count);
    }
}
