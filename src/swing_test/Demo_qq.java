package swing_test;
import javax.swing.*;
import java.awt.*;

public class Demo_qq extends JFrame {

	/**
	 * @param args
	 */
	JLabel jlb1;
	
	JPanel jp1;
	JButton jb1,jb2,jb3;
	
	JTabbedPane jtp1;
	JPanel jp2,jp3,jp4;
	JCheckBox jcb1,jcb2;
	JLabel jlb2,jlb3,jlb4,jlb5;
	JTextField jtf1;
	JPasswordField jpf1;
	JButton jb4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo_qq();

	}
	
	public Demo_qq()
	{
		jlb1 = new JLabel("qq  login page!",JLabel.CENTER);
		jlb1.setSize(300, 50);
		jlb1.setBackground(Color.GREEN);
		jlb1.setForeground(Color.BLACK);
		
		jlb2 = new JLabel("号码",JLabel.CENTER);
		jlb3 = new JLabel("密码",JLabel.CENTER);
		jlb4 = new JLabel("忘记密码",JLabel.CENTER);
		jlb4.setFont(new Font("宋体", Font.PLAIN, 16));
		jlb4.setForeground(Color.BLUE);
		jlb5 = new JLabel("<html><a href='www.qq.com'>申请密码保护</a></html>",JLabel.CENTER);
		jlb5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jb4 = new JButton("清空号码");
		jtp1 = new JTabbedPane();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp3.setBackground(Color.BLACK);
		jp4 = new JPanel();
		jp4.setBackground(Color.RED);
		jtf1 = new JTextField(10);
		jpf1 = new JPasswordField(10);
		jcb1 = new JCheckBox("隐身登陆");
		jcb2 =new JCheckBox("记住密码");
		
		jtp1.add("QQ号码",jp2);
		jtp1.add("电话号码",jp3);
		jtp1.add("邮箱",jp4);
		
		jp2.setLayout(new GridLayout(3,3));
		jp2.add(jlb2);
		jp2.add(jtf1);
		jp2.add(jb4);
		jp2.add(jlb3);
		jp2.add(jpf1);
		jp2.add(jlb4);
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jlb5);
		
		
		jp1 = new JPanel();
		jb1 = new JButton("登陆");
		jb2 = new JButton("退出");
		jb3 = new JButton("注册");
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);		
		
		this.add(jlb1,BorderLayout.NORTH);
		this.add(jp1,BorderLayout.SOUTH);
		this.add(jtp1,BorderLayout.CENTER);
		this.setTitle("QQ");
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true) ;
		
	}
	
}
