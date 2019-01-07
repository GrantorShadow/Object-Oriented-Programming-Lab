import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;  

 class ERP1{

	String qual;
	private int empid,DOJ;
	
	private static double sal;
	
	String name,desig;
	public int age;
	public static Scanner sc=new Scanner(System.in);
		
	ERP1()
	{
		String qual="N/A";
		String name="N/A";
		String desig="N/A";
		age=00;
		empid=0000;
		DOJ=0000;
		sal=0000.00;
	}
	
	ERP1(String n,int eid,int join,float s,int a)//Parameterized Constructor
	{
		name=n;
		qual="Ph.D";
		empid=eid;
		DOJ=join;
		sal=s;
		age=a;
		desig="Lecturer";
	}
	
	void input()
	{
		
		System.out.println("ENTER NAME:");
		name=sc.next();
		System.out.println("ENTER AGE:");
		age=sc.nextInt();
		System.out.println("ENTER EMPID:");
		empid=sc.nextInt();
		System.out.println("ENTER DOJ:");
		DOJ=sc.nextInt();
		System.out.println("ENTER QUALIFICATION:");
		qual=sc.next();
		System.out.println("ENTER SALARY:");
		sal=sc.nextInt();
		System.out.println("ENTER DESIGNATION:");
		desig=sc.next();
	}
	
	void modify()
	{
		System.out.println("ENTER NAME:");
		name=sc.next();
		System.out.println("ENTER AGE:");
		age=sc.nextInt();
		System.out.println("ENTER EMPID:");
		empid=sc.nextInt();
		System.out.println("ENTER DOJ:");
		DOJ=sc.nextInt();
		System.out.println("ENTER QUALIFICATION:");
		qual=sc.next();
		System.out.println("ENTER SALARY:");
		sal=sc.nextInt();
		System.out.println("ENTER DESIGNATION:");
		desig=sc.next();
	}

	
	void trash()
	{
		System.out.println("ENTER EMPID TO DELETE\n");
		empid=sc.nextInt();
	}

	void add_space()
	{
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");		
	}
	
	void display()
	{
		System.out.println("EMPLOYEE NAME: "+name+"\nEMPLOYEE AGE: "+age+"\nEMPLOYEE ID: "+empid+"\nEMPLOYEE QUALIFICATION: "+qual+"\nEMPLOYEE DOJ:"+DOJ+"\nEMPLOYEE SAL: "+sal);
	}

	
	
 public static class increment extends ERP1
{
	public int workday,holiday,inc,slab;
	public int total_inc;
	public void calc(int workday,int holiday)
	{
		inc=(workday-holiday);
		System.out.println("ENTER YOUR EMP SLAB\n");
		slab=sc.nextInt();
		total_inc=slab*inc;
	}
	public void display()
	{
		System.out.println("INCREMENT IS:"+(total_inc+sal));
	}

}

public static void main(String[] args)
{
	int choice,brk,n;
	int hol,wh;
	System.out.println("VIT PUNE COLLEGE ERP SYSTEM\n\n\n");
	
	ERP1 V1 = new ERP1("Ram Charan",171123,181271,120000,45);
	increment V2 = new increment();	
	
	do
	{
		System.out.println("PLEASE ENTER YOUR CHOICE:\n");
		System.out.println("PRESS 1 FOR INPUTTING DATA:\n");
		System.out.println("PRESS 2 FOR MODIFYING DATA:\n");
		System.out.println("PRESS 3 FOR DISPLAYING CURRENT DATA:\n");
		System.out.println("PRESS 4 FOR DELETING DATA:\n");
		System.out.println("PRESS 5 FOR CALCULATING INCREMENT:\n");
		System.out.println("PRESS 9 FOR EXIT:\n");
		choice=sc.nextInt();
		if(choice == 9)
		{
			brk=1;
		}
		else
		{
			brk=0;
		}
		switch (choice)
		{
			case 1:
				System.out.println("DATA INPUT CHOICE IS SELECTED");
				V1.display();
				V1.modify();
				V1.add_space();
				break;

			case 2:
				System.out.println("DATA MODIFICATION SELECTED");
				V1.modify();
				V1.display();
				V1.add_space();
				break;

			case 3:
				System.out.println("DISPLAY OF CURRENT DATA");	
				V1.display();
				V1.add_space();
				break;
					
			case 4:
				System.out.println("DELETION OF DATA");
				V1.trash();
				V1.display();
				System.out.println("data is cleared");
				V1.add_space();
				break;
				
			case 5:
				System.out.println("DISPLAY OF INCREMENT");
				System.out.println("ENTER WORK HRS AND HOLS");
				wh=sc.nextInt();
				hol=sc.nextInt();;
				V2.calc(wh,hol);
				V2.display();
				V1.add_space();
				break;
				
			case 9:
				break;
				
			default:
				System.out.println("case INVALID");
				V1.add_space();
				break;
				
		}
				
	}while(brk !=1);
  }
}









