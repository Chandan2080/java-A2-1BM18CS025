/*Develop a Java program to create a class Bank that maintains two kinds of account for its customers, one called savings account and the other current account. The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is imposed.
Create a class Account that stores customer name, account number and type of account. From this derive the classes Curr-acct and Sav-acct to make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:
Accept deposit from customer and update the balance.
Display the balance.
Compute and deposit interest
Permit withdrawal and update the balance
Check for the minimum balance, impose penalty if necessary and update the balance.
*/
import java.util.*;
class Bank{
	double bal = 0;
	String name;
	long accno;
	Bank(){//constructor
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter the customer name:\t");
		name = sc.next();
		System.out.print("Enter the Account Number:\t");
		accno = sc.nextLong();
		System.out.print("Enter the Account Balance:\t");
		bal = sc.nextDouble();
	}
	void display(){
		System.out.println("Customer Name:\t"+name);
		System.out.println("Account Number:\t"+accno);
		System.out.println("Accoutn Balance:\t"+bal);
	}
	void deposit(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the amount to be deposited:\t");
		double amt = sc.nextDouble();
		bal += amt;
	}
	void withdraw(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the amount to be withdrawed:\t");
		double amt = sc.nextDouble();
		if(amt<=bal){
			bal -= amt;
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
	void interest() {}
	void check() {}
}
class Savings extends Bank{
	Savings(){
		super();
	}
	void interest(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the time (in years):\t");
		float time = sc.nextFloat();
		System.out.print("\nThe Rate of Interest is fixed as 3% per annum!!");
		double interest = (bal * time * 3)/100;
		System.out.print("\nInterest:\t"+interest);
		bal += interest;
		System.out.print("Updated Balance:\t"+bal);
	}
	void display(){
		super.display();
	}
}
class Current extends Bank{
	Current(){
		super();
	}
	final int min = 10000;
	void check(){
		if(bal<min){
			System.out.print("\n\nYour Balance falls below the minimum balance of "+min);
			System.out.print("\nHence, a service charge of Rs.100/- is imposed");
			bal += 100;
		}
	}
	void display(){
		super.display();
	}
}
class BankDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ch, acc;
		System.out.println("1 : Savings Account");
		System.out.println("2 : Current Account");
		System.out.print("What is your account type?\t");
		acc = sc.nextInt();
		Bank ref = null;
		if((acc==1)||(acc==2)){
			if(acc==1){
				ref = new Savings();
			}
			else{
				ref = new Current();
			}
			do{
				System.out.println("\n1 : Deposit");
				System.out.println("2 : Withdraw");
				System.out.println("3 : Display the details");
				if(acc==1){
					System.out.println("4 : Calculate Interest");
				}
				else{
					System.out.println("4 : Check Minimum Balance");
				}
				System.out.println("5 : Exit");
				System.out.print("Enter your choise:   ");
				ch = sc.nextInt();
				switch(ch){
					case 1: ref.deposit();
							break;
					case 2: ref.withdraw();
							break;
					case 3: ref.display();
							break;
					case 4: if(acc==1){
								ref.interest();
							}
							else{
								ref.check();
							}
							break;
					case 5: break;
					default:System.out.println("INVALID CHOISE!!");
				}//switch
			}while(ch!=5);
		}
		else{
			System.out.println("INVALID CHOISE!!!");
		}
	}
}
