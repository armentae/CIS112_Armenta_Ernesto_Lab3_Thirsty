import java.util.Scanner; //program uses class Scanner

public class IfThirsty 
{

	// code base on flow chart
	public static void main(String[] args)
	{
		int thirsty;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hungry");
		System.out.println("Get in line");
		System.out.println("Buy lunch");
		System.out.println("If thirsty, enter 1 for yes and 2 for no: ");
		thirsty = input.nextInt(); //answered entered
		if (thirsty ==1){System.out.println("get coke");}
		else {System.out.println("get water");}
		System.out.println("Eat lunch");
		System.out.println("Return tray");
		System.out.println("Leave");
	}

}
