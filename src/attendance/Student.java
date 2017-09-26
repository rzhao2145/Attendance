package attendance;

public class Student implements Attendee{
	private String first;
	private String last;
	private boolean isHere;
	private String report;
	private String report2;
	
	public Student(String firstName, String lastName) {
		this.first = firstName;
		this.last = lastName;
		isHere = false;
	}
	public boolean isPresent() {
		if(isHere == true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void setPresent(boolean present) {
		isHere = present;
	}
	public String getFirstName() {
		return this.first;
	}
	public String getLastName() {
		return this.last;
	}
	public boolean mathces(String first, String last) {
		if(this.first.equals(first) && this.last.equals(last)) {
			return true;
		}
		return false;
	}
	public boolean matches(String first) {
		if(this.first.equals(first)) {
			return true;
		}
		return false;
	}
	public String getReportString() {
		if(this.first.length() >= 20) {
			report += this.first.substring(0,17) + "...";
		} else {
			report += this.first;
			while(report.length() < 20) {
				report += " ";
			}
		}
		
		if(this.last.length() >= 20) {
			report2 += this.last.substring(0,17) + "...";
		} else {
			report2 += this.first;
			while(report2.length() < 20) {
				report += " ";
			}
		}
		report += report2;
		while(report.length() < 40) {
			report += " ";
		}
		if(isHere == true) {
			report += "PRESENT";
		} else {
			report += "ABSENT";
		}
		System.out.println(report);
		return report;
	}
}
