import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
class Addition extends JFrame{

	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField t1,t2,t3;

	public Addition(){

		setLayout(new FlowLayout());

		l1 = new JLabel("Enter num1 : ");
		t1 = new JTextField(10);
		l2 = new JLabel("Enter num2 : ");
		t2 = new JTextField(10);
		l3 = new JLabel("Sum : ");
		t3 = new JTextField(10);

		b1 = new JButton("Sum");
		b2 = new JButton("CLEAR");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);

		b1.addActionListener(new ActionListener(){
			                  public void actionPerformed(ActionEvent ae){

			                  	if(ae.getSource() == b1){

			                  			int n1 = Integer.parseInt(t1.getText());
			                  			int n2 = Integer.parseInt(t2.getText());
			                  			int res =n1+n2;
			                  			t3.setText(res+"");
			                  		}
			                  }
		                     });

		b2.addActionListener(new ActionListener(){

			                 public void actionPerformed(ActionEvent ae){

			                 	if(ae.getSource() == b2){
			                 		t1.setText("");
			                 		t2.setText("");
			                 		t3.setText("");
			                 	}
			                 }
		                     });
	}
}
public class AnonymusInnerClassExample{
	public static void main(String[] args) {
		Addition add = new Addition();
		add.setSize(500,300);
		add.setVisible(true);
	}
}