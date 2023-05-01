package String;

public class ch1014_1 {
    public static void main(String[] args) {
        String idNum = "350322200112086218";
        String birth = idNum.substring(6, 14);
        System.out.println(birth);
        String year = birth.substring(0, 4);
        String month = birth.substring(4, 6);
        String day = birth.substring(6);
        System.out.println(year+"年"+month+"月"+day+"日");
        char gender = idNum.charAt(16);
        int genderNumber = gender ;
//        System.out.println(gender);
        genderNumber = genderNumber %2;
        if(genderNumber ==1){
            System.out.println("男");
        }else {
            System.out.println("女");
        }
    }

}
