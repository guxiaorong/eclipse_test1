package stumanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlhelper {
	

	Connection ct=null;
	PreparedStatement ps=null;
	Statement sm =null;
	ResultSet rs=null; 
	int ret=0;
    String url = "jdbc:odbc:Access2010";
    String driverString="sun.jdbc.odbc.JdbcOdbcDriver";
    
    public sqlhelper()
    {
    	try {	
    		// 加载驱动
			Class.forName(driverString);
			// 得到连接
            ct = DriverManager.getConnection(url);			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}  	
    }
    
    public boolean Cmd(String sql,String []paras)
    {
    	try {
			ps = ct.prepareStatement(sql);
            for(int i=0;i<paras.length;i++)
            {
            	ps.setString(i+1, paras[i]);
            }
			ret=ps.executeUpdate();
			if(ret>0)
			{
				System.out.println("操作OK");					
			}
			else 
			{
				System.out.println("操作ERROR");
				return false;
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			this.close();
		}
		return true;
    }
    
    public ResultSet Query(String sql,String []paras)
    {
    	try {
			ps = ct.prepareStatement(sql);
            for(int i=0;i<paras.length;i++)
            {
            	ps.setString(i+1, paras[i]);
            }
			rs=ps.executeQuery();
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			//this.close();
		}
		return rs;
    }
    
    public ResultSet Query(String sql)
    {
    	try {
			ps = ct.prepareStatement(sql);
			rs=ps.executeQuery();
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally
		{
			//this.close();
		}
		return rs;
    }
    
	public void close()
	 {
		 try {
				if(ct!=null) ct.close();
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
			}
			catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}	 
	 }

}
