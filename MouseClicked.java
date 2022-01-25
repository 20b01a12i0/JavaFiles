import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MouseClicked extends JFrame implements MouseListener{

	/**
	 * @param args
	 */
     
	public MouseClicked(){
		super("mouseclicked event");
		addMouseListener(this);
		setLayout(new FlowLayout());
		
		setSize(200,200);
		setLocation(300,300);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseClicked();

	}

	@Override
	public void mouseClicked(MouseEvent mc) {
		// TODO Auto-generated method stub
		String output="MouseClicked at"+mc.getX()+","+mc.getY();
		JOptionPane.showMessageDialog(this, output);
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent mc) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
