package demo;

import java.lang.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Test {
	
	public static ArrayList<HR> hrs;
	public static ArrayList<SoftwareEngineer> softwareEngineers;
	public static ArrayList<Manager> managers;
	

	public static void main(String args[]) {
		
		intialHrs();
		intialSoftwareEngineers();
		intialManagers();
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("1. HRS  \n2. Software Engineers   \n3.Managers");
		System.out.println("Select option to print");
		
		
		int option = in.nextInt();
		
		
		System.out.println("---------------------------------------------------------------------------------");
		
		switch(option) {
		
		case 1: printHrs();
		break;
		
		case 2: printSoftwareEngineers();
		break;
		
		case 3: printManagers();
		break;
		
		default: System.out.println("Wrong option");
		
		
		}
		
		
		
	}
	
	public static void printHrs() {
		
		
		for(HR hr : hrs) {
			
			System.out.println("Name : " + hr.getName());
			System.out.println("Employee Id: " + hr.getEmployee_id());
			System.out.println("Phone no: " + hr.getPhone_no());
			System.out.println("Mail : " + hr.getMail_id());
			System.out.println("Department Id : " + hr.getDepartmentId());
			
			System.out.println("---------------------------------------------------------------------------------");
			
			
		}
		
		
		
	}
	
	public static void printSoftwareEngineers() {
		
		
		for(SoftwareEngineer se : softwareEngineers) {
			
			System.out.println("Name : " + se.getName());
			System.out.println("Employee Id: " + se.getEmployee_id());
			System.out.println("Phone no: " + se.getPhone_no());
			System.out.println("Mail : " + se.getMail_id());
			System.out.println("Grade : " + se.getGrade());
			System.out.println("Team Id : " + se.getTeam_id());
			
			System.out.println("---------------------------------------------------------------------------------");
			
			
		}
		
		
	}
	
	
	public static void printManagers() {
		
		for(Manager ms : managers) {
			
			System.out.println("Name : " + ms.getName());
			System.out.println("Employee Id: " + ms.getEmployee_id());
			System.out.println("Phone no: " + ms.getPhone_no());
			System.out.println("Mail : " + ms.getMail_id());
			System.out.println("Manager Id : " + ms.getManager_id());
			System.out.println("Team Count : " + ms.getTeamCount());
			
			System.out.println("---------------------------------------------------------------------------------");
			
		}
		
		
	}
	
	
	
	
	public static void intialHrs() {
		
		hrs = new ArrayList<>();
		
		hrs.add(new HR("Ravi","1234","1234567890","ravi@gap.com",8));
		hrs.add(new HR("kumar","1235","7537823926","kumar@gap.com",8));
		hrs.add(new HR("Aravind","1236","6346823168","aravind@gap.com",8));
		
		
	}
	
	public static void intialSoftwareEngineers() {
		
		softwareEngineers = new ArrayList<>();
		
		softwareEngineers.add(new SoftwareEngineer("Sai Sumanth","18241","5273571523","sai@gap.com",5,24));
		softwareEngineers.add(new SoftwareEngineer("Danya","18232","8268626326","danya@gap.com",5,22));
		softwareEngineers.add(new SoftwareEngineer("Mahadevi","18221","82638263862","mahadevi@gap.com",5,24));
		softwareEngineers.add(new SoftwareEngineer("Swasthika","18222","367253725","swasthika@gap.com",5,24));
		
		
		
	}
	
	public static void intialManagers() {
		
		managers = new ArrayList<>();
		
		managers.add(new Manager("Karthik","98765","8682648283","karthik@gap.com",21,8));
		managers.add(new Manager("Prashanth","98723","9379273927","prashanth@gap.com",22,9));
		

		
		
	}
	
	
	
	
}


