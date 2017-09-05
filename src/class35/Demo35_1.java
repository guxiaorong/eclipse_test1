package class35;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo35_1 extends JFrame{

	/**
	 * @param args
	 */
	MyPanel pn=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo35_1 demo35_1=new Demo35_1();

	}
	
	public Demo35_1()
	{
		pn=new MyPanel();
		this.add(pn);
		this.addKeyListener(pn);
		this.setSize(300,200);
		this.setVisible(true);
	}
	

}

class MyPanel extends JPanel implements KeyListener
{

	int x=10;
	int y=10;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillOval(x, y, 10, 10);	
	}
	@SuppressWarnings("static-access")
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("°´ÏÂ"+e.getKeyChar());
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			y++;		
		}
		else if(e.getKeyCode()==KeyEvent.VK_UP)
		{	
			y--;
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{	
			x--;
		}
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{	
			x++;
		}
		System.out.println("getModifiers:"+e.getModifiers());
		System.out.println("getModifiers:"+e.getModifiersEx());
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ÊÍ·Å"+e.getKeyChar());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
