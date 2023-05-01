package ArrayList;

import java.util.ArrayList;

public class ArrayList_5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student("zhangsan",21);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("wangwu",26);
        Student s4 = new Student("maliu",18);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
