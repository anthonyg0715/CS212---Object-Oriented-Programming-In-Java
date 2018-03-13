/**
 * @author anthony g
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class DateGUI{
	   public static final int LIST_SIZE = 100;
	   public String fileName = "input file.txt";
	   private BufferedReader br;
	   public StringTokenizer token;
	   public static String date;
	   public static String[] dateList;
	   public static int dateSize;
	   public static JFrame myFrame;
	   public static Container myContentPane;
	   public static TextArea myTextArea;
	   public static TextArea mySubscripts;
	   
	   public void initialize() {
		   date="";
		   dateList= new String[LIST_SIZE];
		   dateSize=0;
	       myFrame=new JFrame();
	       myTextArea = new TextArea();
	       mySubscripts = new TextArea();
	       myFrame.setLayout(new GridLayout(1,2));
		   myContentPane = myFrame.getContentPane();
		   myContentPane.add(myTextArea);
		   myContentPane.add(mySubscripts);
		   myTextArea.setEditable(false);
		   mySubscripts.setEditable(false);
	       myFrame.setSize(500,500);
	       myFrame.setLocation(100, 100);
	       myFrame.setTitle("DATES");
	       myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       myFrame.setVisible(true);
	   }
	   
	    public void readSSNsFromFile(String fileName){
	    	this.fileName = fileName;
			try {
			    br = new BufferedReader(new FileReader("C:\\Users\\antho\\OneDrive\\Documents\\input file.txt"));
				date = br.readLine();
				while(date != null) {
					token = new StringTokenizer(date,",");
					while(token.hasMoreTokens()){
						String tokens = token.nextToken();
						if (!isValidSSN(tokens)){
							System.out.println(tokens);
							}else{
								dateList[dateSize++]=tokens;
	                            myTextArea.append(tokens + '\n');
	                         }
	                }//inner while
	              date = br.readLine();
	       } //while
				selectionSort(dateList, dateSize);
				for(int i=0; i<dateSize; i++)
					mySubscripts.append(dateList[i]+'\n');
				br.close();
		}catch(IOException e){
			System.out.println(e);
		}
	   } //reading dates and putting them on a gui
	    
	    public static boolean isValidSSN(String s) {
	 	   if (s.length() != 8) {
	 		 return false;
	 	   }
	 	   for (int i=0;i<8;i++)
	 		   if (!Character.isDigit(s.charAt(i))) {
	 			   return false;
	        }
	 	   return true;
	    }//Checking validation of dates
	    
	    public void selectionSort(String[] array, int length) { 
	    	int j;
	    	for ( int i = 0; i < length - 1; i++ ) { 
	           int min = i;
	           for ( j = i + 1; j < length; j++ ) {
	        	   
	        	   if (array[j].compareTo(array[min])<0)
	        	      min = j;
	           }
	           if (!array[min].equals(array[i])) {
	        	  String temp = array[min];
	              array[min] = array[i]; 
	              array[i] = temp; 
	           }  // if
	        } // for i 
	     } // method selectionSort 
}
