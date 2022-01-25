import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GradeCalc extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	JLabel n,e,m,c,com,t,p,g,ph;

	JTextField nt,et,mt,pht,ct,comt,tt,pt,gt;
	JButton clt,clp,clg,clr,ext;
	public GradeCalc(){
		super("Grades");
		n=new JLabel("Name");
		e=new JLabel("English");
		m=new JLabel("Maths");
		ph=new JLabel("Physics");
		c=new JLabel("Chemistry");
		com=new JLabel("Computer");
		t=new JLabel("Total");
		p=new JLabel("%");
	    g=new JLabel("Grade");
	    nt=new JTextField(10);
	    et=new JTextField(10);
	    mt=new JTextField(10);
	    pht=new JTextField(10);
	    ct=new JTextField(10);
	    comt=new JTextField(10);
	    tt=new JTextField(10);
	    pt=new JTextField(10);
	    gt=new JTextField(10);
	    clt=new JButton("Cal Total");
	    clp=new JButton("Cal %");
	    clg=new JButton("Cal Grade");
	    clr=new JButton("Clear");
	    ext=new JButton("EXIT");
	    setLayout(new FlowLayout());
	    add(n);
	    add(nt);
	    add(t);
	    add(tt);
	    add(e);
	    add(et);
	    add(p);
	    add(pt);
	    add(m);
	    add(mt);
	    add(g);
	    add(gt);
	    add(ph);
	    add(pht);
	    add(clt);
	    add(c);
	    add(ct);
	    add(clp);
	    add(com);
	    add(comt);
	    add(clg);
	    add(clr);
	    add(ext);
	    clt.addActionListener(this);
	    clp.addActionListener(this);
	    clg.addActionListener(this);
	    clr.addActionListener(this);
	    ext.addActionListener(this);
	    tt.setEnabled(false);
	    pt.setEnabled(false);
	    setSize(330,350);
	    setLocation(500,500);
	    setResizable(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    show();
	    
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		double total,percentage;
		String grade,e,m,ph,ch,com,c;
		int english,math,physics,chemistry,computer;
		e=et.getText();
		m=mt.getText();
		ph=pht.getText();
		c=ct.getText();
		com=comt.getText();
		english=Integer.parseInt(e);
		math=Integer.parseInt(m);
		physics=Integer.parseInt(ph);
		chemistry=Integer.parseInt(c);
		computer=Integer.parseInt(com);
		total=english+math+physics+chemistry+computer;
		percentage=(total/500)*100;
		if(ae.getSource()==clt){
			tt.setText(total+" ");
		}
		else if(ae.getSource()==clp){
			pt.setText(percentage+" ");
		}
		else if(ae.getSource()==clg){
			String g;
			if(percentage>90){
				g="A";
			}
			else if(percentage < 90 && percentage >80){
				g="B";
			}
			else if(percentage <80 && percentage>70){
				g="C";
			}
			else if (percentage <70 && percentage < 60){
				g="D";
			}
			else{
				g="F";
			}
			gt.setText(g);
		}
		else if(ae.getSource()==clr){
			nt.setText("");
			et.setText("");
			mt.setText("");
			ct.setText("");
			pht.setText("");
			tt.setText("");
			pt.setText("");
			gt.setText("");
		}
		
		else if(ae.getSource()==ext){
			System.exit(0);
		}
		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	new GradeCalc();

}
}
