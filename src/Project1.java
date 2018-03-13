/**
 * 
 * @author anthony g
 *
 */
public class Project1 extends DateGUI{
	public static String fileName;
	
	public static void main(String[] args){
		DateGUI gui = new DateGUI();
		gui.initialize();
	    gui.readSSNsFromFile(fileName);
	    gui.selectionSort(dateList, dateSize);

	}

}