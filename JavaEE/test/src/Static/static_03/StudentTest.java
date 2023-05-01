package Static.static_03;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangsan",15,"nan");
        Student stu2 = new Student("lisi",18,"nv");
        Student stu3 = new Student("wangwu",20,"nan");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxStuAge = studentUtil.getMaxStu(list);
        System.out.println(maxStuAge);
    }
}
