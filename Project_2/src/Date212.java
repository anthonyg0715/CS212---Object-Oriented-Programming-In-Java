
public class Date212 {
	
	private int year;
	private int month;
	private int day;
	
	public Date212(String dte){
		
		if(isValidDATE(dte)) {
			String temp,temp1,temp2;
			temp = dte.substring(4,6);
			month = Integer.parseInt(temp);
			temp1 = dte.substring(6,8);
			day = Integer.parseInt(temp1);
			temp2 = dte.substring(0,4);
			year = Integer.parseInt(temp2);
			Date212(year, month, day);
		}
		
	}
	
	public void Date212(int y, int m, int d){
		year=y;
		month=m;
		day=d;
	}
	
	public static boolean isValidDATE(String date) {
		if (date.length() != 8)
			return (false); 
		for (int i=0;i<8;i++)
			if (!Character.isDigit(date.charAt(i)))
				return(false);
		return (true);	
	} // isValidDATE
	
	public String toString(){
		String s = Integer.toString(month) + "/" + Integer.toString(day) + "/" + Integer.toString(year);
		return s;
	}
	
	public int compareTo(Date212 Date212){
		if(this.toString().compareTo(((Date212)Date212).toString()) < 0)
			return -1;
		else if(this.toString().compareTo(((Date212)Date212).toString()) > 0){
			return 1;	
		}
		return 0;      
	}
	
	public int getYEAR(){
		return year;
	}
	
	public int getMONTH(){
		return month;
	}
	
	public int getDAY(){
		return day;
	}

}
