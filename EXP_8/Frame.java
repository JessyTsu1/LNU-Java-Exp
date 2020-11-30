package EXP_8;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Frame {
//显示界面的方法
    public void showFrame() {
//创建窗体对象
        JFrame loginFrame = new JFrame();
//设置窗体的对象，属性，大小，显示在中间,退出时结束程序
        loginFrame.setSize(500, 510);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//设置窗体的布局方式，采用流式布局(一层满换到下一层)
        FlowLayout flowl = new FlowLayout();
        loginFrame.setLayout(flowl);
//创建图片对象
        ImageIcon icon_top = new ImageIcon("/Users/jessytsui/Pictures/备份/fireworks.jpg");
//怎么改变图片大小？没有设置大小的函数
//创建图片标签对象
        JLabel ImagLabel = new JLabel(icon_top);
//创建尺寸对象
        Dimension ImagLabelSize = new Dimension(700, 230);
//设置标签大小
        ImagLabel.setPreferredSize(ImagLabelSize);
//添加标签到窗体上
        loginFrame.add(ImagLabel);
//创建账号标签
        JLabel label = new JLabel("QQ号码/手机号/邮箱:");
//添加标签到窗体上
        loginFrame.add(label);
//创建输入框对象
        JTextField nameinput = new JTextField(30);
//添加输入框到窗体
        loginFrame.add(nameinput);
//创建密码标签
        JLabel Pwlabel = new JLabel("密码：");
//创建尺寸对象
        Dimension PwlabelSize = new Dimension(120, 50);
//设置标签大小
        Pwlabel.setPreferredSize(PwlabelSize);
//添加标签到窗体上
        loginFrame.add(Pwlabel);
//创建密码框
        JPasswordField Pwordinput = new JPasswordField(30);
//添加密码框到窗体
        loginFrame.add(Pwordinput);
//添加复选框
        JCheckBox choose = new JCheckBox();
        choose.setText("自动登陆");
//添加复选框到窗体
        loginFrame.add(choose);
//添加复选框
        JCheckBox choose_2 = new JCheckBox();
        choose_2.setText("记住密码");
//添加复选框到窗体
        loginFrame.add(choose_2);
//创建按钮标签
        JButton land = new JButton("登陆");
//创建尺寸对象
        Dimension landSize = new Dimension(400, 50);
//设置标签大小
        land.setPreferredSize(landSize);
//添加标签到窗体上
        loginFrame.add(land);
//设置窗体可见
        loginFrame.setVisible(true);
    }
//主方法
    public static void main(String args[]) {
//创建界面类对象
        Frame fe = new Frame();
//调用显示界面的方法.
        fe.showFrame();
    }

}
