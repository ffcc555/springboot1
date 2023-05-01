package ch.OOP.Students;

public class StudentsTest {
    public static void main(String[] args) {
        Students[] arr = new Students[3];
        Students stu1 = new Students(1, "chen", 18);
        Students stu2 = new Students(2, "li", 20);
        Students stu3 = new Students(3, "huang", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Students stu4 = new Students(4, "wu", 38);
        boolean flag = contains(arr, stu4.getNumber());
        if (flag) {
            System.out.println("当前学号重复，请修改学号后再添加");
        } else {
            //不存在
            //1.数组已经存满，需创建长度+1的新数组
            //2.数组未存满，可以直接添加
            int count = getCount(arr);
            if(count == arr.length){
                //已经存满
                Students[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printarr(newArr);

            }else {
                //还未存满//遍历数组信息 newArr？arr？
                arr[count] = stu4;
                printarr(arr);
            }
        }
        System.out.println();
        //要删除的id，如果存在删除此id，如果不存在提示删除失败
        int index = getIndex(arr,1);
        if(index >=0){
            arr[index] = null;
            printarr(arr);
        }else{
            System.out.println("当前number不存在，删除失败");
        }
        System.out.println();
        //查询id为2的学生信息，如果有将他的年龄+1
        int index1 = getIndex(arr, 2);

        if(index1 >=0){
           Students stu = arr[index1];
           int newAge = stu.getAge() +1;
           stu.setAge(newAge);
           printarr(arr);
        }else {
            System.out.println("当前id不存在，无法修改");
        }



    }
    public  static int getIndex(Students[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            Students stu = arr[i];
            if(stu != null){
                int sid = stu.getNumber();
                if(sid == number){
                    return i;//返回索引
                }

            }
        }
        return -1;
    }

    public static void printarr(Students[] arr){
        for (int i = 0; i < arr.length; i++) {
            Students stu = arr[i];
            if(stu != null){
                System.out.println(stu.getNumber()+","+stu.getName()+","+stu.getAge());
            }
        }
    }


    public static Students[] creatNewArr(Students[] arr){
        Students[] newArr =  new Students[arr.length +1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int getCount(Students[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }




    public static boolean contains(Students[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            Students stu = arr[i];
            if(stu !=null){
                int sid = stu.getNumber();
                if (sid == number) {
                    return true;
                }
            }

        }
        return false;
    }

}
