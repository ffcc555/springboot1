package UI;

import javax.swing.*;

public class LogimJFrame extends JFrame {

    public LogimJFrame(){
        //      创建一个登录界面
        this.setSize(488,430);
        //设置界面标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(3);
        //让界面显示出来，建议写在最后
        this.setVisible(true);

    }

}
