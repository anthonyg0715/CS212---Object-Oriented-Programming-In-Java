
public class DateList{
	
	private DateNode first = new DateNode(null); 
	private DateNode last = first; 
	private int length;
	
	public DateList() {
        DateNode dn = new DateNode(null);
        first = dn;
        last = dn;
        length=0;	
	}
	
	public void append(Date212 Date212) {
		DateNode n = new DateNode(Date212);
		last.next = n;
		last = n;
		length++;	
	}
	
	public void insert(Date212 Date212){
	    DateNode n = new DateNode(Date212);
	    DateNode p = first;

	    // Find the insertion point
	    while ((p.next != null) && (p.next.data.compareTo(Date212) < 0)) {
	        p = p.next;
	    }

	    // Insert the node
	    n.next = p.next;
	    p.next = n;

	    if (n.next == null) {
	        last = n;
	    }

	    // Update the list length
	    length++;

	}//insert method

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
		      
}//DateList class
