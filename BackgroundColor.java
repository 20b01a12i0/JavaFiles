import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class BackgroundColor extends JFrame implements KeyListener{

	/**
	 * @param args
	 */
	JButton b1,b2,b3,b4;
	public BackgroundColor(){
		super("BackgroundColor");
		b1=new JButton("A");
		b2=new JButton("S");
		b3=new JButton("D");
		b4=new JButton("F");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addKeyListener(this);
		b2.addKeyListener(this);
		b3.addKeyListener(this);
		b4.addKeyListener(this);
		setSize(1000,1000);
		setLocation(100,200);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		show();
		
	}

    @Override
	public void keyPressed(KeyEvent args) {
		// TODO Auto-generated method stub
    	
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		if( ke.getKeyChar()=='A'){
			Color color = Color.black;
			b1.setBackground(color);
		}
		else if(ke.getKeyChar()=='S'){
			Color color=Color.blue;
			b2.setBackground(color);
		}
		else if(ke.getKeyChar()=='D'){
			Color color=Color.orange;
			b3.setBackground(color);
		}
		else if(ke.getKeyChar()=='F'){
			Color color=Color.green;
			b4.setBackground(color);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BackgroundColor();

	}

	
		
	}




	
	

