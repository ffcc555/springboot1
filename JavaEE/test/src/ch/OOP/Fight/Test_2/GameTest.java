package ch.OOP.Fight.Test_2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("A",100,'男');
        Role r2 = new Role("B",100,'男');

        r1.showRoleInfo();
        r2.showRoleInfo();

        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "  K.O  " + r2.getName());
                break;
            }
            while(true){
                r2.attack(r1);
                if(r1.getBlood() == 0){
                    System.out.println(r2.getName()+"  K.O  " + r1.getName());
                }
                break;
            }
        }
    }
}
