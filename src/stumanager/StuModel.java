package stumanager;

import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class StuModel extends AbstractTableModel{

	Vector rowdata,columNames;
  
    public boolean UpdStu(String sql,String []paras)
    {
    	 sqlhelper sqlhelp=new sqlhelper();
    	 return sqlhelp.Cmd(sql, paras);
    }
	
 	public void QuyStu(String sql,String []paras)
	{		
		/* CENTER :JTable*/
 	    sqlhelper sqlhelper=null;
		columNames=new Vector();
		columNames.add("学号");
		columNames.add("姓名");
		columNames.add("性别");
		columNames.add("年龄");
		columNames.add("籍贯");
		columNames.add("系别");
		
		rowdata=new Vector();
	    try {
	    	sqlhelper=new sqlhelper();
            ResultSet rs=sqlhelper.Query(sql, paras);
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
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			sqlhelper.close();
		}
	}
		
 	public void QuyStu(String sql)
	{		
 	    sqlhelper sqlhelper=null;
 		/* CENTER :JTable*/
		columNames=new Vector();
		columNames.add("学号");
		columNames.add("姓名");
		columNames.add("性别");
		columNames.add("年龄");
		columNames.add("籍贯");
		columNames.add("系别");
		
		rowdata=new Vector();
	    try {
	    	sqlhelper=new sqlhelper();
            ResultSet rs=sqlhelper.Query(sql);
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
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			sqlhelper.close();
		}
	}
	 
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return (String)this.columNames.get(column);
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return ((Vector)this.rowdata.get(rowIndex)).get(columnIndex);
	}


	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.columNames.size();
	}


	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.rowdata.size();
	}
	
	

}
