package day44_Workers_Rights_Management_App;
public class Teachers extends Administrator implements day44_Workers_Rights_Management_App.commonMethods {

	
protected Teachers(String name, int iDNumber, Boolean isWorking, String jobTitle, String jobPosition) {
		super(name, iDNumber, isWorking, jobTitle, jobPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void payments(int workedHours) {
		
	double teacherSalary = workedHours*getPayperhour();
	
	System.out.println("Teacher salary; " + teacherSalary);
		
	}
	
	@Override
	public void vocation(int workDays, int cooficient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bonus(int halfSalary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Teachers [isWorking=" + isWorking + ", jobTitle=" + jobTitle + ", jobPosition=" + jobPosition + "]";
	}

	
	
	
}
