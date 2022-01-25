import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ElectiveSelection extends JFrame implements ItemListener{
	JLabel l1;
	JCheckBox cb1,cb2,cb3,cb4,cb5;
    public ElectiveSelection(){
    	super("Elective Selection");
    	l1=new JLabel("select Elective Subjects");
    	cb1=new JCheckBox("Machine Learning");
    	cb2=new JCheckBox("Software Learning");
    	cb3=new JCheckBox("pattern recognization");
    	cb4=new JCheckBox("computer vision");
    	cb5=new JCheckBox("quantum computy");
    	setLayout(new FlowLayout());
    	add(l1);
    	add(cb1);
    	add(cb2);
    	add(cb3);
    	add(cb4);
    	add(cb5);
    	cb1.addItemListener(this);
    	cb2.addItemListener(this);
    	cb3.addItemListener(this);
    	cb4.addItemListener(this);
    	cb5.addItemListener(this);
    	setSize(300,300);
    	setLocation(100,200);
    	setResizable(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	show();
    	
    }
	

	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
	  String output = " ";
		if(ie.getSource()==cb1){
			
			if(cb1.isSelected()==true){
				 output=output+cb1.getText()+": selected ";
			}
			else{
			output=output+cb1.getText()+": Notselected ";
			}
		}
		else if(ie.getSource()==cb2){
		
			if(cb2.isSelected()==true){
			output=output+cb2.getText()+": selected ";
			}
			else{
			output=output+cb2.getText()+": Notselected ";
			}
		}
		else if(ie.getSource()==cb3){
			
			if(cb3.isSelected()==true){
				output=output+cb3.getText()+": selected ";
			}
			else{
				output=output+cb3.getText()+": Notselected ";
			}
		}
		else if(ie.getSource()==cb4){
			 

			if(cb4.isSelected()==true){
				output=output+cb4.getText()+": selected ";
			}
			else{
				output=output+cb4.getText()+": Notselected ";
			}
		}
		else if(ie.getSource()==cb5){
			   

			if(cb5.isSelected()==true){
				output=output+cb5.getText()+": selected ";
			}
			else{
				output=output+cb5.getText()+": Notselected ";
			}
		}
		
		JOptionPane.showMessageDialog(this, output);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ElectiveSelection();

	}


	

}
