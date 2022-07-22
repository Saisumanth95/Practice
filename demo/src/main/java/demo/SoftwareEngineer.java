package demo;

public class SoftwareEngineer extends Employee {

	
	private int grade;
	private int team_id;
	
	
	public SoftwareEngineer(String name, String employee_id, String phone_no, String mail_id,int grade,int team_id) {
		super(name, employee_id, phone_no, mail_id);
		this.setGrade(grade);
		this.setTeam_id(team_id);
		
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getTeam_id() {
		return team_id;
	}


	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}


	@Override
	public void work() {
		
		System.out.println("Coding and Developmeent");
		
		
	}


	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
		System.out.println("Leaving coding and development");
		
		
	}


	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
		System.out.println("Software Engineer travelling");
		
		
	}
	
	
	public void debug() {
		
		System.out.println("Debugging Code!");
		
	}
	
	

}
