package class35;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


 

@SuppressWarnings("serial")
public class Demo36 extends JFrame{

	/**
	 * @param args
	 */
	MyPanel1 myPanel=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo36 demo36=new Demo36();

	}
	public Demo36()
	{
		myPanel=new MyPanel1();
		this.add(myPanel);
		this.addMouseListener(myPanel);
		this.addMouseMotionListener(myPanel);
		this.addMouseWheelListener(myPanel);
		this.addWindowListener(myPanel);
		this.addWindowFocusListener(myPanel);
		this.setSize(300,300);
		this.setVisible(true);
	}

}


@SuppressWarnings("serial")
class MyPanel1 extends JPanel implements MouseListener,MouseMotionListener, MouseWheelListener,WindowListener,WindowFocusListener
{
	public void paint(Graphics g)
	{
		super.paint(g);	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标点击 x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标进入 x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标退出 x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标按下 x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标释放 x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标拖拽 x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标移动  x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("鼠标滑动移动  x=:"+e.getX()+" y="+e.getY());
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口激活 :"+e.getNewState());
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口关闭 :"+e.getNewState());
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口关闭中！！ :"+e.getNewState());
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口Deactivated :"+e.getNewState());
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口Deiconified :"+e.getNewState());
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口iconified :"+e.getNewState());
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口windowOpened :"+e.getNewState());
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口windowGainedFocus :"+e.getNewState());
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口windowLostFocus :"+e.getNewState());
	}


	
	
}