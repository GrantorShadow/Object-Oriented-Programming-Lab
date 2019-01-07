import java.util.*;
import java.io.*;
class data
{
    String name = new String();
    int age, bonus, experience;				//bonus in Rupees and experience in years
    double salary;										//salary in Rupees
    final String designation= "employee";
    data()
    {
    	name = "xyz";
        age = 0;
        bonus = 0;
        experience = 0;
        salary = 0;
    }
    
    void showData()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Name : " + name);
        System.out.println("age : " +age +" years");
        System.out.println("bonus : " + bonus + " Rupees");                                                                                                     
        System.out.println("experience : " + experience + " years");
        System.out.println("Display salary : " + salary + " Rupees");
        System.out.println("Designation : "+designation);
        System.out.println("------------------------------");
    }
    
}

class HOD extends data
{
    HOD()
    {
        super();
        name = "Dr Ghadekar";
        age = 50;
        bonus = 12800;
        experience = 13;
        salary = 60000;
    }
}

class DS extends data
{
    DS()
    {
        super();
        name = "Mr Kodgule";
        age = 48;
        bonus = 14000;
        experience = 12;
        salary = 50000;
    }
}

class DSGT extends data
{
    DSGT()
    {
        super();
        name = "Ms Geeta Talwar";
        age = 32;
        bonus = 10000;
        experience = 14;
        salary = 55000;
    }
}

public class ERP {

    static void validate(int input) {
        if (input < 1 || input > 3) {
            throw new ArithmeticException("Input is not valid");
        } else {
        	if(input!=3)
        		System.out.println("Welcome to VIT ERP SYSTEM");
        	else
        		System.out.println("Thanks for visiting");
        }
    }

    static void show(int input) {
        if (input < 1 || input > 3) {
            throw new ArithmeticException("Wrong Option is selected");
        } else {
            System.out.println("Your Choice is " + input);
        }
    }

    public static void main(String[] args) throws IOException {
        int choice, k = 0, b;
        HOD M1=new HOD();
        DS M2=new DS();
        DSGT M3=new DSGT();

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("--------------- Menu ---------------");
            System.out.println("\n 1. Show ERP data available &  details. \n 2. Details. \n 3. Exit.");
            System.out.println("Enter your choice : ");
            choice = input.nextInt();

            validate(choice);   // Function to handle Exception

            switch (choice) {
                case 1:
                    M1.showData();
                    M2.showData();
                    M3.showData();
                    break;

                case 2:
                    /* Code For File Handling */
                    String userName,
                     Details;
                    System.out.println("\n Enter Your Name : ");
                    userName = input.next();

                    FileWriter w = new FileWriter("E:\\UserInfo.txt");
                    BufferedWriter buffer = new BufferedWriter(w);

                    buffer.write("Username is : " + userName);
                    buffer.newLine();

                    System.out.println("Enter your Query : ");
                    System.out.println("\n 1. HOD IT \n 2. DS Prof \n 3. DSGT PROF ");
                    b = input.nextInt();

                    show(b);   // Function to handle Exception

                    System.out.println("Your data details : ");
                    if (b == 1) {
                        M1.showData();
                        
                        buffer.write("Your Choice is 1");
                        buffer.newLine();
                        buffer.write("Your data details : ");
                        buffer.newLine();
                        buffer.write("------------------------------");
                        buffer.newLine();
                        buffer.write("Name : Dr Ghadekar");
                        buffer.newLine();
                        buffer.write("age : 50 years");
                        buffer.newLine();
                        buffer.write("bonus : 12800 Rupees");
                        buffer.newLine();
                        buffer.write("experience : 13 years");
                        buffer.newLine();
                        buffer.write("salary : 60000 Rupees");
                        buffer.newLine();
                        buffer.write("Designation : employee");
                        buffer.newLine();
                        buffer.write("------------------------------");
                        buffer.newLine();   
                    }
                    if (b == 2) {
                        M2.showData();

                        buffer.write("Your Choice is 2");
                        buffer.newLine();
                        buffer.write("Your data details : ");
                        buffer.newLine();
                        buffer.write("------------------------------");
                        buffer.newLine();
                        buffer.write("Name : Mr Kodgule");
                        buffer.newLine();
                        buffer.write("age : 48 years");
                        buffer.newLine();
                        buffer.write("bonus : 14000 Rupees");
                        buffer.newLine();
                        buffer.write("experience : 12 years");
                        buffer.newLine();
                        buffer.write("salary : 50000 Rupees");
                        buffer.newLine();
                        buffer.write("Designation : employee");
                        buffer.newLine();
                        buffer.write("------------------------------");
                        buffer.newLine();                     }
                    if (b == 3) {
                        M3.showData();

                        buffer.write("Your Choice is 3");
                        buffer.newLine();
                        buffer.write("Your data details : ");
                        buffer.newLine();
                        buffer.write("------------------------------");
                        buffer.newLine();
                        buffer.write("Name : Ms Geeta Talwar");
                        buffer.newLine();
                        buffer.write("age : 32 years");
                        buffer.newLine();
                        buffer.write("bonus : 10000 Rupees");
                        buffer.newLine();
                        buffer.write("experience : 14 years");
                        buffer.newLine();
                        buffer.write("salary : 55000 Rupees");
                        buffer.newLine();
                        buffer.write("Designation : employee");
                        buffer.newLine();
                        buffer.write("------------------------------");
                        buffer.newLine();
                    }

                    buffer.close(); /* Closing File */

                    break;

                case 3:
                    k = 3;
                    break;
            }

        } while (k != 3);

    }
}
