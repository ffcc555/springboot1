package StudentSystem;

import java.awt.*;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        System.out.println("----------欢迎来到学生管理系统----------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择");

        loop:
        while (true) {
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                    queryStudent(list);
                    break;
                case "5": {
                    System.out.println("5.退出");
//                    break loop;
                    System.exit(0);  //停止虚拟机运行
                }
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
//        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("id已经存在，请重新录入");
            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生name");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入学生age");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生address");
        String address = sc.next();
        s.setAddress(address);
        list.add(s);
        System.out.println("学生信息添加成功");
    }

    public static void deleteStudent(ArrayList<Student> list) {
//        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生编号：");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的学生信息删除成功");
        } else {
            System.out.println("id不存在，返回初始菜单");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
//        System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("要修改的id不存在，返回主菜单");
        } else {
            Student stu = list.get(index);

            System.out.println("请输入要修改学生的姓名");
            String newName = sc.next();
            stu.setName(newName);

            System.out.println("请输入要修改学生的年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);

            System.out.println("请输入要修改学生的地址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("学生信息修改成功！");
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
//        System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询。");
            return;
        }

        System.out.println("id\t\tname\tage\t\tadress");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        if (getIndex(list, id) > 0) {
            return true;
        }
        return false;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
