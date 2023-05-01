package ch.ch81.ch_private;
//private
//this
public class Fridendtest {


    private String name;
    private int age;
    private String gender;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>=18&&age<=50){
            this.age =age ;
        }else{
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender){

        this.gender =gender;
    }
    public String getGender(){
        return gender;
    }
}
