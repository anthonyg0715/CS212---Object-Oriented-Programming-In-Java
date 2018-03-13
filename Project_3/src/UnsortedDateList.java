public class UnsortedDateList extends DateList {
	
	 /**
	  * Adds the date to the linked list
	  * @param Date212 s
	  */
	public void add(Date212 s) {
		
		 DateNode n = new DateNode(s);
	      last.next = n;
	      last = n;
	      length++;
	}//add
	
}//UnsortedDateList