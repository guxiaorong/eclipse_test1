package stumanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

import javax.swing.*;


public class Test_2 extends JFrame implements ActionListener{

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

	Vector rowdata,columNames;
	 
	public static void main(String[] args) {
		Test_2 test_2=new Test_2();

	}

	public Test_2()
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
		

        String url = "jdbc:odbc:Access2010";	
    	ResultSet rs=null;
    	Statement sm =null;
    	Connection ct=null;

        columNames=new Vector();
		columNames.add("学号");
		columNames.add("姓名");
		columNames.add("性别");
		columNames.add("年龄");
		columNames.add("籍贯");
		columNames.add("系别");
        rowdata=new Vector();
        try {
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
        	ct= DriverManager.getConnection(url);
        	String sql="select * from stus";
    		sm = ct.createStatement();
            rs = sm.executeQuery(sql);
    		while(rs.next())
    		{
    			Vector hang=new Vector();
    			hang.add(rs.getString(1));
    			hang.add(rs.getString(2));
    			hang.add(rs.getString(3));
    			hang.add(rs.getInt(4));
    			hang.add(rs.getString(5));
    			hang.add(rs.getString(6));
    			rowdata.add(hang);
    		}
    		jtTable=new JTable(rowdata,columNames);	
    		jsp=new JScrollPane(jtTable);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			try {
				if(ct!=null) ct.close();
				if(sm!=null) sm.close();
				if(rs!=null) rs.close();
			}
			catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
			
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
			String name=this.jtf1.getText().trim();
			String sql="select * from stu where stuname='"+name+"'";
			StuModel smModel=new StuModel();			
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
		}
	}
}
