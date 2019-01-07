#include<iostream>
#include<string.h>
#include<stdlib.h>
#define MAX 10

using namespace std;

class ERP{
	
	private:
	char qual[MAX];
	int empid,DOJ;
	float sal;
	
	public:
	char name[MAX],desig[MAX];
	int age;
	void trash();
	void modify();
	void input();//Function to input data.
	void add_space();
	
	void display()
	{
		cout<<"EMPLOYEE NAME:"<<name<<"\nEMPLOYEE AGE:"<<age<<"\nEMPLOYEE ID:"<<empid<<"\nEMPLOYEE QUALIFICATION:"<<qual<<"\nEMPLOYEE DOJ:"<<DOJ<<"\nEMPLOYEE SAL"<<sal;
	}

	ERP()//Default constructor
	{
	strcpy(qual,"N/A");
	strcpy(name,"N/A");
	strcpy(desig,"N/A");
	age=00;
	empid=0000;
	DOJ=0000;
	sal=0000.00;
	}

	ERP(char n[],char q[],int eid,int join,float s,int a,char d[])//Parameterized Constructor
	{
	strcpy(name,n);
	strcpy(qual,q);
	empid=eid;
	DOJ=join;
	sal=s;
	age=a;
	strcpy(desig,d);
	}
	};


void ERP::input()
{
	cout<<"ENTER NAME"<<endl;
	cin>>name;
	cout<<"ENTER AGE:"<<endl;
	cin>>age;
	cout<<"ENTER EMPID:"<<endl;
	cin>>empid;
	cout<<"ENTER DOJ:"<<endl;
	cin>>DOJ;
	cout<<"ENTER QUALIFICATION:"<<endl;
	cin>>qual;
	cout<<"ENTER SALARY"<<endl;
	cin>>sal;
	cout<<"ENTER DESIGNATION:"<<endl;
	cin>>desig;
}

void ERP::modify()
{
	cout<<"ENTER NEW NAME:"<<endl;
	cin>>name;
	cout<<"ENTER NEW SALARY:"<<endl;
	cin>>sal;
	cout<<"NEW DESIGNATION:"<<endl;
	cin>>desig;
}

void ERP::trash()
{
	cout<<"ENTER EMPID TO DELETE"<<endl;
	cout<<enl;
	cin>>empid;
	
}

void ERP::add_space()
{
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
}			

int main()
{
	int choice,brk,n;
	cout<<"VIT PUNE COLLEGE ERP SYSTEM "<<endl;
	cout<<endl;
	ERP("Max","Ph.d",171123,181217,120000,45,"Lecturer") ;
	ERP V1;
	increment V2;	
	do
	{
		cout<<endl;
		cout<<"PLEASE ENTER YOUR CHOICE:"<<endl;
		cout<<"PRESS 1 FOR INPUTTING DATA:"<<endl;
		cout<<"PRESS 2 FOR MODIFYING DATA:"<<endl;
		cout<<"PRESS 3 FOR DISPLAYING CURRENT DATA:"<<endl;
		cout<<"PRESS 4 FOR DELETING DATA:"<<endl;
		cout<<"PRESS 9 FOR EXIT:"<<endl;
		cin>>choice;
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
				cout<<"DATA INPUT CHOICE IS SELECTED"<<endl;
				V1.display();
				ERP(); //Call default constructor which is vacant
				V1.add_space();
				break;
				
				case 2:
				cout<<"DATA MODIFICATION SELECTED"<<endl;
				V1.modify();
				ERP("Max","Ph.d",171123,181217,120000,45,"Lecturer");
				//Call parameterized constructor here.
				V1.display();
				V1.add_space();
				break;

				case 3:
				cout<<"DISPLAY OF CURRENT DATA"<<endl;
				ERP("Max","Ph.d",171123,181217,120000,45,"Lecturer");//Call parameterized constructor here;
				V1.display();
				V1.add_space();
				break;
				
				case 4:
				cout<<"DELETION OF DATA"<<endl;
				V1.trash();
				ERP("Max","Ph.d",171123,181217,120000,45,"Lecturer");//Call parameterized constructor 					with EMPID being passed to show data
				V1.display();
				cout<<endl;
				cout<<"data is cleared"<<endl;
				V1.add_space();
				break;
				
				case 9:
				return 0;
				break;
				
				default:
				cout<<"case INVALID";
				V1.add_space();
				return 0;
				
				break;
				}
				
	}while(brk !=1);
//clrscr();
return 0;
}


	



