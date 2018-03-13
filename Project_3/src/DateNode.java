public class DateNode {

	Date212 data;
	DateNode next;

	public DateNode(Date212 data, DateNode next) {
		this.data = data;
		this.next = next;
	} // constructor

	public DateNode() {
		this.data = null;
		this.next = null;
	} // constructor

	public DateNode(Date212 data) {
		this.data = data;
		this.next = null;
	} // constructor

}