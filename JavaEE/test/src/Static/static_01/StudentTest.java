package Static.static_01;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 =new Student();
        Student.teacherName = "老师";
        s1.setName("zhangsan");
        s1.setAge(18);
        s1.setGender("nan");
//        s1.teacherName = "老师";

        s1.study();
        s1.show();

        Student s2 =new Student();
        s2.setName("lisi");
        s2.setAge(19);
        s2.setGender("nv");

        s2.study();
        s2.show();
    }
}
