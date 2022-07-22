package demo;

public class Manager extends Employee{
	
	
	private int manager_id;
	private int teamCount;
	
	
	public Manager(String name, String employee_id, String phone_no, String mail_id,int manager_id,int teamCount) {
		super(name, employee_id, phone_no, mail_id);
		
		this.manager_id = manager_id;
		this.teamCount = teamCount;
		
	}
	
	
	public int getTeamCount() {
		return teamCount;
	}
	public void setTeamCount(int teamCount) {
		this.teamCount = teamCount;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		System.out.println("Manager Working");
		
	}


	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
		System.out.println("Manager Leaving");
		
		
	}


	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
		System.out.println("Manager Travelling");
		
		
	}
	
	public void meeting() {
		
		System.out.println("Manager is in meeting");
		
	}
	
	
	
	
	

}
