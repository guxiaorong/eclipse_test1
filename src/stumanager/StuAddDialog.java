package stumanager;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
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
		jl1=new JLabel("学号:");
		jl2=new JLabel("姓名:");
		jl3=new JLabel("性别:");
		jl4=new JLabel("年龄:");
		jl5=new JLabel("籍贯:");
		jl6=new JLabel("系别:");
        jtf1=new JTextField(10);
		jtf2=new JTextField(10);
		jtf3=new JTextField(10);
		jtf4=new JTextField(10);
		jtf5=new JTextField(10);
		jtf6=new JTextField(10);
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
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
 
		
		this.setSize(150,210);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)
		{
			System.out.println("添加操作内容");
			String sql="insert into stus values(?,?,?,?,?,?)";
			String []paras=new String[6];
			paras[0]=this.jtf1.getText().trim();
			paras[1]=this.jtf2.getText().trim();
			paras[2]=this.jtf3.getText().trim();
			paras[3]=this.jtf4.getText().trim();
			paras[4]=this.jtf5.getText().trim();
			paras[5]=this.jtf6.getText().trim();
			StuModel smModel=new StuModel();
			smModel.UpdStu(sql, paras);
			this.setVisible(false);
		}
		else if(e.getSource()==jb2)
		{
			System.out.println("重置内容");
			jtf1.setText("");
			jtf2.setText("");		 
			jtf3.setText("");
			jtf4.setText("");
			jtf5.setText("");
			jtf6.setText("");
			//jp1.repaint();
		}
	}
	

}
