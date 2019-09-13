import java.util.*;
class Customer{
	private int cno;
	private String name;
	private int quantity;
	private float price;
	private double tot;
	private double discount;
	private double net;
	public Customer(){
		this.cno = 0;
		this.name = null;
		this.quantity = 0;
		this.price = 0;
	}
	public void input(){
		System.out.print("\tCustomer name:\t");
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		System.out.print("\tCustomer number:\t");
		cno= sc.nextInt();
		System.out.print("\tEnter the Quantity:\t");
		quantity = sc.nextInt();
		System.out.print("\tEnter the price:\t");
		price = sc.nextFloat();
	}
	public void cal(){
		tot = price * quantity;
		if(tot>=50000){
			discount = (25*tot)/100;
		}
		else if(tot>=25000&&tot<50000){
			discount = (10*tot)/100;
		}
		net = tot - discount;
	}
	public void show(){
		System.out.println("Csutomer name: "+name);
		System.out.println("Customer number: "+cno);
		System.out.println("Product quantity: "+quantity);
		System.out.println("Product price: "+price);
		System.out.println("Total: "+tot);
		System.out.println("Discount Applied: "+discount);
		System.out.println("NET AMOUNT: "+net);
	}
}
class CustomerDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\nEnter the number of Customers:\t");
		int n = sc.nextInt();
		Customer ob[] = new Customer[n];
		for(int i=0;i<n;i++){
			ob[i] = new Customer();
			System.out.print("\n\nCustomer "+(i+1));
			ob[i].input();
			ob[i].cal();
		}
		System.out.print("\n\nThe purchase details are:");
		for(int i=0;i<n;i++){
			ob[i].show();
		}
	}
}
