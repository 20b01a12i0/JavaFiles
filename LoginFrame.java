import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginFrame extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	JLabel ul,pl;
	JTextField ut;
	JPasswordField pt;
	JButton s;
	public LoginFrame(){
		super("loginScreen");
		ul=new JLabel("username");
		pl=new JLabel("password");
		ut=new JTextField(10);
		pt=new JPasswordField(10);
		s=new JButton("Submit");
		 setLayout(new FlowLayout());
		 add(ul);
		 add(ut);
		 add(pl);
		 add(pt);
		 add(s);
		 s.addActionListener(this);
		 setSize(200,200);
		 setLocation(200,400);
		 setResizable(false);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 show();
}
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand().equals("Submit")){
			String un=ut.getText();
			String pwd=pt.getText();
			
			String output="username :"+un+"\n password:"+pwd;
			JOptionPane.showMessageDialog(this, output);
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new LoginFrame();
	}

	
}
