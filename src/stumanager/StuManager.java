package stumanager;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class StuManager extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	JTable jtTable=null;
	JScrollPane jsp=null;
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
		StuManager stuManager=new StuManager();
		
	}

	public StuManager()
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
		
		StuModel smModel=new StuModel();
		smModel.QuyStu("select * from stus");
		jtTable=new JTable(smModel);
		//jtTable.setModel(smModel); 
    	jsp=new JScrollPane(jtTable);	
		//jtTable=new JTable(smModel); 		
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
			String stuId=this.jtf1.getText().trim();
			StuModel smModel=new StuModel();
			if(stuId.isEmpty())
			{
				String sql="select * from stus";	
				smModel.QuyStu(sql);
			}
			else 
			{
				String sql="select * from stus where StuID=?";
				String[] paras={stuId};	
				smModel.QuyStu(sql,paras);
			}					
			jtTable.setModel(smModel); 
		}
		else if(e.getSource()==jb2)
		{
			System.out.println("执行添加");
			StuAddDialog sadAddDialog=new StuAddDialog(this, "新增信息", true);
		}
		else if(e.getSource()==jb3)
		{
			System.out.println("执行修改");
		}
		else if(e.getSource()==jb4)
		{
			System.out.println("执行删除");
			StuModel smModel=new StuModel();	
			int rownum=jtTable.getSelectedRow();
			if(rownum== -1)
			{
				JOptionPane.showMessageDialog(this, "请选择一行");				
				return;
			}
			String stuId=(String)smModel.getValueAt(rownum, 0);
			String sql="select * from stus where StuId=?";
			String[] paras={stuId};
			StuModel temp=new StuModel();
			temp.UpdStu(sql, paras);
			smModel=new StuModel();
			smModel.QuyStu("select * from stus ");
			jtTable.setModel(smModel);
		}
	}
	
}
