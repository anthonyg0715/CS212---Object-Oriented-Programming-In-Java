import javax.swing.*;
import java.awt.*;

public class DateGUI{
	
	public static JFrame myFrame;
	public static Container myContentPane;
	public TextArea myTextArea;
	public TextArea mySubscripts;
	
	public void initialize() {
	    myFrame=new JFrame();
	    myTextArea = new TextArea();
	    mySubscripts = new TextArea();
	    myFrame.setLayout(new GridLayout(1,2));
		myContentPane = myFrame.getContentPane();
		myContentPane.add(myTextArea);
		myContentPane.add(mySubscripts);
		myTextArea.setEditable(false);
		mySubscripts.setEditable(false);
	    myFrame.setSize(400,255);
	    myFrame.setLocation(500, 500);
	    myFrame.setTitle("DATES");
	    myTextArea.setBackground(Color.CYAN);
	    mySubscripts.setBackground(Color.CYAN);
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    myFrame.setVisible(true);
	    
	}
}//class
