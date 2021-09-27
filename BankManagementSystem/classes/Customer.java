package classes;

import java.lang.*;
import interfaces.*;

public class Customer implements AccountOperations
{
	private int nid;
	private String name;
	private int age;
	private String mobileNumber;
	private Account accounts[] = new Account[10];
	
	public Customer()
	{
		System.out.println("E-Customer");
	}
	public Customer(int nid, String name, int age, String mobileNumber)
	{
		System.out.println("P-Customer");
		this.nid = nid;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setMobileNumber(String mobileNumber){this.mobileNumber = mobileNumber;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	public int getAge(){return age;}
	public String getMobileNumber(){return mobileNumber;}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + nid);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Age: " + age);
		System.out.println("Customer Mobile Number: " + mobileNumber);
		
	}
	public boolean insertAccount(Account a)
	{
		boolean flag = false;
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
				System.out.println();
			}
			
		}
	}
	public Account searchAccount(int accountNumber)
	{
		Account flag = null;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountNumber() == accountNumber)
				{
					flag = accounts[i];
					break;
				}
			}
		}
		return flag;
	}
}