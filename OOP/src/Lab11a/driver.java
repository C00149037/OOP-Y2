package Lab11a;

import Lab3A.EasyIn;

public class driver {
	
	public static void main(String args[])
	{
		int noOfEmployees = 0;
		int option;
		boolean exit = false;
		boolean firstOffice = false;
		while (exit == false)
		{
			System.out.print("Please choose from the following options:\n\n");
			System.out.print("1. List all Offices.\n2. Create a new employee"
			+ " record.\n3. List all Employees");
			option = EasyIn.getInt();
			
			if(option == 1)
			{
				
			}
			else if(option == 2)
			{ 
				if(firstOffice == false)
				{
					office o1 = new office();
					firstOffice = true;
				}
					employee one = new employee();
					noOfEmployees ++;
					
				if(noOfEmployees != 1 && noOfEmployees % 2 != 0)
				{
					office o1 = new office();
				}
			}
			else if(option == 3)
			{
				
			}
			else if(option == 4)
			{
				exit = true;
			}
			
		}
		
	}

}
