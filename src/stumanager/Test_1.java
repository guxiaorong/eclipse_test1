package stumanager;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class Test_1 extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	JTable jtTable=null;
	JScrollPane jsp=null;
	Vector rowdata,columNames;
	
	JPanel jp1=null;
	JTextField jtf1=null;
	JLabel jl1=null;
	JButton jb1=null;
	
	JPanel jp2=null;
	JButton jb2=null;
	JButton jb3=null;
	JButton jb4=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_1 test_1=new Test_1();

	}
	
	public Test_1()
	{
		/*NORTH*/
		jp1=new JPanel();
		jtf1=new JTextField(10);
		jl1 =new JLabel("学号");
		jb1=new JButton("查询");
		jb1.addActionListener(this);
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jb1);
		/*SOUTH*/
		jp2=new JPanel();
		jb2=new JButton("添加");
		jb3=new JButton("修改");
		jb4=new JButton("删除");
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		/* CENTER :JTable*/
		columNames=new Vector();
		columNames.add("学号");
		columNames.add("姓名");
		columNames.add("性别");
		columNames.add("年龄");
		columNames.add("系别");
		
		rowdata=new Vector();
		Vector hang=new Vector();
		hang.add("1001");
		hang.add("james");
		hang.add("男");
		hang.add("18");
		hang.add("自动化");
		rowdata.add(hang);
		hang=new Vector();
		hang.add("1002");
		hang.add("kate");
		hang.add("女");
		hang.add("17");
		hang.add("计算机");
		rowdata.add(hang);
		
		jtTable=new JTable(rowdata,columNames);
		jsp=new JScrollPane(jtTable);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jsp,BorderLayout.CENTER);
		this.add(jp2,BorderLayout.SOUTH);
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)
		{
			System.out.println("执行查询");
		}
		else if(e.getSource()==jb2)
		{
			System.out.println("执行添加");
			StuAddDialog sadAddDialog=new StuAddDialog(this, "新增信息", false);
		}
		else if(e.getSource()==jb3)
		{
			System.out.println("执行修改");
		}
		else if(e.getSource()==jb4)
		{
			System.out.println("执行删除");
		}
	}

}
