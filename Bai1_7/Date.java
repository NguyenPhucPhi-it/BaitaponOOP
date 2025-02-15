package Bai1_7;

public class Date {
	private int day, month, year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		int digitDay = String.valueOf(day).length();
		int digitMonth = String.valueOf(month).length();
		String date = "";
		if (digitDay == 1 && digitMonth == 1) {
			date += "0" + day + "/0" + month + "/" + year;
		}
		else if (digitDay != 1 || digitMonth != 1){
			if (digitDay != 1) {
				date += day + "/0" + month + "/" + year;
			}
			else if (digitMonth != 1) {
				date += "0" + day + "/" + month + "/" + year;
			}
		}
		else if (digitDay != 1 && digitMonth != 1) {
			date += day + "/" + month + "/" + year;
		}
		return date;
	}
	
	public static void main(String[] args) {
		 Date d1 = new Date(1, 2, 2014);
	      System.out.println(d1); 
	      d1.setMonth(12);
	      d1.setDay(9);
	      d1.setYear(2099);
	      System.out.println(d1);  
	      System.out.println("Month: " + d1.getMonth());
	      System.out.println("Day: " + d1.getDay());
	      System.out.println("Year: " + d1.getYear());

	      d1.setDate(3, 4, 2016);
	      System.out.println(d1);  
	}


}
