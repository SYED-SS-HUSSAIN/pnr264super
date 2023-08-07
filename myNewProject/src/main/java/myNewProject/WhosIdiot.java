package myNewProject;

import java.util.Scanner;

public class WhosIdiot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter the game of Who's idiot");
		System.out.println("please enter a number from 1-3 to know whos is idiot");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("ravi is  idiot");
				break;
			case 2:
				System.out.println("ravi is obviosly an idiot");
				break;
			case 3:
				System.out.println("you are fuckin idiot");
		}
		sc.close();
		

	}

}
