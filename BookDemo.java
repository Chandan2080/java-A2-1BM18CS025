import java.util.*;
class Book {
	String name, author;
	int price, num_pages;
	Book(){//Default constructor
		this.name = "Invalid";
		this.author = "Invalid";
		this.price = 0;
		this.num_pages = 0;
	}
	void set(String name, String author, int price, int num_pages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.num_pages = num_pages;
	}
	void get(){
		System.out.print("\n\nThe Book details are:");
		System.out.print("\n\tBook name:\t"+name);
		System.out.print("\n\tBook Author:\t"+author);
		System.out.print("\n\tBook price:\t"+price);
		System.out.print("\n\tBook pages:\t"+num_pages);
	}
	public String toString(){
		String a = "\n\tBook name:\t";
		String b = "\n\tBook Author:\t";
		String c = "\n\tBook price:\t";
		String d = "\n\tBook pages:\t";
		return (a+name+b+author+c+price+d+num_pages);
	}
}
class BookDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of books:");
		int n = sc.nextInt();
		String nam, aut;
		int pr, page;
		Book b[] = new Book[n];
		for(int i=0;i<n;i++){
			b[i] = new Book();
		}
		System.out.println("\n\nEnter the book details:");
		for(int i=0;i<n;i++){
			System.out.print("\n\nBook "+(i+1)+":");
			System.out.print("\tBook name?  ");
			nam = sc.next();
			System.out.print("\tBook author?  ");
			aut = sc.next();
			System.out.print("\tBook price?  ");
			pr = sc.nextInt();
			System.out.print("\tBook pages?  ");
			page = sc.nextInt();
			b[i].set(nam, aut, pr, page);
		}
		System.out.println("\n\n\nThe book details are:");
		for(int i=0;i<n;i++){
			
			System.out.println("Book "+(i+1)+":  "+b[i]);
		}
	}
}


/*OUTPUT:
Enter the number of books:2


Enter the book details:


Book 1:	Book name?  CoA	
	Book author?  BMSCE 
	Book price?  100
	Book pages?  200


Book 2:	Book name?  Java
	Book author?  BMSCE
	Book price?  200
	Book pages?  300



The book details are:
Book 1:  
	Book name:	CoA
	Book Author:	BMSCE
	Book price:	100
	Book pages:	200
Book 2:  
	Book name:	Java
	Book Author:	BMSCE
	Book price:	200
	Book pages:	400
*/
