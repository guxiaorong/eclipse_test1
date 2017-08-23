package class35;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class Demo35 extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	JPanel jp1=null;
	JButton jb1=null;
	JButton jb2=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Demo35 demo35=new Demo35();
     
	}
	
	public Demo35()
	{
		jp1=new JPanel();
		jb1=new JButton("ºÚÉ«");
		jb2=new JButton("ºìÉ«");
		
		this.add(jb1,BorderLayout.NORTH);	    
		jp1.setBackground(Color.black);
		this.add(jp1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.SOUTH);
		
		Cat mycat=new Cat();
		jb1.addActionListener(mycat);
		jb2.addActionListener(mycat);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb1.setActionCommand("black");
		jb2.setActionCommand("red");
		
		
		this.setSize(200,150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black"))
		{
			jp1.setBackground(Color.black );			
		}
		else if(e.getActionCommand().equals("red"))
		{
			jp1.setBackground(Color.red);
		}
	}

}


class Cat implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("black"))
		{
			System.out.println("cat know balck");			
		}
		else if(e.getActionCommand().equals("red"))
		{
			System.out.println("cat know red");
		}
	}
	

}
