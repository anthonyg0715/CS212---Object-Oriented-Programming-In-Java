import java.io.*;
import java.util.StringTokenizer;

public class Project2{
	
	public static StringTokenizer token;
	
	public static void main(String[] args) {
		DateGUI gui = new DateGUI();
		gui.initialize();
		DateList dl1 = new DateList();
		DateList dl2 = new DateList();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\antho\\OneDrive\\Documents\\input file.txt"));
			String date = br.readLine();
			while(date != null){
				token = new StringTokenizer(date,",");
				while(token.hasMoreTokens()){
					String tokens = token.nextToken();
					Date212 d = new Date212(tokens);
					if (!Date212.isValidDATE(tokens)){
						System.out.println(tokens);
					}else{
						dl1.append(d);
				        gui.myTextArea.append(d.toString() + '\n');
				        dl2.insert(d);
				        gui.mySubscripts.insert(d.toString() + '\n', 0);
					}//checking for validation before putting on gui
				}//inner while
				date=br.readLine();
	       } //outer while
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}//try then catch for reading the file
		
	}//main

}//class
