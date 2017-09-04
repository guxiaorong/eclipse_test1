package stumanager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StuAddDialog extends JDialog implements ActionListener{

	JPanel jp1=null;
	JPanel jp2=null;
	JLabel jl1=null;
	JLabel jl2=null;
	JLabel jl3=null;
	JLabel jl4=null;
	JLabel jl5=null;
	JLabel jl6=null;
	JTextField jtf1=null;
	JTextField jtf2=null;
	JTextField jtf3=null;
	JTextField jtf4=null;
	JTextField jtf5=null;
	JTextField jtf6=null;
	JButton jb1=null;
	JButton jb2=null;
	
	public StuAddDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		jp1=new JPanel();
		jp2=new JPanel();
		jp1.setLayout(new GridLayout(6,2));
		JLabel jl1=new JLabel("学号:");
		JLabel jl2=new JLabel("姓名:");
		JLabel jl3=new JLabel("性别:");
		JLabel jl4=new JLabel("年龄:");
		JLabel jl5=new JLabel("籍贯:");
		JLabel jl6=new JLabel("系别:");
		JTextField jtf1=new JTextField(10);
		JTextField jtf2=new JTextField(10);
		JTextField jtf3=new JTextField(10);
		JTextField jtf4=new JTextField(10);
		JTextField jtf5=new JTextField(10);
		JTextField jtf6=new JTextField(10);
		jb1=new JButton("添加");
		jb2=new JButton("重置");
		
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		jp1.add(jl3);
		jp1.add(jtf3);
		jp1.add(jl4);
		jp1.add(jtf4);
		jp1.add(jl5);
		jp1.add(jtf5);
		jp1.add(jl6);
		jp1.add(jtf6);
		jp2.add(jb1);
		jp2.add(jb2);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setSize(150,210);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
