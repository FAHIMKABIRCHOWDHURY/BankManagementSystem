import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;
import java.io.*;


public class Start
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println("-------------------------------------------");
		System.out.println("Welcome to XYZ Bank");
		System.out.println("-------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("-------------------------------------------");
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Customer-Account Management");
			System.out.println("\t4. Account Transactions");
			System.out.println("\t5. Exit");
		
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = bfr.readLine();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(b.insertEmployee(e1))
							{
								System.out.println("Employee Inserted.. EmpId: "+ e1.getEmpId());
							}
							else
							{
								System.out.println("Employee Can Not be Inserted... EmpId: " + e1.getEmpId());
							}
							
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Existing Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(b.removeEmployee(e2))
								{
									System.out.println("Employee Removed..... EmpId: " + e2.getEmpId());
								}
								else
								{
									System.out.println("Employee Not Removed..... EmpId: " + e2.getEmpId());
								}
							}
							else
							{
								System.out.println("Employee Not Found..... EmpId: " + empId2);
							}
							break;
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Existing Employee");
							System.out.println("-------------------------------------------");
						
							System.out.print("Enter Employee Id: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("Employee Found.....");
								System.out.println("Employee Id: " + e3.getEmpId());
								System.out.println("Employee Name: " + e3.getName());
								System.out.println("Employee Salary: " + e3.getSalary());
								System.out.println();
							}
							else
							{
								System.out.println("Employee Not Found..... EmpId: " + empId3);
							}
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Employees");
							System.out.println("-------------------------------------------");
							
							b.showAllEmployees();							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = bfr.readLine();
							System.out.print("Enter Customer Age: ");
							int age1 = sc.nextInt();
							System.out.print("Enter Customer MobileNumber: ");
							String mobileNumber1 = sc.next();
							
							
							Customer c1 = new Customer(nid1, name1, age1, mobileNumber1);
							
							if(b.insertCustomer(c1))
							{
								System.out.println("Customer Inserted.. NID: "+ c1.getNid());
							}
							else
							{
								System.out.println("Customer Can Not be Inserted... NID: " + c1.getNid());
							}
							
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Existing Customer");
							System.out.println("-------------------------------------------");
							
							
							break;
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Existing Customer");
							System.out.println("-------------------------------------------");
						
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Customers");
							System.out.println("-------------------------------------------");
							
							b.showAllCustomers();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
				case 3:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer-Account Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Create an Account for a Customer");
					System.out.println("\t2. Remove an Account of a Customer");
					System.out.println("\t3. Search an Account of a Customer");
					System.out.println("\t4. Show All Accounts of a Customer");
					System.out.println("\t5. Go Back");
					
					
					System.out.print("Your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Account");
							System.out.println("-------------------------------------------");
							
							Account a1 = null;
							
							System.out.println("There are Two Types of Accounts: ");
							System.out.println("\t 1. SavingsAccount");
							System.out.println("\t 2. FixedAccount");
							System.out.println("\t 3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Creating a Savings Account");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Account Number: ");
								int an1 = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double b1 = sc.nextDouble();
								System.out.print("Enter Interest Rate: ");
								double ir1 = sc.nextDouble();
								
								SavingsAccount sa = new SavingsAccount(an1, b1, ir1);
								
								a1 = sa;
							}
							else if(type == 2)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Creating a Fixed Account");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Account Number: ");
								int an2 = sc.nextInt();
								System.out.print("Enter Account Balance: ");
								double b2 = sc.nextDouble();
								System.out.print("Enter Tenure Year: ");
								int ty2 = sc.nextInt();
								
								FixedAccount fa = new FixedAccount(an2, b2, ty2);
								
								a1 = fa;
							}
							else if(type == 3)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Going Back................");
								System.out.println("-------------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------------");
								System.out.println("Invalid Option...............");
								System.out.println("-------------------------------------------");
							}
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(nid1);
							
							if(c1 != null)
							{
								if(c1.insertAccount(a1))
								{
									System.out.println("Account Inserted... Account Number: "+ a1.getAccountNumber()+ ".... NID: " + c1.getNid());
								}
							}
							else
							{
								System.out.println("Account Can Not be Inserted... Account Number: "+ a1.getAccountNumber());
							}
							
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Existing Account");
							System.out.println("-------------------------------------------");
							
							
							break;
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Existing Account");
							System.out.println("-------------------------------------------");
						
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Accounts");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid4 = sc.nextInt();
							
							Customer c4 = b.searchCustomer(nid4);
							
							if(c4 != null)
							{
								c4.showAllAccounts();
							}
							else
							{
								System.out.println("Invalid Customer NID");
							}
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
				case 4:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Account Transactions");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Deposit Money");
					System.out.println("\t2. Withdraw Money");
					System.out.println("\t3. Show Transaction History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Deposit Money");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.print("Enter Account Number: ");
								int an = sc.nextInt();
								
								Account a = c1.searchAccount(an);
								
								if(a != null)
								{
									System.out.println("Previous Balance: " + a.getBalance());
									System.out.print("Enter Deposit Amount: ");
									double am1 = sc.nextDouble();
									
									if(a.deposit(am1))
									{
										System.out.println("Deposit Successful");
										String msg = am1 + " Deposited in " + a.getAccountNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Can Not Deposit");
									}
									System.out.println("Current Balance: " + a.getBalance());
								}
								else
								{
									System.out.println("Invalid Account Number" + an);
								}
							}
							else
							{
								System.out.println("Invalid Customer NID" + nid1);
							}
							
							
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Withdraw Money");
							System.out.println("-------------------------------------------");
			
							
							System.out.print("Enter Customer NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = b.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.print("Enter Account Number: ");
								int an = sc.nextInt();
								
								Account a = c2.searchAccount(an);
								
								if(a != null)
								{
									System.out.println("Previous Balance: " + a.getBalance());
									System.out.print("Enter Withdraw Amount: ");
									double am1 = sc.nextDouble();
									
									if(a.withdraw(am1))
									{
										System.out.println("Withdraw Successful");
										String msg = am1 + " Withdrawn from " + a.getAccountNumber();
										frwd.writeInFile(msg);
									}
									else
									{
										System.out.println("Can Not Withdraw");
									}
									System.out.println("Current Balance: " + a.getBalance());
								}
								else
								{
									System.out.println("Invalid Account Number" + an);
								}
							}
							else
							{
								System.out.println("Invalid Customer NID" + nid2);
							}
								
							break;
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Transactions");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("Going Back................");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option...............");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
				
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...............");
					System.out.println("-------------------------------------------");
					break;
			}
		}
	}
}