public abstract class DateList {

	protected DateNode first;
	protected DateNode last;
	protected int length;

	public DateList() {

		DateNode dn = new DateNode();
		first = dn;
		last = dn;
		length = 0;
	} // constructor

	public String toString() {

		DateNode p = first.next;
		String returnString = " ";
		while (p != null) {
			returnString += p.data + "\n";
			p = p.next;
		} // while
		return returnString;

	}// toString

}// class DateList