package epam4.cleancode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class App
{
	private static PrintStream myout;
	private static Scanner sc;
	public static void getInterest() {
		myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("enter principal amount ");
		double p=sc.nextDouble();
		myout.print("enter time period ");
		double t= sc.nextDouble();
		myout.print("Enter rate of interest ");
		double r=sc.nextDouble();
		Interest i=new Interest(p,t,r);
		myout.print("\noption 1- calculate simple interest\nOption 2- Calculates the compound interest\nEnter option ");
		int  op=sc.nextInt();
		if(op==1) {
			myout.print("Simple Interest is "+i.getSimpleinterest());
		}
		else {
			myout.print("Compound Interest is "+i.getCompoundInterest());
		}
	}
	public static void getCostofBuliding() {
		myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("• Option 1-standard materials\n• Option 2-use above standard materials\n• Option 3-high standard material\n• Option 4-high standard material and fully automated home\n Enter the type material requried for type of constuction of buliding ");
		int op2=sc.nextInt();
		myout.print("Enter the area of the land to estimate the cost of buliding ");
		double area=sc.nextDouble();
		Building b=new Building(area,op2);
		myout.print("Cost for construction of buliding is "+b.getCostOfBuilding());
	}
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
	    PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	sc =new Scanner(System.in);
        while(true) {
        	myout.print("\n1 option one to claculate Interest\n2 option to calculate the cost for buliding a buliding\n3 option to exit\n");
        	myout.print("Enter option ");
        	int option = sc.nextInt();
        	switch(option) {
        	case 1:
        		getInterest();
        		break;
        	case 2:
        		getCostofBuliding();
        		break;
        	case 3:
        		sc.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		myout.print("Enter valid opion");
			myout.close();
	}
}

