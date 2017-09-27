package attendance;

public class Student implements Attendee{
	private String firstName;
	private String lastName;
	private boolean isHere;
	private String report;
	
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		report = "";
		isHere = false;
	}
	public boolean isPresent() {
		return isHere;
		
	}
	public void setPresent(boolean present) {
		this.isHere = present;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public boolean mathces(String first, String last) {
		return first.toLowerCase().equals(firstName.toLowerCase()) && last.toLowerCase().equals(lastName.toLowerCase());
	}
	public boolean matches(String last) {
		return last.toLowerCase().equals(lastName.toLowerCase());
	}
	public String getReportString() {
		report += firstName;
		while(report.length() < 20) {
			report += " ";
		}
		report += lastName;
		while(report.length() < 40) {
			report += " ";
		}
		if(isHere) {
			report += "PRESENT";
		}
		else {
			report += "ABSENT";
		}
		return report;
	}
}
