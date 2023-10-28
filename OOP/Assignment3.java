/*ASSIGNMENT 3
//Vishakha Sarode SE IT 27069

Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address,Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
club fund. Generate pay slips for the employees with their gross and net salary 
*/
import java.util.*;
class Employee
{	
	Scanner sc=new Scanner(System.in);
		//Declaration of variables
		static String Emp_name,Emp_address,Mail_id;
		static String Emp_id,Mobile_no;
		static float basic_pay;
		static double da,hra,pf,staff_club_fund,gross_salary;
	public void input()
	{
		
		System.out.println("Welcome\n");
		System.out.println("Enter the Employee Name\n");
		Emp_name=sc.next();
		System.out.println("Enter the Employee Address\n");
		Emp_address=sc.next();
		System.out.println("Enter the Employee Mail Address\n");
		Mail_id=sc.next();
		System.out.println("Enter Empolyee ID\n");
		Emp_id=sc.next();
		System.out.println("Enter Mobile Number\n");
		Mobile_no=sc.next();
		System.out.println("Enter Basic Pay of Employee\n");
		basic_pay=sc.nextInt();
		
		
		
		
	}
	//to display all the given inputs from the user 
	public void display()
	{
		System.out.println("Welcome");
		System.out.println("Name:\t"+Emp_name);
		System.out.println("Address:\t"+Emp_address);
		System.out.println("Mail ID:\t"+Mail_id);
		System.out.println("Employee ID:\t"+Emp_id);
		System.out.println("Mobile Number:\t"+Mobile_no);
		System.out.println("Basic Pay:\t"+basic_pay);
		
	}
}
//First child class
class Programmer extends Employee
{
	public void programmer_Input()
	{
		super.input();
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		System.out.println("Name:\t"+Emp_name);
		System.out.println("Address:\t"+Emp_address);
		System.out.println("Mail ID:\t"+Mail_id);
		System.out.println("Employee ID:\t"+Emp_id);
		System.out.println("Mobile Number:\t"+Mobile_no);
		System.out.println("Basic Pay:\t"+basic_pay);
		System.out.println("DA\t"+da);
		System.out.println("HRA\t"+hra);
		System.out.println("PF\t"+pf);
		System.out.println("Staff fund is:\t"+staff_club_fund);
		System.out.println("Gross Salary\t"+gross_salary);
		
	}
}
//Second child classs
class TeamLeader extends Employee
{
	public void teamleader_Input()
	{
		super.input();
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		System.out.println("Name:\t"+Emp_name);
		System.out.println("Address:\t"+Emp_address);
		System.out.println("Mail ID:\t"+Mail_id);
		System.out.println("Employee ID:\t"+Emp_id);
		System.out.println("Mobile Number:\t"+Mobile_no);
		System.out.println("Basic Pay:\t"+basic_pay);
		System.out.println("DA\t"+da);
		System.out.println("HRA\t"+hra);
		System.out.println("PF\t"+pf);
		System.out.println("Staff fund is:\t"+staff_club_fund);
		System.out.println("Gross Salary\t"+gross_salary);
	}

}
//third child class
class Assistant_Pro_Manager extends Employee
{
	public void assistantManager_Input()
	{
		super.input();
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		System.out.println("Name:\t"+Emp_name);
		System.out.println("Address:\t"+Emp_address);
		System.out.println("Mail ID:\t"+Mail_id);
		System.out.println("Employee ID:\t"+Emp_id);
		System.out.println("Mobile Number:\t"+Mobile_no);
		System.out.println("Basic Pay:\t"+basic_pay);
		System.out.println("DA\t"+da);
		System.out.println("HRA\t"+hra);
		System.out.println("PF\t"+pf);
		System.out.println("Staff fund is:\t"+staff_club_fund);
		System.out.println("Gross Salary\t"+gross_salary);
	}
}
//Fourth child class
class Pro_Manager extends Employee
{
	public void projectManager_Input()
	{
		super.input();
		da=basic_pay*.97;//calculating da
		hra=basic_pay*.10;//calculating hra
		 pf=basic_pay*.12;//calculating pf
		staff_club_fund=basic_pay*0.001;//calculating staff_club_fund
		gross_salary=basic_pay + hra;//calculating gross salary
		System.out.println("Name:\t"+Emp_name);
		System.out.println("Address:\t"+Emp_address);
		System.out.println("Mail ID:\t"+Mail_id);
		System.out.println("Employee ID:\t"+Emp_id);
		System.out.println("Mobile Number:\t"+Mobile_no);
		System.out.println("Basic Pay:\t"+basic_pay);
		System.out.println("DA\t"+da);
		System.out.println("HRA\t"+hra);
		System.out.println("PF\t"+pf);
		System.out.println("Staff fund is:\t"+staff_club_fund);
		System.out.println("Gross Salary\t"+gross_salary);
	}

}
//Main class
public class Assignment3
{
	public static void main(String args[])
	{
		//create object of classes and call the methods
		Scanner s=new Scanner(System.in);
		Employee em=new Employee();
		//em.input();
		//em.display();
		Programmer p=new Programmer();
		
		TeamLeader t=new TeamLeader();
		
		Assistant_Pro_Manager ap=new Assistant_Pro_Manager();
		
		Pro_Manager pm=new Pro_Manager();
		int temp=0;
		while(temp==0)
		{
		System.out.println("Enter your designation");
		System.out.println("1.Programmer\n");
		System.out.println("2.Team Leader\n");
		System.out.println("3.Assistant Project Manager\n");
		System.out.println("4.Project Manager\n");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			p.programmer_Input();
		break;
		case 2:
			t.teamleader_Input();
		break;
		case 3:
			ap.assistantManager_Input();
		break;
		case 4:
			pm.projectManager_Input();
		break;
		case 5:
			temp=1;
		break;

		}
    
		}
	
	}
	
}




