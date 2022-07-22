package demo;

public abstract class Employee {
	
	private String name;
	private String employee_id;
	private String phone_no;
	private String mail_id;
	
	public Employee(String name, String employee_id, String phone_no, String mail_id) {
		this.name = name;
		this.employee_id = employee_id;
		this.phone_no = phone_no;
		this.mail_id = mail_id;
	}
	
	public abstract void work();
	public abstract void leave();
	public abstract void travel();
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	

}
