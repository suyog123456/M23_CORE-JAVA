package com.cg.client;

import java.util.Scanner;
import java.util.List;
import com.cg.entities.Employee;
import com.cg.services.EmployeeService;
import com.cg.services.EmployeeServiceImpl;

public class Client 
{

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		Scanner s=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("ENTER THE CHOICE ");
			System.out.println("1. Retrieve a Particular Employee");
			System.out.println("2.Retrieve all Employees");
			System.out.println("3.Delete an Employee");
		    System.out.println("4.Insert an Employee");
		    System.out.println("5.Update an Employee");
		    System.out.println("-1:Exit");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
					System.out.println("Enter the ID to retrieve Emp");
					Employee e;
					try
					{
						e=service.GetEmployee(s.nextInt());
					}
					catch(Exception e1)
					{
						e=null;
					}
					if(e!=null)
						System.out.println(e);
					else
						System.out.println("Emp details not found");
			}
			break;
			case 2:
			{
				List<Employee>emp=service.GetEmployees();
				for(Employee i:emp)
				{
					System.out.println(i);
				}
			}
			break;
			case 3:
			{
				System.out.println("Enter the ID to delete emp");
				boolean success=service.deleteEmployee(s.nextInt());
				if(success)
				{
					System.out.println("Successfully deleted");
				}
				else
					System.out.println("Details not found");
			}
			break;
			case 4:
			{
				System.out.println("Enter the Emp ID & Name");
				
				Employee e=new Employee(s.nextInt(),s.nextLine());
				if(service.AddEmployee(e))
				{
					System.out.println("Successfully added");
				}
				else
					System.out.println("Something went wrong in creation");
			}
			break;
			case 5:
			{
				System.out.println("Enter the ID  of  emp that u want to update");
				Employee e=new Employee();
				e.setID(s.nextInt());
				System.out.println("Enter the update details");
				s.nextLine();
				e.setEname(s.nextLine());
				Employee e1=service.updateEmployee(e);
				
				if(e1!=null)
					System.out.println(e1);
				else
					System.out.println("Emp details not found");
			}
			break;
			case -1:
			{
				System.out.println("Thank You and Exit");
			}
			break;
			default:
			{
				System.out.println("Invalid choice");
			}
			break;
			}
		}while(choice>0);
		s.close();
	}
}