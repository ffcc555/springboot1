package ch.OOP.Fight.Test_1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    public Role(){
    }

    public Role(String name , int blood){
        this.name = name;
        this.blood = blood;
    }

    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return name;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }
    public int getBlood(){
        return blood;
    }

    //    攻击方法 this攻击role
    public void attack(Role role){
        //计算伤害  1-20
        Random r =new Random();
        int hurt = r.nextInt(20) + 1;
        //挨揍人剩余的血量
        int remainBlood = role.blood - hurt;
        remainBlood = remainBlood < 0 ? 0 :remainBlood;
        //修改挨揍人剩余血量
        role.setBlood(remainBlood);

        System.out.println(this.name+"举起拳头，打了"+role.name+"一下，" +
                "造成了"+hurt+"点伤害，"+role.name+"还剩下"+remainBlood+"血量。");
    }
}
