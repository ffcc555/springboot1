package UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {

    //创建二位数组
    int[][] data = new int[4][4];
    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    public GameJFrame() {
        //初始化界面
        inintJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱
        initData();

        //初始化图片（根据打乱后的图片
        inintImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }


    //打乱代码
    private void initData() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }
    }

    //初始化图片
    private void inintImage() {
        //清空原本已经出现的图片
        this.getContentPane().removeAll();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                //创建一个JLabel对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon("puzzleGame\\image\\animal\\animal3\\" + number + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器中添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        //添加背景图片
        ImageIcon bg = new ImageIcon("puzzleGame\\image\\background.png");
        JLabel background = new JLabel(bg);
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    //初始化菜单
    private void initJMenuBar() {
        //初始化对象
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上的两个选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建菜单下面的条目
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //将每一个选项下的条目 组合在一起
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //菜单里两个选项添加到功能中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void inintJFrame() {
        //      创建一个游戏主界面
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消默认的居中位置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //左37 上38 右39 下40
        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y--;
            //调用方法按照最新的数字加载图片
            inintImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            //调用方法按照最新的数字加载图片
            inintImage();
        } else if (code == 39) {
            System.out.println("向右移动");
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            //调用方法按照最新的数字加载图片
            inintImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            //调用方法按照最新的数字加载图片
            inintImage();
        }
    }
}
