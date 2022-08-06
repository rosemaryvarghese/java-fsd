
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;


public class VirtualKeyRepo 
{
	public static void main(String[] args)
	{
		System.out.println(" LOCKEDME");
		System.out.println("   an app developed by Rose Mary Varghese");
		System.out.println("\n\n");
		System.out.println("WELCOME TO LOCKEDMe!!!\n");
		System.out.println("Please choose an operation you would like to perform.");
		File virtualkeyrepo = new File("virtualkeyrepo");
		virtualkeyrepo.mkdir();
		mainMenu(virtualkeyrepo);
	}
	private static void mainMenu(File virtualkeyrepo) 
	{
		 System.out.printf("1. View all Files"+ "%n" + "2. Operation Menu" + "%n" + "3. Exit Application" + "%n");
			System.out.println("\n");
			System.out.println("-----------------------------------");

		System.out.println("Enter Your Choice:");
		Scanner in=new Scanner(System.in);
		int mainMenuOption=in.nextInt();
		switch(mainMenuOption) 
		{
		case 1:
			String[] file=new String[50];
			file=virtualkeyrepo.list();
			if(file.length==0) 
			{
				System.out.println("There are no files in this repository!!");
			}
			else 
			{
				Arrays.sort(file);
				System.out.println("DISPLAYING THE FILES IN ASCENDING ORDER");
				System.out.println("\n");
				for(String name:file) 
				{
					System.out.println(name);
					
				}System.out.println("\n");
				System.out.println("------------------------------------------");
			}
			mainMenu(virtualkeyrepo);
			break;
			
			
		case 2:
			System.out.println("BUSINESS LEVEL OPERATIONS\n");
			System.out.println("Please choose the operation you would like to perform.");
			businessOperations(virtualkeyrepo);
			System.out.println("-----------------------------------");
			break;
		case 3:
			System.out.println("Thankyou for using LockedMe.\nExiting LockedMe........");
			System.out.println("-----------------------------------");
			break;
		default:
			System.out.println("ERROR:Enter Correct Option from above!!");
			mainMenu(virtualkeyrepo);
			System.out.println("-----------------------------------");
			break;
		}
	}
	private static void businessOperations(File virtualkeyrepo)
	{	System.out.printf("1. Add a new file"+ "%n" + "2. Delete an existing file" + "%n" + "3. Search for a file" + "%n" + "4. Return to the Main Menu");
	System.out.println("\n");

		System.out.println("Enter your choice: ");
		Scanner s=new Scanner(System.in);
		int busopoption=s.nextInt();
		switch(busopoption) 
		{
	
		case 1:
			System.out.println("WELCOME TO LOCKEDMe,\n");
			System.out.println("Adding a new file\n");
			System.out.println("Enter the name of the file you would like to add: ");
			String newFile=new Scanner(System.in).nextLine();
			File add=new File(virtualkeyrepo, newFile);
			try
			{
				if(add.createNewFile())
				System.out.println("File has been added");
				else
				System.out.println("Please choose a different name, this file name already exists");
		    } 
			catch(IOException e)
			{
				System.out.println("An Error has occured"+e.getMessage());
			}
			businessOperations(virtualkeyrepo);
			break;
	
		case 2:
			System.out.println("WELCOME TO LOCKEDMe,\n");
			System.out.println("Deleting an existing file");
			System.out.println("Enter the file name to be deleted :");
			String file=new Scanner(System.in).nextLine();
			File delete=new File(virtualkeyrepo, file);
			if(delete.exists()) 
			{
				if(delete.delete()) 
				{
					System.out.println("File has been deleted");
				} 
				else
					System.out.println("File deletion cannot be performed");
			} 
			else
				System.out.println("File mentioned does not exist");
			businessOperations(virtualkeyrepo);
				break;
	
		case 3:
			System.out.println("WELCOME TO LOCEKDdMe,\n");
			System.out.println("Search for an existing file");
			System.out.println("Enter the file name to be searched");
			String search=new Scanner(System.in).nextLine();
			File searchingg=new File(virtualkeyrepo, search);
			if(searchingg.exists()) 
			{
				System.out.println("File has been found");
			} 
			else
				System.out.println("File cannot be found!!");
			businessOperations(virtualkeyrepo);
				break;
	
		case 4:
			System.out.println("Navigating back to the main menu.....");
			mainMenu(virtualkeyrepo);
			break;
	
		default:
			System.out.println("ERROR: Enter a valid option!!");
			businessOperations(virtualkeyrepo);
			break;
		}
	}
	}
	