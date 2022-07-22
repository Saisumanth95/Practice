package demo;

public class HR extends Employee{
	
	private int departmentId;
	

	public HR(String name, String employee_id, String phone_no, String mail_id,int departmentId) {
		
		super(name, employee_id, phone_no, mail_id);
		
		this.setDepartmentId(departmentId);
	
		
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		System.out.println("Human Resources");
		
	}


	@Override
	public void leave() {
		// TODO Auto-generated method stub
		
		System.out.println("Leaving Human Resources");
		
		
	}


	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
		System.out.println("HR is travelling");
		
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	

}
