import java.util.Scanner;

public class Banker {
    static int pcb_nums;  // 进程数量
    static int res_nums;  // 资源种类数量
    static int max[][];     // 最大需求资源向量
    static int alloc[][];   // 拥有资源数向量
    static int need[][];    // 还需要资源数向量
    static int ava[];     // 可用资源数向量
    static int request[];  //本次申请的资源量
    static int safe_seq[]; //安全序列数组
    static boolean[] finish;
    static int[] work;//进程可用的资源数
    static int[][] works;//用于打印每个进程的work信息

    static void bank_init() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入进程数量：");
        pcb_nums = in.nextInt();
        System.out.println("请输入资源数量");
        res_nums = in.nextInt();
        safe_seq = new int[pcb_nums + 1];
        max = new int[pcb_nums][res_nums];
        alloc = new int[pcb_nums][res_nums];
        need = new int[pcb_nums][res_nums];
        ava = new int[res_nums];     // 可用资源
        System.out.println("请输入最大资源：");
        for (int i = 0; i < pcb_nums; i++) {
            for (int j = 0; j < res_nums; j++) {
                max[i][j] = in.nextInt();
            }
        }
        System.out.println("请输入分配资源：");
        for (int i = 0; i < pcb_nums; i++) {
            for (int j = 0; j < res_nums; j++) {
                alloc[i][j] = in.nextInt();
            }
        }
        //计算需求矩阵
        for (int i = 0; i < pcb_nums; i++) {
            for (int j = 0; j < res_nums; j++) {
                need[i][j] = max[i][j] - alloc[i][j];
            }
        }
        System.out.println("请输入可用资源:");
        for (int j = 0; j < res_nums; j++) {
            ava[j] = in.nextInt();
        }
    }

    //比较进程为m中的元素全大于n中的元素
    static boolean compare(int m[], int n[]) {
        for (int i = 0; i < res_nums; i++) {
            if (m[i] < n[i])
                return false;
        }
        return true;
    }

    static boolean safe() {
        works=new int[pcb_nums][res_nums];
        work = new int[res_nums];
        finish = new boolean[pcb_nums];
        safe_seq = new int[pcb_nums];
        int num = 0; // 已分配进程的个数
        int l = 0;
        // 定义一个work数组来存储available，因为work中途会发生变化，不确定是否为最终结果
        for (int i = 0; i < res_nums; i++) {
            work[i] = ava[i];
            works[0][i]=ava[i];
        }
        for (int i = 0; i < pcb_nums; i++) {
            finish[i] = false;
        }
        /* 核心算法有多少个进程就循环多少次，每次循环遍历need一次，若满足条件，释放资源后num+1 */
        for (int i = 0; i < pcb_nums; i++) {
            if (num == pcb_nums) break;// 若进程已全部加入分配完成
            for (int j = 0; j < pcb_nums; j++) {
                if (finish[j]) {//若该进程已经完成则跳过这个进程
                    continue;
                }else {
                    if (compare(work, need[j])) {//将work即可用的资源与该进程的need比较，work大于即可进入分配
                        finish[j] = true; // 将进程j标记为已分配
                        // 将进程j加入安全序列
                        safe_seq[l++] = j;
                        num++;
                        // 释放进程资源
                        for(int e=0;e<3;e++) {
                            works[j][e]=work[e];//把当前的word记录到words
                        }
                        for (int k = 0; k < res_nums; k++) {
                            work[k] = work[k] + alloc[j][k];
                        }
                    }
                }
            }
        }
        //查看是否有进程为false有则不安全
        for (int i = 0; i < pcb_nums; i++) {
            if (!finish[i])
                return false;
        }
        show(2);
        // 输出安全序列
        System.out.print("安全序列为：");
        for (int i = 0; i < pcb_nums; i++) {
            System.out.print(safe_seq[i] + " ");
        }
        System.out.println();
        return true;
    }

    static void show(int select) {
        if(select==1) {
            System.out.println("状态表：");
            System.out.println("Process\t\t\t|Max\t\t\t|Allocation\t\t\t|Need\t\t\t|Available\t|");
            for(int i = 0;i<pcb_nums;i++){
                System.out.print(i+"                ");
                for(int m = 0;m<res_nums;m++)System.out.print(max[i][m]+"  ");//max
                System.out.print("        ");
                for(int m = 0;m<res_nums;m++) System.out.print(alloc[i][m]+"  ");//allocation
                System.out.print("        ");
                for(int m = 0;m<res_nums;m++) System.out.print(need[i][m]+"  "  );//need
                System.out.print("        ");
                for(int m = 0;m<res_nums;m++) {
                    if (i==0) {
                        System.out.print(ava[m]+"   ");
                    }
                }
                System.out.println();
            }
        }else {
            System.out.println("安全序列表：");
            System.out.println("Process\t\t\t|Work\t\t\t|Need\t\t\t|Allocation\t\t|Work+Allocation\t\t|Finish");
            for(int temp:safe_seq) {
                System.out.print(temp+"                ");
                for(int m = 0;m<res_nums;m++)System.out.print(works[temp][m]+"  ");//max
                System.out.print("        ");
                for(int m = 0;m<res_nums;m++) System.out.print(need[temp][m]+"  "  );//need
                System.out.print("        ");
                for(int m = 0;m<res_nums;m++) System.out.print(alloc[temp][m]+"  ");//allocation
                System.out.print("        ");
                for(int m = 0;m<res_nums;m++)System.out.print(alloc[temp][m]+works[temp][m]+"  ");//max
                System.out.print("             "+finish[temp]+"  ");
                System.out.print("        ");
                System.out.println();
            }
        }
    }
    static void resafe(int n){
        //available>=request 并且 need >=request
        if (compare(ava,request) && compare(need[n-1],request)){
            for (int i = 0; i < res_nums; i++) {
                alloc[n-1][i] =alloc[n-1][i] + request[i];
                need[n-1][i] = need[n-1][i] - request[i];
                ava[i] = ava[i] - request[i];
            }
            if (safe()){
                System.out.println("允许进程"+n+"申请资源");
            }
            else{
                System.out.println("不允许进程"+n+"申请资源");
                for (int i = 0; i < res_nums; i++) {
                    alloc[n-1][i] = alloc[n-1][i] - request[i];
                    need[n-1][i] = need[n-1][i] + request[i];
                    ava[i] = ava[i] + request[i];
                }
            }
        }
        else
            System.out.println("申请资源量越界");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //进程编号
        int n;
        bank_init();
        show(1);
        if (safe()) {
            System.out.println("  存在安全序列，初始状态安全。");
        } else{
            System.out.println("不存在安全序列，初始状态不安全。");
        }
        System.out.println("请输入发出请求向量request的进程编号：");
        n = in.nextInt();
        request = new int[res_nums];
        System.out.println("请输入请求向量request:");
        for (int i = 0; i < res_nums; i++) {
            request[i] = in.nextInt();
        }
        resafe(n);


    }
}
