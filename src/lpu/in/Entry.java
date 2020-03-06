package lpu.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import cap.in.Linkedlist;
import io.calci.ConsoleInput;

public class Entry {

	public static void main(String[] args) 
	{
		
		
		Linkedlist<Employee> objlList = new Linkedlist<>();
		Employee objEmployee;
		
		
		int mainMenuTerminator = 0;
		int mainMenuOption = 0;

		char submenuTerminator = '@';
		char subMenuOption;
		while (mainMenuTerminator != 6)
       {
			System.out.println(
					"****************************************************************************************************");
			System.out.println("                             1 . Add an employee");
			System.out.println("                             2 . Display");
			System.out.println("                             3 . Navigate");
			System.out.println("                             4 . Edit");
			System.out.println("                             5 . Store");
			System.out.println("                             6 . Exit");
			System.out.println(
					"****************************************************************************************************");
			System.out.println("Please enter your desired option from above :");
            mainMenuOption = ConsoleInput.getInt();
		switch(mainMenuOption)
		{    
		 case 1:
		 {
			  while(submenuTerminator!='d')
			  {
		        System.out.println(
				"****************************************************************************************************");
		        System.out.println("  a . Manager");
		        System.out.println("  b . Engineer");
		        System.out.println("  c . Sales person");
		        System.out.println("  d . Back");
		        System.out.println("Please enter your desired option from above :");
		        System.out.println(
				"****************************************************************************************************");
		        subMenuOption = ConsoleInput.getChar();
			     switch(subMenuOption)
			     {
			        case 'a':
			        {
			        	dataInputManager(objlList);
			    	 
			         }
			        break;
			        
			        case 'b': 
			        {
						dataInputEngineer(objlList);
					}
					break;
					
			        case 'c': 
			        {
						dataInputSalesPerson(objlList);
					}
					break;
					
			        case 'd': 
			        {
						submenuTerminator = 'd';
					}
						break;
					default:
						System.out.println("...................Invalid option entry................");
			        }
			  }
			     
			     submenuTerminator = '1';
				 }// main menu case 1 ended
				break;
				
		 case 2:
		 {
			 while (submenuTerminator != 'e') {

					System.out.println(
							"****************************************************************************************************");
					System.out.println("  a . All");
					System.out.println("  b . Manager");
					System.out.println("  c . Engineer");
					System.out.println("  d . Sales person");
					System.out.println("  e . Back");
					System.out.println(
							"****************************************************************************************************");
					System.out.println("Please enter your desired option from above :");

					subMenuOption = ConsoleInput.getChar();

					switch (subMenuOption) 
					{
					  case 'a': 
					  {

						  objEmployee = (Employee) objlList.getFirst();
						  while (objEmployee != null) {
						  entryDisplay(objEmployee);
						  
						  objEmployee = (Employee) objlList.getNext();
						}
					   }
					  break;
					case 'b': 
					{
				         objEmployee = (Employee) objlList.getFirst();
						 while (objEmployee != null) 
						  {

							 {
								entryDisplay(objEmployee);
								
							}
							objEmployee = (Employee) objlList.getNext();
						}
					}
					break;
					
					case 'c':
					{
						objEmployee = (Employee) objlList.getFirst();
						while (objEmployee != null) {
							if (objEmployee instanceof Engineer) 
							{
								entryDisplay(objEmployee);
								
							}
							objEmployee = (Employee) objlList.getNext();
						}
					}
					break;
					
					case 'd': 
					{
						objEmployee = (Employee) objlList.getFirst();
						while (objEmployee != null) {
							if (objEmployee instanceof SalesPerson)
							{
								entryDisplay(objEmployee);
								
							}
							objEmployee = (Employee) objlList.getNext();
						}
					}
					break;
					
					case 'e': 
					{
						submenuTerminator = 'e';
					}
						break;
					default:
						System.out.println("...................Invalid option entry................");
					}
				}
				submenuTerminator = '@';
		}
	   break;//  main menu case 2 ended
	   
		 case 3: {

				while (submenuTerminator != 'e') {
					System.out.println(
							"****************************************************************************************************");
					System.out.println("  a . First");
					System.out.println("  b . Next");
					System.out.println("  c . Previous");
					System.out.println("  d . Last");
					System.out.println("  e . Back");
					System.out.println(
							"****************************************************************************************************");
					System.out.println("Please enter your desired option from above :");
					subMenuOption = ConsoleInput.getChar();
					switch (subMenuOption) {
					case 'a': 
					{
						objEmployee = (Employee) objlList.getFirst();
						entryDisplay(objEmployee);
					}
						break;
					case 'b': 
					{
						objEmployee = (Employee) objlList.getNext();
						entryDisplay(objEmployee);
					}
						break;
					case 'c': 
					{
						objEmployee = (Employee) objlList.getPrevious();
						entryDisplay(objEmployee);
					}
						break;
					case 'd': 
					{
						objEmployee = (Employee) objlList.getLast();
						entryDisplay(objEmployee);
					}
						break;
					case 'e': 
					{
						submenuTerminator = 'e';
					}
						break;
					default:
						System.out.println("...................Invalid option entry................");
					}
				}
				submenuTerminator = '@';
			}
				break;//  main menu case 3 ended
				
		 case 4: {
				while (submenuTerminator != 'c') {
					System.out.println(
							"****************************************************************************************************");
					System.out.println("  a . Delete by name");
					System.out.println("  b . Update all data");
					System.out.println("  c . Back");
					System.out.println(
							"****************************************************************************************************");
					System.out.println("Please enter your desired option from above :");

					subMenuOption = ConsoleInput.getChar();

					switch (subMenuOption)
					{
					 case 'a':
					   {
						System.out.println("Enter the name :");
						String namedelete=ConsoleInput.getString();
						objEmployee = (Employee) objlList.getFirst();
						int i=0;
						  while (objEmployee != null)
						  {
							  
							  if(objEmployee.getName().contentEquals(namedelete))
							  {
								  objlList.deleteNode(i);
								  System.out.println("Deletion is done successfully***************");
								 
								  
							  }
						    
						     objEmployee = (Employee) objlList.getNext();
						     i++;
						  }						

					   }
					   break;
					 case 'b': 
					 {
						 System.out.println("Enter the name you want to update:");
							String namedelete=ConsoleInput.getString();
							objEmployee = (Employee) objlList.getFirst();
							int i=0;
							
							  while (objEmployee != null)
							  {
								  
								  if(objEmployee.getName().contentEquals(namedelete))
								  {
									  if (objEmployee instanceof Engineer) 
										{
										  dataInputManager(objlList);
											
										}
									  else if (objEmployee instanceof Manager) 
										{
										  dataInputEngineer(objlList);
											
										}
									  else
									  {
										  if (objEmployee instanceof SalesPerson) 
											{
											  dataInputSalesPerson(objlList);
												
											}
									  }

									  
									  System.out.println("Updated is done successfully***************");
									 
									  
								  }
							    
							     objEmployee = (Employee) objlList.getNext();
							     i++;
							  }						

					}
					break;
					
					case 'c': 
					{
						submenuTerminator = 'c';
					}
					break;
					default:
						System.out.println("...................Invalid option entry................");
					}
				}
				submenuTerminator = '@';
			}
				break;//  main menu case 4 ended
				
				
		 case 5:
		 {
			
			 while (submenuTerminator != 'c')
			 {
					System.out.println(
							"****************************************************************************************************");
					System.out.println("  a . Store the data ");
					System.out.println("  b . Load the data");
					System.out.println("  c . Back");
					System.out.println(
							"****************************************************************************************************");
					System.out.println("Please enter your desired option from above :");
					
					subMenuOption = ConsoleInput.getChar();

				switch (subMenuOption)
				{
				
					case 'a':
					   {
						   Employee empdb = (Employee) objlList.getFirst();
						   Connection connection=null;
						   PreparedStatement psInsert=null;
								  
								   try
								    		  {
									 
									   while (empdb != null) 
										  {
										   connection=DriverManager.getConnection(
										    		  //connection_url
										    		  "jdbc:mysql://localhost:3306/ibm",
										    		  //root
										    		  "root",
										    		  //password
										    		  "Sai@1234"
										    		  );
									   
										   psInsert=connection.prepareStatement("insert into eng values(?,?,?,?,?,?)");
										   psInsert.clearParameters();
								        	 psInsert.setString(1, empdb.getName());
									          psInsert.setString(2, empdb.getAddress());
									          psInsert.setInt(3, empdb.getAge());
									          psInsert.setString(4,Character.toString(empdb.getGender()));
									          psInsert.setFloat(5, empdb.getBasicsalary());
									          if(empdb instanceof Manager)
									          {
									        	  Manager objManager = (Manager) empdb;
									        	  float hra=objManager.getHumanResourses();
										        	
										          psInsert.setFloat(6, hra);
									        	  
									          }
										        	 
										        	
							    	          psInsert.executeUpdate();
								        	
								       
								         
								         objEmployee = (Employee) objlList.getNext();
									}     
								         
								         
								         
								     }
								   catch (SQLException e) 
								      {
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
								  
						   
						   
						  
					}
					break;
					
					case 'b':
						
					break;
					default:
						System.out.println("...................Invalid option entry................");
					
					
					}
					
			 }
			 submenuTerminator = '@';
			 
			 
		 }
		
		 
		 break;
			 
				
				
				
				
				
				
				
				
			}//main switch
				
			        
			 
			     
			     
			     }//main while
			  
			  } //p s v m



	private static void dataInputSalesPerson(Linkedlist<Employee> objlList) {
		System.out.print("Enter the name : ");
		String name = ConsoleInput.getString();

		System.out.print("Enter the Address : ");
		String address = ConsoleInput.getString();

		System.out.print("Enter the Age : ");
		int age = ConsoleInput.getInt();

		System.out.print("Enter the gender as M or F : ");
		char gender = ConsoleInput.getChar();

		System.out.print("Enter the Basic salary : ");
		float basicSalary = ConsoleInput.getFlost();

		System.out.println("Enter the commission allowance :");
		float commission = ConsoleInput.getFlost();

		SalesPerson sP = new SalesPerson(name, address, age, gender, basicSalary, commission);
		objlList.addNode(sP);
	}



	private static void dataInputEngineer(Linkedlist<Employee> objlList) {
		System.out.print("Enter the name : ");
		String name = ConsoleInput.getString();

		System.out.print("Enter the Address : ");
		String address = ConsoleInput.getString();

		System.out.print("Enter the Age : ");
		int age = ConsoleInput.getInt();

		System.out.print("Enter the gender as M or F : ");
		char gender = ConsoleInput.getChar();

		System.out.print("Enter the Basic salary : ");
		float basicSalary = ConsoleInput.getFlost();

		System.out.println("Enter the overtime allowance :");
		float overT = ConsoleInput.getFlost(); /* overT variable depicts Overtime allowances */

		Engineer engineerData = new Engineer(name, address, age, gender, basicSalary, overT);
		objlList.addNode(engineerData);
	}



	private static void dataInputManager(Linkedlist<Employee> objlList) {
		System.out.print("Enter the name : ");
		String name = ConsoleInput.getString();

		System.out.print("Enter the Address : ");
		String address = ConsoleInput.getString();

		System.out.print("Enter the Age : ");
		int age = ConsoleInput.getInt();

		System.out.print("Enter the gender as M or F : ");
		char gender = ConsoleInput.getChar();

		System.out.print("Enter the Basic salary : ");
		float basicSalary = ConsoleInput.getFlost();

		System.out.println("Enter the Human resourse allowance :");
		float hra = ConsoleInput.getFlost(); /* hra variable depicts Human resources allowance */

		Manager managerData = new Manager(name, address, age, gender, basicSalary, hra);
		objlList.addNode(managerData);
		// objlList.addNode(managerData);
	}
		     
		

	public static void commonDisplay(Employee objEmployee) {
		System.out.print("Name : ");
		System.out.println(objEmployee.getName());

		System.out.print("Address : ");
		System.out.println(objEmployee.getAddress());

		System.out.print("Age : ");
		System.out.println(objEmployee.getAge());

		System.out.print("Gender : ");
		System.out.println(objEmployee.getGender());

		System.out.print("Basic_salary : ");
		System.out.println(objEmployee.getBasicsalary());

	}

	public static void entryDisplay(Employee objEmployee) {

		if (objEmployee instanceof Manager) {
			commonDisplay(objEmployee);
			Manager objManager = (Manager) objEmployee;

			System.out.print("Human resourses allowances : ");
			System.out.println(objManager.getHumanResourses());
		}
		if (objEmployee instanceof Engineer) {
			commonDisplay(objEmployee);
			Engineer objEngineer = (Engineer) objEmployee;

			System.out.print("Over time allowance : ");
			System.out.println(objEngineer.getOverTime());
		}
		if (objEmployee instanceof SalesPerson) {
			commonDisplay(objEmployee);
			SalesPerson objSalesPerson = (SalesPerson) objEmployee;

			System.out.print("Commission : ");
			System.out.println(objSalesPerson.getCommission());
		}
	}
}
